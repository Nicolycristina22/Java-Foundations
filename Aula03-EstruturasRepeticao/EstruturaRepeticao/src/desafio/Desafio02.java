package desafio;

import java.util.Scanner;

public class Desafio02 {
    //Crie um programa desafiando a máquina
    //A máquina vai gerar um número entre 0 a 100 e você vai tentar acertar esse numero
    //O programa só vai encerrar quando você acertar, informe se o valor que o usuário digitou
    // a maior ou menor o que a gerou

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maquina = (int) (Math.random() * 101);

        while (true){
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            
            if (maquina == numero){
                System.out.println("Você acertou");
                break;
            } else if (numero <  maquina) {
                System.out.println("Informe um número maior");
            }else{
                System.out.println("Informe um número menor");
            }

        }

    }
}
