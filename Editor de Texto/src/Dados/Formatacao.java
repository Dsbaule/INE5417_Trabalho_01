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
import javax.persistence.*;

//! Mapeamento SQL
@Entity
@Table (name="FORMATACAO")


//! Classe para implementação de Formatação
public class Formatacao {
    
    private String  nomeFormatacao;
    private Font    fonte;
    private int     tamanho;
    private Color   corFonte;
    private Color   corFundo;
    
    //! Construtor para formatação padrão (Arial, 12, Preta em fundo branco)
    public Formatacao() {
        this.nomeFormatacao = "Padrão";
        this.tamanho = 12;
        this.fonte = new Font("Arial", Font.PLAIN, this.tamanho);
        this.corFonte = Color.BLACK;
        this.corFundo = Color.WHITE;
    }
    
    //! Construtor para formatação nova
    public Formatacao(int tamanho, String fonte, Color corFonte, Color corFundo) {
        this.tamanho = tamanho;
        this.fonte = new Font(fonte, Font.PLAIN, this.tamanho);
        this.corFonte = corFonte;
        this.corFundo = corFundo;
    }
    
    //! Retorna o nome da formatação
    @Id
    @Column(name="NOME_FORMATACAO")
    public String getNomeFormatacao() {
        return nomeFormatacao;
    }
    
    //! Retorna a fonte
    public Font getFonte() {
        return fonte;
    }
    
    //! Retorna o tamanho da letra
    public int getTamanho() {
        return tamanho;
    }

    //! Retorna a cor da fonte
    public Color getCorFonte() {
        return corFonte;
    }
    
    //! Retorna a cor do plano de fundo
    public Color getCorFundo() {
        return corFundo;
    }

    //! Altera o nome da formatação
    public void setNomeFormatacao(String nomeFormatacao) {
        this.nomeFormatacao = nomeFormatacao;
    }

    //! Altera a fonte
    public void setFonte(Font fonte) {
        this.fonte = fonte;
    }
    
    //! Altera o tamanho da fonte
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    //! Altera a cor da fonte
    public void setCorFonte(Color corFonte) {
        this.corFonte = corFonte;
    }
    
    //! Altera a cor do plano de fundo
    public void setCorFundo(Color corFundo) {
        this.corFundo = corFundo;
    }
}
