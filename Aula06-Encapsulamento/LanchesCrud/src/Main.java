import entidades.ListaPedido;
import entidades.MenuLanches;
import entidades.Pedido;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLanches menu = new MenuLanches();
        ListaPedido listaPedidos = new ListaPedido();

        int opcao;

        while (true) {
            System.out.println("----MENU DE OPÇÕES----");
            System.out.println("1 - CADASTRAR LANCHE");
            System.out.println("2 - LISTAR PEDIDO");
            System.out.println("3 - ALTERAR PEDIDO");
            System.out.println("4 - EXCLUIR LANCHE");
            System.out.println("5 - CALCULAR PEDIDO");
            System.out.println("6 - SAIR DO PROGRAMA");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1 -> {
                    menu.exibirCardapio();
                    System.out.println("Digite a opção desejada: ");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();
                    var LancheEscolhido = menu.getCardapio(opcaoLanche);
                    System.out.println(LancheEscolhido.getPrecoUnitario());

                    System.out.println("Digite a quantidade desejada: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido(LancheEscolhido.getNome(),
                            quantidade,
                            LancheEscolhido.getPrecoUnitario()
                    );

                    listaPedidos.adicionarPedido(pedido);

                }

                case 2 -> {
                    listaPedidos.listarPedidos();
                }

                case 3 -> {
                    listaPedidos.listarPedidos();
                    System.out.print("Digite o id do lanche: ");
                    int idLanchePedido = sc.nextInt();
                    sc.nextLine();

                    menu.exibirCardapio();
                    System.out.println("Digite o id do lanche desejado: ");
                    int idLancheCardapio = sc.nextInt();
                    sc.nextLine();

                    var novoLanche = menu.getCardapio(idLancheCardapio);

                    System.out.println("Digite a quantidade desejada: ");
                    int novaQuantidade = sc.nextInt();
                    sc.nextLine();

                    listaPedidos.alterarPedido(idLanchePedido,
                            novoLanche.getNome(),
                            novaQuantidade,
                            novoLanche.getPrecoUnitario()
                    );

                }

                case 4 -> {
                    listaPedidos.listarPedidos();
                    System.out.println("Informe o id do lanche que deseja remover: ");
                    int idLanchePedido = sc.nextInt();
                    sc.nextLine();
                    listaPedidos.removerPedido(idLanchePedido);
                }

                case 5 -> {
                    System.out.println("O valor total foi R$ " + listaPedidos.calcularValorTotal());
                }

                case 6 -> {
                    System.out.println("Programa finalizado");
                    return;
                }

            }

        }

    }
}