/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

package Controle;

import Dados.Documento;        
import Tela.Tela_Principal;
import javax.swing.JFrame;

public class EditorDeTexto {
    
    enum codeState {
            INICIO,
            ABRIR,
            EDIÇÃO,
            SALVAR,
            SAIR
    }
    
    public static void main(String[] args) {
        
        codeState estado = codeState.INICIO;
        
        
        while (estado != codeState.SAIR) {
            switch (estado) {
                case INICIO:
                    initTela();
                    break;
            }
        }
        
    }
    
    private static void initTela() {
        Tela_Principal tela = new Tela_Principal();
        tela.setVisible(true);
    }
}
