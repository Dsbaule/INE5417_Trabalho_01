/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

//! Declaração do pacote
package Dados;

//! Importações necessárias

//! Mapeamento SQL

//! Classe para implementação de um documento
public class Documento {

    private String nomeDocumento;   // Nome do Documento
    private String filePath;        // Caminho do Documento
    private Usuario usuario;        // Usuario do Documento
    private String texto;           // Texto do Documento
    private Formatacao formatacao;  // Formatação do Documento
    
    //! Construtor para novo arquivo;
    public Documento() {
        
    }
    
    //! Construtor para novo arquivo;
    public Documento(String nomeDocumento, String filePath, Usuario usuario) {
        this.nomeDocumento  = nomeDocumento;
        this.filePath       = filePath;
        this.usuario        = usuario;
        this.texto          = "";
        this.formatacao     = new Formatacao();
    }
    
    //! Construtor para novo arquivo;
    public Documento(String nomeDocumento, String filePath, Usuario usuario, Formatacao formatacao) {
        this(nomeDocumento, filePath, usuario);
        this.formatacao = formatacao;
    }
    
    //! Retorna o nome do documento
    public String getNomeDocumento() {
        return nomeDocumento;
    }
    
    //! Retorna o nome do documento
    public String getFilePath() {
        return filePath;
    }
   
    //! Retorna o Usuario do Documento
    public Usuario getUsuario() {
        return usuario;
    }
    
    //! Retorna o texto do documento
    public String getTexto() {
        return this.texto;
    }

    //! Retorna a formatação do documento
    public Formatacao getFormatacao() {
        return formatacao;
    }

    //! Altera o nome do documento
    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }
    
    
    //! Retorna o nome do documento
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    //! Altera o usuario do documento
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
