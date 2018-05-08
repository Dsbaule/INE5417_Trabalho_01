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

//! Classe para mapeamento SQL do Usuário
public class MapeadorUsuario {

    private Connection con;

    public MapeadorUsuario(Connection con) {
        this.con = con;
    }

    public void put(Usuario usuario) throws SQLException {
        if (this.get(usuario.getNome()) != null) {
            atualizaUsuarioExistente(usuario);
        } else {
            insereNovoUsuario(usuario);
        }
    }

    private void insereNovoUsuario(Usuario usuario) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("INSERT INTO USUARIO (NOME) "
                + "VALUES (?)");
        try {
            stmt.setString(1, usuario.getNome());
            stmt.execute();
        } finally {
            stmt.close();
        }
    }

    private void atualizaUsuarioExistente(Usuario usuario) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("UPDATE USUARIO SET NOME=? WHERE NOME=?");
        try {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getNome());
            stmt.execute();
        } finally {
            stmt.close();
        }
    }

    public Usuario get(String nomeUsuario) throws SQLException {
        Usuario usuario;
        PreparedStatement stmt = con.prepareStatement("SELECT NOME FROM USUARIO WHERE NOME=?");
        stmt.setString(1, nomeUsuario);
        ResultSet rs = stmt.executeQuery();
        try {
            if (rs.next()) {
                String nome = rs.getString("NOME");
                usuario = new Usuario(nome);
                return usuario;
            } else {
                return null;
            }
        } finally {
            rs.close();
            stmt.close();
        }
    }

    public void remove(String nomeUsuario) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("DELETE FROM USUARIO WHERE NOME=?");
        stmt.setString(1, nomeUsuario);
        stmt.execute();
        stmt.close();
    }
}
