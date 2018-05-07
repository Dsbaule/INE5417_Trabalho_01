/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

//! Declaração do pacote
package Dados;

//! Importações necessárias
import java.awt.List;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;

//! Mapeamento SQL
@Entity
@Table (name="USUARIO")

//! Classe para implementação de um documento
public class Usuario {
    
    private String nome;            // Nome do Usuários
    
    //! Construtor que recebe o nome do Usuário
    public Usuario(String nome) {
        this.nome = nome;
    }
    
    @Id
    @Column(name="NOME_USUARIO")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
