package BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Exemplo1 {

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream().reduce(0, somar);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
        
}
