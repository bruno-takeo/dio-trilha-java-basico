package desafioStreamApi;

/*Com a Stream API, calcule a média dos números maiores
 que 5 e exiba o resultado no console.*/

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
        double MediaSomaNumerosMaioresCinco = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0);
        
        System.out.println("Soma dos números maiores que cinco: " + MediaSomaNumerosMaioresCinco);
    
    
    
    }
    
}
