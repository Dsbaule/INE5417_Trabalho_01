/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

//! Declaração do pacote
package Dados;

//! Importações necessárias
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;

//! Mapeamento SQL
@Entity
@Table (name="DOCUMENTO")

//! Classe para implementação de um documento
public class Documento {

    private String nomeDocumento;   // Nome do Documento
    private Usuario usuario;        // Usuario do Documento
    private String texto;           // Texto do Documento
    private Formatacao formatacao;  // Formatação do Documento
    
    //! Construtor para novo arquivo;
    public Documento(String nomeDocumento, Usuario usuario) {
        this.nomeDocumento  = nomeDocumento;
        this.usuario        = usuario;
        this.texto          = "";
        this.formatacao     = new Formatacao();
    }
    
    //! Retorna o nome do documento
    @Id
    @Column(name="NOME_DOCUMENTO")
    public String getNomeDocumento() {
        return nomeDocumento;
    }
   
    //! Retorna o Usuario do Documento
    @ManyToOne
    @JoinColumn(name="USUARIO",insertable=false,updatable=false)
    public Usuario getUsuario() {
        return usuario;
    }
    
    //! Retorna o texto do documento
    public String getTexto() {
        return this.texto;
    }

    //! Retorna a formatação do documento
    @ManyToOne
    @JoinColumn(name="FORMATACAO",insertable=false,updatable=false)
    public Formatacao getFormatacao() {
        return formatacao;
    }

    //! Altera o nome do documento
    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }
    
    //! Altera o texto do documento
    public void setTexto(String texto) {
        this.texto = texto;
    }

    //! Altera a formatação do documento
    public void setFormatacao(Formatacao formatacao) {
        this.formatacao = formatacao;
    }
}
