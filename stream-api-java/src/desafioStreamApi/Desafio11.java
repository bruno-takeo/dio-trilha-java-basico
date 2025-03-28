package desafioStreamApi;

/*Utilizando a Stream API, encontre a soma dos quadrados
 de todos os números da lista e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
    
        List<Integer> numeros = Arrays.asList(2, 2);

        int numerosAoQuadradoSomados = numeros.stream().mapToInt(n -> n * n).sum();

        System.out.println(numerosAoQuadradoSomados);
    }
    
    
    

}
