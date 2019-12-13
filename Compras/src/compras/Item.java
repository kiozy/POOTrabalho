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

    private String Codigo_de_Barras;
    private String Descricao;
    private double valor;
    
    public String getCodigo_de_Barras() {
        return Codigo_de_Barras;
    }

    public void setCodigo_de_Barras(String Codigo_de_Barras) {
        this.Codigo_de_Barras = Codigo_de_Barras;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Item(String Codigo_de_Barras, String Descricao, double Valor){
        this.Codigo_de_Barras = Codigo_de_Barras;
        this.Descricao = Descricao;
        this.valor = Valor;
        
    }
}
