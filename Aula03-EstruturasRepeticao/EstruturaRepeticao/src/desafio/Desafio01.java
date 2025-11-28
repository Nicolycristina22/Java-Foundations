package desafio;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        //Desafio
        //Criar um programa que some 6 valores digitados pelo usuário.
        //Porem o programa só vai somar valores impares e multiplos 3

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            int restoImpar = numero % 2;
            int restoMultiplo = numero % 3;

            if (restoImpar == 1 && restoMultiplo == 0){
                soma = soma + numero;
            }
        }

        System.out.println("A soma foi " + soma);

        sc.close();

    }
}
