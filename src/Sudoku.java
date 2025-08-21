class Sudoku {
    private int[][] tabuleiro = new int[9][9];

    public Sudoku() {
        // Tabuleiro inicial com alguns números pré-definidos (pode ser personalizado)
        tabuleiro[0][0] = 5; tabuleiro[0][5] = 8;
        tabuleiro[1][2] = 3; tabuleiro[1][4] = 1; tabuleiro[1][6] = 2;
        tabuleiro[2][1] = 7; tabuleiro[2][7] = 6;
        // Restante do tabuleiro inicia com 0 (vazio)
    }

    public void exibirTabuleiro() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(tabuleiro[i][j] == 0 ? "_ " : tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean inserirNumero(int linha, int coluna, int numero) {
        if (numero < 1 || numero > 9 || linha < 0 || linha > 8 || coluna < 0 || coluna > 8) {
            return false;
        }
        if (tabuleiro[linha][coluna] != 0) {
            return false; // Não sobrescreve números já preenchidos
        }
        if (!valido(linha, coluna, numero)) {
            return false; // Validação de Sudoku
        }
        tabuleiro[linha][coluna] = numero;
        return true;
    }

    private boolean valido(int linha, int coluna, int numero) {
        // Verifica linha
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[linha][i] == numero) return false;
        }
        // Verifica coluna
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[i][coluna] == numero) return false;
        }
        // Verifica bloco 3x3
        int blocoLinha = (linha / 3) * 3;
        int blocoColuna = (coluna / 3) * 3;
        for (int i = blocoLinha; i < blocoLinha + 3; i++) {
            for (int j = blocoColuna; j < blocoColuna + 3; j++) {
                if (tabuleiro[i][j] == numero) return false;
            }
        }
        return true;
    }

    public boolean estaCompleto() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (tabuleiro[i][j] == 0) return false;
        return true;
    }
}
