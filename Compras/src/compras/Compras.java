/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compras;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Atmatzides
 * @author Lucas Vieira
 */
public class Compras {
    //Compras

    private static ArrayList<OrdemLista> ordemListas = new ArrayList<>();

    public void ListarCompras(){
        if (ordemListas.size()==0){
            System.out.println("\nNão existem compras atualmente.");
        }
        else
        for(int i =0; i < ordemListas.size(); i++){
            System.out.println("\nAs compras sao:\n"+ordemListas.get(i).toString());
        }
    }

    public void NovoPedido(){
        int codigo_de_Barras, idCompra = ordemListas.size(), quantidade;
        double valor, valortotal;
        String descricao;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("\nAdicione o novo codigo de barras:");
        codigo_de_Barras = keyboard.nextInt();

        System.out.println("\nAdicione o nome do produto:");
        descricao = keyboard.next();

        System.out.println("\nAdicone a quantidade de produtos a ser comprada:");
        quantidade = keyboard.nextInt();
        
        System.out.println("\nAdicone o valor unitário do produto:");
        valor = keyboard.nextDouble();

        idCompra = idCompra++;
        System.out.println("\nNumero de compra gerado:"+idCompra);
        
        valortotal = quantidade * valor;
        System.out.println("\nValor total da compra:"+valortotal);

        OrdemLista newOrder = new OrdemLista(codigo_de_Barras,descricao,valor,idCompra,valortotal,quantidade);
        ordemListas.add(newOrder);
        System.out.println("\nConfirmada nova ordem de compra!"+ newOrder.toString()+",valor="+ valor+",codigo de barras=" + codigo_de_Barras);
    }
    public void RemoverCompras(){
        Scanner keyboard = new Scanner(System.in);
        Compras listaCompra = new Compras();
        listaCompra.ListarCompras();
        System.out.println("\nInsira o ID da compra que quer remover da lista:\n");
        int i = keyboard.nextInt();
        ordemListas.remove(i);
        listaCompra.ListarCompras();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Compras compras = new Compras();
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.println("\n############ SETOR DE COMPRAS ############");
            System.out.println("(1) Listar compras");
            System.out.println("(2) Adicionar nova compra");  
            System.out.println("(3) Remover compra");
            System.out.println("(4) Sair");
            System.out.print("\nEscolha uma opção: ");
            choice = keyboard.nextInt();

            switch (choice){
                case 1:
                    compras.ListarCompras();
                    break;
                case 2:
                    compras.NovoPedido();
                    break;
                case 3:
                    compras.RemoverCompras();
                    break;
                case 4:
                    Runtime.getRuntime().exit(0);
                    break;
                default:
                    System.out.println("Erro! Por favor, tente um valor válido.");

            }


    }

}

}
