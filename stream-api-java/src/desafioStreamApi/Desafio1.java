package desafioStreamApi;
/*Crie um programa que utilize a Stream API para ordenar a lista de números
 em ordem crescente e a exiba no console.*/

import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // distinct() remove os números duplicados da lista
        // sorted() ordena os números em ordem crescente
        // toList() coleta o resultado da Stream em uma nova lista
        List<Integer> ordemCrescente = numeros.stream().distinct().sorted().toList();

        //usando forEach com metodo de referencia para percorrer a lista e imprimindo o numero
        // e pulando a linha usando println
        ordemCrescente.forEach(System.out::println);
        //imprimindo a lista diretamente
        System.out.println(ordemCrescente);
    }    
}
