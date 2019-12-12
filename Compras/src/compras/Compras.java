/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author natmatzides
 */
public class Compras {
    //Compras

    private ArrayList<OrdemLista> ordemListas = new ArrayList<>();

    public void ListarCompras(){
        System.out.println("As compras sao:");
        if (ordemListas.size()==0){
            System.out.println("nao existem compras atualmente");
        }
        else
        for(int i =0; i < ordemListas.size(); i++){
            System.out.println("Compras:"+ordemListas.get(i).toString());
        }
    }

    public void NovoPedido(){
        int codigo_de_Barras, valor, idCompra = ordemListas.size(), valortotal, quantidade;
        String descricao;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nAdicione o novo codigo de barras:");
        codigo_de_Barras = keyboard.nextInt();


        System.out.println("\nAdicione a descriçao do produto:");
        descricao = keyboard.next();

        System.out.println("\nAdicone o valor do produto:");
        valor = keyboard.nextInt();

        System.out.println("\nAdicone a quantidade de produtos a ser comprada:");
        quantidade = keyboard.nextInt();


        valortotal = quantidade * valor;
        System.out.println("\nValor total da compra:"+valortotal);

        idCompra = idCompra++;
        System.out.println("\nNumero de compra gerado:"+idCompra);

        OrdemLista newOrder = new OrdemLista(codigo_de_Barras,descricao,valor,idCompra,valortotal,quantidade);
        ordemListas.add(newOrder);
        System.out.println("\nConfirmado nova ordem de compra:"+ newOrder.toString()+",valor="+ valor+",codigo de barras=" + codigo_de_Barras);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nSetor de compras:\n");
        System.out.println("(1) Solicitar novo pedido");
        System.out.println("(2) Listar compras");
        System.out.println("(4) Remover item");
        System.out.println("(5) Sair");

        Compras compras = new Compras();
        compras.NovoPedido();
        compras.ListarCompras();

    }

}
