package exercicios;

import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número [999 para parar]: ");
            int numero = sc.nextInt();

            if (numero == 999){
                System.out.println("Finalizado");
                break;
            }
        }

        sc.close();


    }
}
