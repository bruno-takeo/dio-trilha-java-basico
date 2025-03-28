
/*Utilize a Stream API para agrupar os números em duas listas separadas,
 uma contendo os números pares e outra contendo os números ímpares da lista original,
  e exiba os resultados no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).toList();
        
        System.out.println("=====Lista de Número pares=====\n" + pares);
        System.out.println("--------------------------------");
        System.out.println("=====Lista de Número ímpares=====\n" + impares);
    }
    
}
