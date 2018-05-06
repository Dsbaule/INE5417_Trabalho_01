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

//! Mapeador da classe documento para SQL
public class MapeadorDocumento {
    
    private Connection con;
    private MapeadorFormatacao mapeadorFormatacao;
	
    public MapeadorDocumento(Connection con){
            this.con = con;
            this.mapeadorFormatacao = new MapeadorFormatacao(con);
    }
    
    
}
