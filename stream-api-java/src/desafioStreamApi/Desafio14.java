package desafioStreamApi;

/*Com a Stream API, encontre o maior número primo 
da lista e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    
        List<Integer> numerosPrimos = numeros.stream().distinct().filter(Desafio14::ehPrimo).toList();


        System.out.println("Lista de números primos");
        System.out.println(numerosPrimos);

        
        
    }
    
    public static boolean ehPrimo(int numero) {
        if(numero < 2){
            return false;
        }
    
        for(int i = 2; i * i <= numero; i++){
            
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    
}

