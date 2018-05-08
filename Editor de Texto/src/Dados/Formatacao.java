/* --------------------------------------------------------------------------------
 * Autores:     Daniel de Souza Baulé
 *              Mirian de França Santos Pereira
 * Disciplina:  INE5417 - Engenharia de Software
 * Projeto:     Edito de Texto
-------------------------------------------------------------------------------- */

//! Declaração do pacote
package Dados;

//! Importações necessárias
import java.awt.Color;
import java.awt.Font;

//! Mapeamento SQL


//! Classe para implementação de Formatação
public class Formatacao {
    
    private String  nomeFormatacao;
    private int     fonte;
    private int     tamanho;
    private int     corFonte;
    private int     corFundo;
    
    private String[] fontes = {"Arial", "Times New Roman", "Comic Sans"};
    private Color[] cores   = {Color.BLACK, Color.WHITE, Color.RED, Color.BLUE, Color.GREEN};
    
    //! Construtor para formatação padrão (Arial, 12, Preta em fundo branco)
    public Formatacao() {
        this.nomeFormatacao = "Padrão";
        this.tamanho = 12;
        this.fonte = 0;
        this.corFonte = 0;
        this.corFundo = 1;
    }
    
    //! Construtor para formatação nova
    public Formatacao(String nome, int tamanho, int fonte, int corFonte, int corFundo) {
        this.nomeFormatacao = nome;
        this.tamanho = tamanho;
        this.fonte = fonte;
        this.corFonte = corFonte;
        this.corFundo = corFundo;
    }
    
    //! Retorna o nome da formatação
    public String getNomeFormatacao() {
        return nomeFormatacao;
    }
    
    //! Retorna a fonte
    public int getFonte() {
        return fonte;
    }
    
    //! Retorna o tamanho da letra
    public int getTamanho() {
        return tamanho;
    }

    //! Retorna a cor da fonte
    public int getCorFonte() {
        return corFonte;
    }
    
    //! Retorna a cor do plano de fundo
    public int getCorFundo() {
        return corFundo;
    }

    //! Altera o nome da formatação
    public void setNomeFormatacao(String nomeFormatacao) {
        this.nomeFormatacao = nomeFormatacao;
    }

    //! Altera a fonte
    public void setFonte(int fonte) {
        this.fonte = fonte;
    }
    
    //! Altera o tamanho da fonte
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    //! Altera a cor da fonte
    public void setCorFonte(int corFonte) {
        this.corFonte = corFonte;
    }
    
    //! Altera a cor do plano de fundo
    public void setCorFundo(int corFundo) {
        this.corFundo = corFundo;
    }
}
