package desafioStreamApi;

/*Utilizando a Stream API, realize a soma dos dígitos de todos
 os números da lista e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(12, 26, 16, 10);
        
        int somaDigitosSeparados = numeros.stream().mapToInt(num -> Integer.toString(num).chars().map(c -> c - '0').sum()).sum();

        System.out.println("A soma dos digitos dos números na lista é " + somaDigitosSeparados);
    
    
    }
    
}
