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
            System.out.println("\nNão existem compras registradas atualmente.");
        }
        else
            System.out.println("\nAs compras sao:");
            for(int i =0; i < ordemListas.size(); i++){
                System.out.println(ordemListas.get(i).toString());
            }
    }

    public void NovoPedido(){
        int idCompra = ordemListas.size(), quantidade;
        double valor, valortotal;
        String codigo_de_Barras, descricao;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("\nAdicione o novo codigo de barras: ");
        codigo_de_Barras = keyboard.next();

        System.out.print("\nAdicione o nome do produto: ");
        descricao = keyboard.next();

        System.out.print("\nAdicone a quantidade de produtos a ser comprada: ");
        quantidade = keyboard.nextInt();
        
        System.out.print("\nAdicone o valor unitário do produto: R$");
        valor = keyboard.nextDouble();

        idCompra = idCompra++;
        
        valortotal = quantidade * valor;

        OrdemLista newOrder = new OrdemLista(codigo_de_Barras,descricao,valor,idCompra,valortotal,quantidade);
        ordemListas.add(newOrder);
        System.out.println("\nConfirmada nova ordem de compra! Confira: "+ newOrder.toString());
    }
    public void RemoverCompras(){
        Scanner keyboard = new Scanner(System.in);
        Compras listaCompra = new Compras();
        listaCompra.ListarCompras();
        System.out.println("\nInsira o ID da compra que quer remover da lista:");
        int i = keyboard.nextInt();
        ordemListas.remove(i);
        //listaCompra.ListarCompras();
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
