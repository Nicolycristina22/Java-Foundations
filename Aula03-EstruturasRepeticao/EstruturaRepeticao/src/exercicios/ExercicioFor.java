package exercicios;

import java.util.Scanner;

public class ExercicioFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 6; i++){
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            int resto = numero % 2;

            if (resto == 0){
                System.out.println("Número PAR");
                soma = soma + numero;

            }

        }

        System.out.println("A soma de todos os valores pares é igua a " + soma);


        sc.close();

    }

}
