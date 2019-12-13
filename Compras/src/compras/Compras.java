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
    //Classe principal - Programa rodando no NetBeans IDE 8.2

    Scanner keyboard = new Scanner(System.in); //Preparando para que seja capturado a informação digitada
    private static final ArrayList<OrdemLista> ordemListas = new ArrayList<>();  // Criado um ArrayList com o nome de ordemListas para que sejam armazenados cada item

    public void ListarCompras(){
        if (ordemListas.isEmpty()){
            System.out.println("\nNão existem compras registradas atualmente.");
        }
        else
            System.out.println("\nAs compras sao:");
            for(int i =0; i < ordemListas.size(); i++){
                System.out.println(ordemListas.get(i).toString());
            }
    }

    public void NovoPedido(){
        //Cada item do pedido vai ser armazenado em um item no ArrayList diferente para que cada um seja enviado para um fornecedor diferente
        int idCompra = ordemListas.size(), quantidade;
        double valor, valortotal;
        String codigo_de_Barras, descricao;
        //Variáveis declaradas
        
        System.out.print("\nAdicione o novo codigo de barras: ");
        codigo_de_Barras = keyboard.next();  //O código de barras é armazenado em um variável de string

        System.out.print("\nAdicione o nome do produto: ");
        descricao = keyboard.next(); //O nome do produto é armazenado em um variável de string

        System.out.print("\nAdicone a quantidade de produtos a ser comprada: ");
        quantidade = keyboard.nextInt(); //A quantidade do produto é armazenada em um variável de inteiro
        
        System.out.print("\nAdicone o valor unitário do produto: R$");
        valor = keyboard.nextDouble(); //O valor unitário é armazenado em um variável de double

        idCompra = idCompra++; //idCompra vê quantos itens tem no ArrayList e soma um para adicionar um novo item. Começa do 0
        valortotal = quantidade * valor; //O valor total é calculado pela multiplicação entre a quantidade de itens com o valor unitário

        OrdemLista newOrder = new OrdemLista(codigo_de_Barras,descricao,valor,idCompra,valortotal,quantidade); //Instanciando uma OrdemLista
        ordemListas.add(newOrder); //Armazena o novo pedido, com suas variáveis
        System.out.println("\nConfirmada nova ordem de compra! Confira: "+ newOrder.toString()); //Mensagem de confirmação do novo pedido
    }
    public void RemoverCompras(){
        Compras listaCompra = new Compras();
        listaCompra.ListarCompras();  //Chama a função de listar os itens armazenados para que possa saber qual deseja excluir
        System.out.println("\nInsira o ID da compra que quer remover da lista:");
        int i = keyboard.nextInt();
        ordemListas.remove(i);  //Remove o item do ArrayList com o ID desejado
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Compras compras = new Compras();
        Scanner keyboard = new Scanner(System.in);
        
        //Menu com um swtich
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
                    System.out.println("Erro! Por favor, tente um valor válido."); //Caso seja digitado uma opção diferente das disponíveis

            }


    }

}

}
