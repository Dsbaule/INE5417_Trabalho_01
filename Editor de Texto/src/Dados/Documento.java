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

//! Classe para implementação de um documento
public class Documento {
    
    private File arquivo;           // Caminho para o arquivo representado
    private String texto;           // Texto do Documento
    private Formatacao formatacao;  // Formatação do Documento
    
    //! Construtor que recebe o caminho para o arquivo (Como File)
    public Documento(File arquivo) {
        this.arquivo = arquivo;
        lerArquivo();
    }
    
    //! Construtor que recebe o caminho para o arquivo (Como String)
    public Documento(String arquivo) {
        this.arquivo = new File(arquivo);
        lerArquivo();
    }
    
    //! Construtor que recebe a pasta e o nome do arquivo (Geralmente para criação de novo arquivo)
    public Documento(File pasta, String nome) {
        if(!nome.endsWith(".txt"))      // Garante que o arquivo termine em .txt
            nome = nome.concat(".txt"); 
        this.arquivo = new File(pasta, nome);
        lerArquivo();
    }
    
    //! Le o conteúdo do arquivo
    private void lerArquivo() {
        FileInputStream fis = null;
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
    
    //! Salva o conteúdo no arquivo
    public void salvarArquivo() {
        try {
            FileWriter fstream = new FileWriter(arquivo);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(texto);
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    //! Retorna o texto do documento
    public String getTexto() {
        return this.texto;
    }

    //! Retorna a formatação do documento
    public Formatacao getFormatacao() {
        return formatacao;
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
