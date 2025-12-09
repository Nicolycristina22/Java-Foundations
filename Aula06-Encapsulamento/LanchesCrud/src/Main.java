import entidades.GerenciarPedido;
import entidades.MenuLanches;
import entidades.Pedido;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLanches ml = new MenuLanches();
        GerenciarPedido ged = new GerenciarPedido();
        int opcao;

        while (true) {
            System.out.println("---SISTEMA DE PEDIDOS----");
            System.out.println("1 - ADICIONAR ITEM");
            System.out.println("2 - LISTAR ITENS");
            System.out.println("3 - ATUALIZAR PEDIDO");
            System.out.println("4 - EXCLUIR ITEM");
            System.out.println("5 - VALOR TOTAL");
            System.out.println("6 - SAIR DO PROGRAMA");
            System.out.println("ESCOLHA: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    ml.exibirLanches();
                    System.out.print("Digite o id do lanche: ");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    var lanche = ml.getLanche(opcaoLanche);
                    Pedido pedido = new Pedido(lanche.getNome(), lanche.getPreco(), quantidade);




                }
            }


        }


    }
}