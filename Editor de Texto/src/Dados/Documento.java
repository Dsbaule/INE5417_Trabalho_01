/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */
package Dados;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Documento {

    private File arquivo;
    private String texto;

    public Documento(File arquivo) {
        this.arquivo = arquivo;
        lerArquivo();
    }

    public Documento(String arquivo) {
        this.arquivo = new File(arquivo);
        lerArquivo();
    }
    
    public Documento(File pasta, String nome) {
        if(!nome.endsWith(".txt"))
            nome = nome.concat(".txt");
        System.out.println(nome);
        this.arquivo = new File(pasta, nome);
        lerArquivo();
    }

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
            //Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void salvarArquivo() {
        try {
            FileWriter fstream = new FileWriter(arquivo);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(texto);
            out.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
