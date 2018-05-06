/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

//! Declaração do pacote
package Dados;

//! Importações Necessárias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

//! Mapeador da classe formatacao para SQL
public class MapeadorFormatacao {
    
    private Connection con;
    
    public MapeadorFormatacao(Connection con){
            this.con = con;
    }
}
