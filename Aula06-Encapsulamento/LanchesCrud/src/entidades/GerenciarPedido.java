package entidades;

import java.util.ArrayList;

public class GerenciarPedido {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado com sucesso!");
    }
}
