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
public class MapeadorFormatacao {

    private Connection con;

    public MapeadorFormatacao(Connection con) {
        this.con = con;
    }

    public void put(Formatacao formatacao) throws SQLException {
        if (this.get(formatacao.getNomeFormatacao()) != null) {
            atualizaFormatacaoExistente(formatacao);
        } else {
            insereNovaFormatacao(formatacao);
        }
    }

    private void insereNovaFormatacao(Formatacao formatacao) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("INSERT INTO FORMATACAO (NOME, TAMANHO, FONTE, CORFONTE, CORFUNDO) "
                + "VALUES (?, ?, ?, ?, ?)");
        try {
            stmt.setString(1, formatacao.getNomeFormatacao());
            stmt.setInt(2, formatacao.getTamanho());
            stmt.setInt(3, formatacao.getFonte());
            stmt.setInt(4, formatacao.getCorFonte());
            stmt.setInt(5, formatacao.getCorFundo());
            stmt.execute();
        } finally {
            stmt.close();
        }
    }

    private void atualizaFormatacaoExistente(Formatacao formatacao) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("UPDATE FORMATACAO SET TAMANHO=?,FONTE=?, "
                + "CORFONTE=?,CORFUNDO=? WHERE NOME=?");
        try {
            stmt.setInt(1, formatacao.getTamanho());
            stmt.setInt(2, formatacao.getFonte());
            stmt.setInt(3, formatacao.getCorFonte());
            stmt.setInt(4, formatacao.getCorFundo());
            stmt.setString(5, formatacao.getNomeFormatacao());
            stmt.execute();
        } finally {
            stmt.close();
        }
    }

    public Formatacao get(String nomeFormatacao) throws SQLException {
        Formatacao formatacao;
        PreparedStatement stmt = con.prepareStatement("SELECT NOME, TAMANHO, FONTE, CORFONTE, CORFUNDO FROM FORMATACAO WHERE NOME=?");
        stmt.setString(1, nomeFormatacao);
        ResultSet rs = stmt.executeQuery();
        try {
            if (rs.next()) {
                String nome = rs.getString("NOME");
                int tamanho = rs.getInt("TAMANHO");
                int fonte = rs.getInt("FONTE");
                int corFonte = rs.getInt("CORFONTE");
                int corFundo = rs.getInt("CORFUNDO");
                formatacao = new Formatacao(nome, tamanho, fonte, corFonte, corFundo);
                return formatacao;
            } else {
                return null;
            }
        } finally {
            rs.close();
            stmt.close();
        }
    }

    public Formatacao[] getFormatacoes() throws SQLException {
        List<Formatacao> formatacoes = new ArrayList<Formatacao>();

        PreparedStatement stmt = con.prepareStatement("SELECT NOME, TAMANHO, FONTE, CORFONTE, CORFUNDO FROM FORMATACAO");
        ResultSet rs = stmt.executeQuery();        

        try {
            while (rs.next()) {
                String nome = rs.getString("NOME");
                int tamanho = rs.getInt("TAMANHO");
                int fonte = rs.getInt("FONTE");
                int corFonte = rs.getInt("CORFONTE");
                int corFundo = rs.getInt("CORFUNDO");
                formatacoes.add(new Formatacao(nome, tamanho, fonte, corFonte, corFundo));
            }
            if (formatacoes.isEmpty()) {
                return null;
            } else {
                return (Formatacao[]) formatacoes.toArray(new Formatacao[formatacoes.size()]);
            }
        } finally {
            rs.close();
            stmt.close();
        }
    }

    public void remove(String nomeFormatacao) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("DELETE FROM FORMATACAO WHERE NOME=?");
        stmt.setString(1, nomeFormatacao);
        stmt.execute();
        stmt.close();
    }
}
