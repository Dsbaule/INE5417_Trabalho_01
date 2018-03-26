/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

package Controle;

/*
import Modelo.Arquivo;
import Tela.Tela_Principal;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
*/

public class Controle {
    /*
    
    Tela_Principal tela;
    Arquivo arquivo;
    
    
    public Controle(){
             tela = new Tela_Principal();
             arquivo = new Arquivo();
    }
   
    
    public void abrirJanela (){
        // Serve para abrir a Tela_principal
        // abre o sistema
        tela.setVisible(true); 
    }
    
    public void GravarArquivo (){
        // esse metodo serve tanto para Salvar quanto para Salvar como... -- Atualmente serve somente para Salvar
        // atualmente o caminha esta para o meu pc
        // essa duas primeiras linhas é só para teste
        arquivo.setNome("teste");
        arquivo.setCaminho("C:/Users/Mirian/Desktop/");
        
        Path caminho = Paths.get(arquivo.getCaminho()+arquivo.getNome() +".txt");
        String texto = arquivo.getTexto();
        byte[] textoEmBytes = texto.getBytes();
        try{
            Files.write(caminho, textoEmBytes);
        }catch (Exception erro){
            System.err.println(erro);
        }
        
    }
    
     public void salvar (String t){
        //set texto no objeto "arquivo" 
         arquivo.setTexto(t);
         // executa o metodo que grava o arquivo
         GravarArquivo();
         
         
         //
         
    }
     
    public void Novo (String t){
        
//        arquivo.setTexto(t);
//        
//        if("".equals(arquivo.getTexto().trim()) && "".equals(arquivo.getCaminho().trim())){
//        //Arquivo vazio
//            System.out.println("vazio:"+ "\n" +arquivo.getTexto());
//        }else{
//            int r = JOptionPane.showConfirmDialog(null,"Deseja salvar alterações?", "Salvar", JOptionPane.YES_NO_OPTION);
//            
//            if(r == 1){
//                // r = não, então esvazia texto
//                arquivo.setTexto("");
//            }
//            // Obs: resposta == sim, r = 0
//        }
//        
        
//        if("".equals(t.trim())){
//            System.out.println("vazio:"+ "\n" +tela.getTexto());
//        }else{
//            int r = JOptionPane.showConfirmDialog(null,"Deseja salvar alterações?", "Salvar", JOptionPane.YES_NO_OPTION);
//            
//            if(r == 1){
//                // r = não, então esvazia texto
//                tela.setTextoVazio();
//            }
//            // Obs: resposta == sim, r = 0
//        }
        //new Tela_Principal().setVisible(true);
        
    }
    */
}