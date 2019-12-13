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
public class OrdemLista extends Item {

    public OrdemLista(String Codigo_de_Barras, String Descricao, double Valor, int id_Compra, double valor_Total, int quantidade) {
        super(Codigo_de_Barras, Descricao, Valor);
        Id_Compra = id_Compra;
        Valor_Total = valor_Total;
        Quantidade = quantidade;

    }
    private int Id_Compra;
    private double Valor_Total;
    private int Quantidade;

    public int getId_Compra() {
        return Id_Compra;
    }

    public void setId_Compra(int Id_Compra) {
        this.Id_Compra = Id_Compra;
    }

    public double getValor_Total() {
        return Valor_Total;
    }

    public void setValor_Total(double Valor_Total) {
        this.Valor_Total = Valor_Total;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    @Override
    public String toString() {
        return "" +
                "\nId da compra: " + Id_Compra +
                " / código de barras: "+ getCodigo_de_Barras()+
                " / produto: "+ getDescricao()+
                " / valor unitário: R$"+ getValor() +
                " / quantidade: " + Quantidade +
                " / valor final: R$" + Valor_Total + ".";
                
    }

}
