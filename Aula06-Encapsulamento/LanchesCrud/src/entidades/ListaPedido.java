package entidades;

import java.util.ArrayList;

public class ListaPedido {
    private final ArrayList<Pedido> pedidos = new ArrayList<>();

    //Adicionar Pedido na lista pedidos
    public void adicionarPedido(Pedido pedido) {
        if (pedido.getQuantidade() <= 0 ) {
            System.out.println("Informe um valor maior que zero");
        } else {
            pedidos.add(pedido);
            System.out.println("Pedido realizado com sucesso");
        }
    }

    public void listarPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(" | " + i + pedidos.get(i).toString());
        }
    }

    public void alterarPedido(int id, String nome, int quantidade, double valor) {
        if (quantidade <= 0) {
            System.out.println("Informe um valor maior que zero");
        } else {
            var pedidoAlterado = pedidos.get(id);

            pedidoAlterado.setQuantidade(quantidade);
            pedidoAlterado.setPreco(valor);
            pedidoAlterado.setNomeLanche(nome);
            System.out.println("Pedido alterado com sucesso");

        }

    }

    public void removerPedido(int id){
        pedidos.remove(id);
        System.out.println("Pedido removido com sucesso");
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }

        return total;
    }

}
