/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

/**
 *
 * @author natmatzides
 */
public class Item {




    private int Codigo_de_Barras;
    private String Descricao;
    private int valor;
    
    public int getCodigo_de_Barras() {
        return Codigo_de_Barras;
    }

    public void setCodigo_de_Barras(int Codigo_de_Barras) {
        this.Codigo_de_Barras = Codigo_de_Barras;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Item(int Codigo_de_Barras, String Descricao, int Valor){
        this.Codigo_de_Barras = Codigo_de_Barras;
        this.Descricao = Descricao;
        this.valor = Valor;
        
    }
    @Override
    public String toString() {
        return "" +
                "Codigo_de_Barras=" + Codigo_de_Barras +
                ", Descricao='" + Descricao + '\'' +
                ", valor=" + valor;
    }
}
