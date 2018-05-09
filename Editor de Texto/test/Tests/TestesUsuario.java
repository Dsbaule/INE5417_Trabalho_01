/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */
//! Declaração do pacote
package Tests;

//! Importações necessárias
import Dados.INEdit;
import Dados.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

//! Testes para mapeamento de Usuário
public class TestesUsuario {

    INEdit inedit = new INEdit();

    @Before
    public void removeTodosOsDados() {
        inedit.apagaTodosDadosDoBD();
    }

    @Test
    public void cadastraUsuarios() {
        Usuario user1 = new Usuario("User1");
        inedit.cadastraUsuario(user1);
        Usuario user2 = new Usuario("User2");
        inedit.cadastraUsuario(user2);
        Usuario user3 = new Usuario("User3");
        inedit.cadastraUsuario(user3);
        assertEquals("User1", inedit.retornaUsuario("User1").getNome());
        assertEquals("User2", inedit.retornaUsuario("User2").getNome());
        assertEquals("User3", inedit.retornaUsuario("User3").getNome());
    }
    
    @Test
    public void retornaUsuarios() {
        Usuario user1 = new Usuario("User1");
        inedit.cadastraUsuario(user1);
        Usuario user2 = new Usuario("User2");
        inedit.cadastraUsuario(user2);
        Usuario user3 = new Usuario("User3");
        inedit.cadastraUsuario(user3);
        assertEquals("User1", inedit.retornaUsuario("User1").getNome());
        assertEquals("User2", inedit.retornaUsuario("User2").getNome());
        assertEquals("User3", inedit.retornaUsuario("User3").getNome());
        String[] usuarios = inedit.retornaUsuarios();
        assertNotNull(usuarios);
    }

    @Test
    public void remove1UsuarioCadastrado() {
        Usuario user1 = new Usuario("User1");
        inedit.cadastraUsuario(user1);
        assertEquals("User1", inedit.retornaUsuario("User1").getNome());
        inedit.removeUsuario("User1");
        assertNull(inedit.retornaUsuario("User1"));
    }
}
