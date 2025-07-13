package jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        System.out.println("=== BEM-VINDO AO JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número entre 1 e 100");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.printf("Parabéns! Você acertou em %d tentativas!\n", tentativas);
            }

        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}




