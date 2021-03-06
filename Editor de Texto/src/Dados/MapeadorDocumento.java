/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

//! Declaração do pacote
package Dados;

//! Importações necessárias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//! Classe para mapeamento SQL do Usuário
public class MapeadorDocumento {

    private Connection con;
    private MapeadorUsuario mapeadorUsuario;
    private MapeadorFormatacao mapeadorFormatacao;
    
    private static MapeadorDocumento mapeadorDocumento;
    
    public static MapeadorDocumento getMapeadorDocumento(Connection con){
        if (mapeadorDocumento == null)
            mapeadorDocumento = new MapeadorDocumento(con);
        return mapeadorDocumento;
    }

    private MapeadorDocumento(Connection con) {
        this.con = con;
        mapeadorUsuario = MapeadorUsuario.getMapeadorUsuario(con);
        mapeadorFormatacao = MapeadorFormatacao.getMapeadorFormatacao(con);
    }
    
    public void put (Documento documento) throws SQLException {
        if (this.get(documento.getNomeDocumento()) != null) {
            atualizaDocumentoExistente(documento);
        } else {
            insereNovoDocumento(documento);
        }
    }

    private void insereNovoDocumento(Documento documento) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("INSERT INTO DOCUMENTO (NOME, FILEPATH, USUARIO, FORMATACAO) "
                + "VALUES (?, ?, ?, ?)");
        try {
            stmt.setString(1, documento.getNomeDocumento());
            stmt.setString(2, documento.getFilePath());
            stmt.setString(3, documento.getUsuario().getNome());
            stmt.setString(4, documento.getFormatacao().getNomeFormatacao());
            stmt.execute();
        } finally {
            stmt.close();
        }
    }

    private void atualizaDocumentoExistente(Documento documento) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("UPDATE DOCUMENTO SET FILEPATH=?,USUARIO=?, "+
			"FORMATACAO=? WHERE NOME=?");
        try {
            stmt.setString(1, documento.getFilePath());
            stmt.setString(2, documento.getUsuario().getNome());
            stmt.setString(3, documento.getFormatacao().getNomeFormatacao());
            stmt.setString(4, documento.getNomeDocumento());
            stmt.execute();
        } finally {
            stmt.close();
        }
    }

    public Documento get(String nomeDocumento) throws SQLException {
        Documento documento;
        PreparedStatement stmt = con.prepareStatement("SELECT NOME, FILEPATH, USUARIO, FORMATACAO FROM DOCUMENTO WHERE NOME=?");
        stmt.setString(1, nomeDocumento);
        ResultSet rs = stmt.executeQuery();
        try {
            if (rs.next()) {
                String nome = rs.getString("NOME");
                String filePath = rs.getString("FILEPATH");
                String nomeUsuario = rs.getString("USUARIO");
                String nomeFormatacao = rs.getString("FORMATACAO");
                Usuario usuario = mapeadorUsuario.get(nomeUsuario);
                Formatacao formatacao = mapeadorFormatacao.get(nomeFormatacao);
                documento = new Documento(nome, filePath, usuario, formatacao);
                return documento;
            } else {
                return null;
            }
        } finally {
            rs.close();
            stmt.close();
        }
    }
    
    public Documento get(String nomeDocumento, Usuario usuario) throws SQLException {
        Documento documento;
        PreparedStatement stmt = con.prepareStatement("SELECT NOME, FILEPATH, FORMATACAO FROM DOCUMENTO WHERE NOME=? AND USUARIO=?");
        stmt.setString(1, nomeDocumento);
        stmt.setString(2, usuario.getNome());
        ResultSet rs = stmt.executeQuery();
        try {
            if (rs.next()) {
                String nome = rs.getString("NOME");
                String filePath = rs.getString("FILEPATH");
                String nomeFormatacao = rs.getString("FORMATACAO");
                Formatacao formatacao = mapeadorFormatacao.get(nomeFormatacao);
                documento = new Documento(nome, filePath, usuario, formatacao);
                return documento;
            } else {
                return null;
            }
        } finally {
            rs.close();
            stmt.close();
        }
    }
    
    public Documento[] getDocumentos(Usuario usuario) throws SQLException {
        
        List<Documento> documentos = new ArrayList<Documento>();

        PreparedStatement stmt = con.prepareStatement("SELECT NOME, FILEPATH, FORMATACAO FROM DOCUMENTO WHERE USUARIO=?");
        stmt.setString(1, usuario.getNome());
        ResultSet rs = stmt.executeQuery();        
        
        try {
            while (rs.next()) {
                String nome = rs.getString("NOME");
                String filePath = rs.getString("FILEPATH");
                String nomeFormatacao = rs.getString("FORMATACAO");
                Formatacao formatacao = mapeadorFormatacao.get(nomeFormatacao);
                documentos.add(new Documento(nome, filePath, usuario, formatacao));
            }
            if (documentos.isEmpty()) {
                return null;
            } else {
                return (Documento[]) documentos.toArray(new Documento[documentos.size()]);
            }
        } finally {
            rs.close();
            stmt.close();
        }
    }

    public void remove(String nomeDocumento) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("DELETE FROM DOCUMENTO WHERE NOME=?");
        stmt.setString(1, nomeDocumento);
        stmt.execute();
        stmt.close();
    }
}
