# 🎮 Sudoku em Java - Terminal

## Descrição

Este projeto é um **jogo de Sudoku** implementado em Java para execução no terminal.  
O objetivo do desafio é consolidar conhecimentos em **Programação Orientada a Objetos (POO)**, manipulação de **estruturas de dados**, criação de **métodos e classes**, além de lidar com **entrada e saída de dados** pelo console.

O jogo oferece funcionalidades essenciais de Sudoku, permitindo que o usuário interaja com o tabuleiro, insira números e valide as jogadas.

---

## Funcionalidades

- Representação do **tabuleiro de Sudoku 9x9**.  
- Inserção de números pelo usuário em células específicas.  
- Validação das jogadas (linhas, colunas e blocos 3x3).  
- Atualização do tabuleiro após cada jogada.  
- Verificação de conclusão do jogo com mensagem de vitória.

---

## Estrutura do Projeto

| Classe          | Descrição |
|-----------------|-----------|
| `Main.java`     | Classe principal que inicia o jogo e gerencia o loop principal. |
| `Sudoku.java`   | Classe que representa o tabuleiro e contém regras do Sudoku (validação, inserção, verificação de conclusão). |

> **Observação:** O projeto pode ser expandido com classes adicionais, como `Jogador` ou `Tabuleiro`, para modularizar o código.

---

## Como Executar

### 1️⃣ Estrutura de arquivos

Coloque os arquivos `.java` dentro da pasta `src` do seu projeto:

Sudoku/
└─ src/
├─ Main.java
└─ Sudoku.java

### 2️⃣ Compilar

Abra o terminal dentro da pasta `src` e execute:

javac *.java
3️⃣ Executar

java Main
O programa iniciará no terminal e exibirá o tabuleiro, solicitando as jogadas do usuário.

Exemplo de Interação

Bem-vindo ao Sudoku!

Tabuleiro inicial:
5 _ _ | _ _ 8 | _ _ _
_ _ 3 | _ 1 _ | 2 _ _
_ 7 _ | _ _ _ | _ 6 _

Digite a linha (1-9): 1
Digite a coluna (1-9): 2
Digite o número (1-9): 4

Tabuleiro atualizado:
5 4 _ | _ _ 8 | _ _ _
_ _ 3 | _ 1 _ | 2 _ _
_ 7 _ | _ _ _ | _ 6 _
Observações
Números já preenchidos não podem ser sobrescritos.

O jogo verifica automaticamente a validade das jogadas antes de inserir o número.

Possíveis melhorias:

Níveis de dificuldade (fácil, médio, difícil).

Sistema de pontuação.

Salvar e carregar partidas.
