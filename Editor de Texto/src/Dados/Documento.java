/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

//! Declaração do pacote
package Dados;

//! Importações necessárias

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    
    //! Le o texto do arquivo
    public void leDocumento() {
        FileInputStream fis = null;
        File arquivo = new File(filePath);
        
        try {
            fis = new FileInputStream(arquivo);
            byte[] data = new byte[(int) arquivo.length()];
            fis.read(data);
            fis.close();
            texto = new String(data, "UTF-8");
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado, criando...");
            this.texto = "";
        } catch (IOException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //! Salva o texto no arquivo
    public void salvaDocumento() {
        File arquivo = new File(filePath);
        
        try {
            FileWriter fstream = new FileWriter(arquivo);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(texto);
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
