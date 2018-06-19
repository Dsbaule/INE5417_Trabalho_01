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
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//! Classe para mapeamento do editor para SQL
public class INEdit {

    private Connection con;

    private MapeadorUsuario     mapeadorUsuario;
    private MapeadorFormatacao  mapeadorFormatacao;
    private MapeadorDocumento   mapeadorDocumento;

    public INEdit() {
        try {
            // BD Postgres
            Class.forName("org.postgresql.Driver");
            this.con = DriverManager.getConnection("jdbc:postgresql://localhost/INEdit", "postgres", "postgres");
            this.mapeadorUsuario    = MapeadorUsuario.getMapeadorUsuario(con);
            this.mapeadorFormatacao = MapeadorFormatacao.getMapeadorFormatacao(con);
            this.mapeadorDocumento  = MapeadorDocumento.getMapeadorDocumento(con);
        } catch (Exception e) {
            e.printStackTrace();
            throw new java.lang.RuntimeException("Erro ao conectar!");
        }
    }

    public void apagaTodosDadosDoBD() {
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM DOCUMENTO");
            stmt.executeUpdate("DELETE FROM FORMATACAO");
            stmt.executeUpdate("DELETE FROM USUARIO");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new java.lang.RuntimeException("erro ao apagar todos os dados do BD");
        } finally {
            try {
                stmt.close();
            } catch (Exception ignore) {
            }
        }
    }

    public void cadastraUsuario(Usuario usuario) {
        try {
            mapeadorUsuario.put(usuario);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Usuario retornaUsuario(String nome) {
        try {
            return mapeadorUsuario.get(nome);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public String[] retornaUsuarios() {
        try {
            return mapeadorUsuario.getUsuarios();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void removeUsuario(String nome) {
        try {
            mapeadorUsuario.remove(nome);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastraFormatacao(Formatacao formatacao) {
        try {
            mapeadorFormatacao.put(formatacao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Formatacao retornaFormatacao(String nomeFormatacao) {
        try {
            return mapeadorFormatacao.get(nomeFormatacao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Formatacao[] retornaFormatacoes() {
        try {
            return mapeadorFormatacao.getFormatacoes();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void removeFormatacao(String nomeFormatacao) {
        try {
            mapeadorUsuario.remove(nomeFormatacao);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cadastraDocumento(Documento documento) {
        try {
            mapeadorDocumento.put(documento);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Documento retornaDocumento(String nomeDocumento) {
        try {
            return mapeadorDocumento.get(nomeDocumento);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Documento[] retornaDocumentos (Usuario usuario) {
        try {
            return mapeadorDocumento.getDocumentos(usuario);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void removeDocumento(String nomeDocumento) {
        try {
            mapeadorDocumento.remove(nomeDocumento);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
