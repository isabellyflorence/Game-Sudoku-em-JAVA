import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sudoku jogo = new Sudoku();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sudoku!");

        while (!jogo.estaCompleto()) {
            jogo.exibirTabuleiro();
            System.out.print("Digite a linha (1-9): ");
            int linha = scanner.nextInt() - 1;
            System.out.print("Digite a coluna (1-9): ");
            int coluna = scanner.nextInt() - 1;
            System.out.print("Digite o número (1-9): ");
            int numero = scanner.nextInt();

            if (jogo.inserirNumero(linha, coluna, numero)) {
                System.out.println("Número inserido com sucesso!");
            } else {
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }

        System.out.println("Parabéns! Você completou o Sudoku!");
        jogo.exibirTabuleiro();
        scanner.close();
    }
}
