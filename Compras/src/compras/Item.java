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
    //Item possuirá código de barras, descrição e um valor unitário
    private String Codigo_de_Barras;
    private String Descricao;
    private String Fornecedor;
    private double valor;
    
    //Getters e setters adicionados para todas as variáveis privates criadas
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

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //Construtor para Item
    public Item(String Codigo_de_Barras, String Descricao, String Fornecedor, double Valor){
        this.Codigo_de_Barras = Codigo_de_Barras;
        this.Descricao = Descricao;
        this.Fornecedor = Fornecedor;
        this.valor = Valor;
        
    }
}
