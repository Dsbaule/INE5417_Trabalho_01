/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

//! Declaração do pacote
package Tests;

//! Importações necessárias
import Dados.Formatacao;
import Dados.INEdit;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

//! Testes para mapeamento de Usuário
public class TestesFormatacao {
    
    INEdit inedit = new INEdit();
    
    @Before
    public void removeTodosOsDados() {
        inedit.apagaTodosDadosDoBD();
    }

    @Test
    public void cadastraFormatacao() {
        Formatacao form = new Formatacao("Form1", 12, 0, 0, 1);
        inedit.cadastraFormatacao(form);
        assertEquals ("Form1", inedit.retornaFormatacao("Form1").getNomeFormatacao());
        assertEquals (12, inedit.retornaFormatacao("Form1").getTamanho());
        assertEquals (0, inedit.retornaFormatacao("Form1").getFonte());
        assertEquals (0, inedit.retornaFormatacao("Form1").getCorFonte());
        assertEquals (1, inedit.retornaFormatacao("Form1").getCorFundo());
    }
}
