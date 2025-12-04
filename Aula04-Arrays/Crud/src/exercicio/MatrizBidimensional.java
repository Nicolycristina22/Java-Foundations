package exercicio;

import java.util.ArrayList;
import java.util.Arrays;


public class MatrizBidimensional {
    public static void main(String[] args) {

        ArrayList<String> menuLanches = new ArrayList<>(Arrays.asList(
                "X-Burguer",
                "X-Egg",
                "X-Bacon",
                "X-Salada",
                "X-Tudo"
        ));

        ArrayList<Double> menuPrecos = new ArrayList<>(Arrays.asList(
                22.9,
                24.9,
                26.9,
                26.9,
                29.9
        ));

        System.out.println("-----CARDÁPIO-----");
        for(int i = 0; i < menuLanches.size(); i++){
            System.out.println(i + " - " +  menuLanches.get(i) +  " - " +  menuPrecos.get(i));
        }


    }
}
