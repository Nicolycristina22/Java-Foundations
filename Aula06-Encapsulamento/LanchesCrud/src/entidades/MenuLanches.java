package entidades;

import java.util.ArrayList;

public class MenuLanches {
    private ArrayList<Lanche> lanches =  new ArrayList<>();

    public MenuLanches() {

        lanches.add(new Lanche("X-Tudo" , 30));
        lanches.add(new Lanche("X-Bacon" , 25));
        lanches.add(new Lanche("X-Egg" , 22));
        lanches.add(new Lanche("X-Salada" , 25));
        lanches.add(new Lanche("X-Frango" , 22));

    }

    public void exibirLanches() {
        System.out.println("----MENU LANCHES----");
        System.out.println("| ID | LANCHES| PREÇO |");
        for (int i = 0; i < lanches.size(); i++) {
            System.out.println("|  " + i + lanches.get(i).toString());
        }
    }

    public Lanche getLanche(int id) {
        return lanches.get(id);
    }


}
