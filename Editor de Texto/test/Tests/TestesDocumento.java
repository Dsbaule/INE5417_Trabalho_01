/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Dados.Documento;
import Dados.Formatacao;
import Dados.INEdit;
import Dados.Usuario;
import java.awt.Color;
import java.awt.Font;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class TestesDocumento {
    
    INEdit inedit = new INEdit();
    
    @Before
    public void removeTodosOsDados() {
        inedit.apagaTodosDadosDoBD();
    }

    @Test
    public void cadastraDocumento() {
        Usuario user = new Usuario("User1");
        inedit.cadastraUsuario(user);
        Formatacao form = new Formatacao("Form1", 0, 12, 0, 1);
        inedit.cadastraFormatacao(form);
        Documento documento = new Documento("Doc1", "C://", user, form);
        inedit.cadastraDocumento(documento);
        assertEquals ("Doc1", inedit.retornaDocumento("Doc1").getNomeDocumento());
        assertEquals ("C://", inedit.retornaDocumento("Doc1").getFilePath());
        assertEquals ("User1", inedit.retornaDocumento("Doc1").getUsuario().getNome());
        assertEquals ("Form1", inedit.retornaDocumento("Doc1").getFormatacao().getNomeFormatacao());
    }
}
