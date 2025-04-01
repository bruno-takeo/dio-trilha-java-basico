# Desafio DIO Sudoku com Java

## 📌 Sobre o Projeto

Este projeto consiste em um jogo de **Sudoku** implementado em **Java**, totalmente baseado no terminal. O objetivo é permitir que o usuário jogue Sudoku de maneira interativa, com opções para inserir números, remover valores, visualizar o tabuleiro e verificar o status do jogo.

## 🛠 Estrutura do Código

O código é modularizado em diferentes classes, cada uma com responsabilidades específicas:

### **1. ************`App.java`************ (Classe Principal)**

- Gerencia a interação com o usuário através de um menu no terminal.
- Chama métodos responsáveis por iniciar o jogo, modificar o tabuleiro e verificar erros.
- Mantém um loop que permite ao usuário interagir até decidir sair.

### **2. ************`Quadro.java`************ (Tabuleiro do Sudoku)**

- Armazena a grade do Sudoku utilizando uma lista de listas (`List<List<Espaco>>`).
- Controla a lógica de alteração dos valores e verifica se o jogo está completo ou possui erros.
- Métodos principais:
  - `alterarValor(int coluna, int linha, int valor)`: Insere um número em uma posição.
  - `limparValor(int coluna, int linha)`: Remove um número do tabuleiro.
  - `temErro()`: Verifica se há números repetidos na linha, coluna ou bloco 3x3.
  - `jogoFinalizado()`: Confirma se o Sudoku foi resolvido corretamente.

### **3. ************`Espaco.java`************ (Casa do Sudoku)**

- Representa cada célula do tabuleiro.
- Atributos:
  - `atual`: Número atual na célula.
  - `esperado`: Valor correto (usado para validação).
  - `fixo`: Indica se o número é fixo (não pode ser alterado pelo jogador).

### **4. ************`ModeloQuadro.java`************ (Modelo de Impressão)**

- Define um modelo formatado para exibição do tabuleiro no terminal.
- Utiliza placeholders (`%s`) para mostrar os números de forma organizada.

## 🎮 Como Jogar

1. Compile e execute o programa.
2. Escolha uma das opções no menu:
   - `1`: Iniciar um novo jogo.
   - `2`: Inserir um número em uma posição específica.
   - `3`: Remover um número do tabuleiro.
   - `4`: Exibir o tabuleiro atual.
   - `5`: Verificar se há erros no jogo.
   - `6`: Limpar o tabuleiro (reiniciar o jogo mantendo os números fixos).
   - `7`: Finalizar o jogo (checar se está completo e correto).
   - `8`: Sair do jogo.

## 🚀 Melhorias Futuras

- Implementação de níveis de dificuldade.
- Interface gráfica para facilitar a jogabilidade.
- Algoritmo para gerar tabuleiros aleatórios.

