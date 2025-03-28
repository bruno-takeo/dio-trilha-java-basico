package desafioStreamApi;

import java.util.Arrays;
import java.util.List;

/*Utilize a Stream API para verificar se a lista contém 
algum número maior que 10 e exiba o resultado no console. */

public class Desafio6 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 12, 13, 15, 16);

        boolean contemNumeroMaiorDez = numeros.stream().anyMatch(n -> n > 10);
        List<Integer> numerosMaioresDez = numeros.stream().filter(n -> n > 10).toList();

        if(contemNumeroMaiorDez){
             System.out.println("Contém pelo menos um número maior que dez");
             System.out.println("--------------------------------");
             System.out.println("=====Números maiores que 10 contidos na lista=====");
             numerosMaioresDez.forEach(System.out::println);    
            
            }
        else System.out.println("Não contém nenhum número maior que dez");
        


    }
    
}
