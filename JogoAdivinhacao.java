import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativasRestantes = 5;

        System.out.println("=== BEM-VINDO AO JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Você tem 5 tentativas para acertar o número entre 1 e 100");

        while (tentativasRestantes > 0) {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativasRestantes--;

            if (tentativa < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.printf("Parabéns! Você acertou o número secreto com %d tentativa(s) restante(s)!\n", tentativasRestantes);
                break;
            }

            if (tentativasRestantes > 0) {
                System.out.printf("Tentativas restantes: %d\n", tentativasRestantes);
            } else {
                System.out.printf("Suas tentativas acabaram! O número secreto era: %d\n", numeroSecreto);
            }
        }

        System.out.println("Obrigado por jogar!");
        System.out.println("=== FIM DO JOGO ===");

        scanner.close();
    }
}







