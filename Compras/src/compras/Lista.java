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
public class Lista extends ItemLista{

   public Lista(int Codigo_de_Barras,String Descricao,int valor){
   
       super(Codigo_de_Barras, Descricao, valor);
   }
    private int Id_Compra;
    private int Valor_Total;
    private int Quantidade;

    public int getId_Compra() {
        return Id_Compra;
    }

    public void setId_Compra(int Id_Compra) {
        this.Id_Compra = Id_Compra;
    }

    public int getValor_Total() {
        return Valor_Total;
    }

    public void setValor_Total(int Valor_Total) {
        this.Valor_Total = Valor_Total;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    
}
