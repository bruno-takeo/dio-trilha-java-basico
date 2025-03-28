package desafioStreamApi;

/*Com a Stream API, verifique se todos os números da lista
 são distintos (não se repetem) e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
        

        Boolean temRepetidos = numeros.stream().distinct().count() < numeros.size();

        if(temRepetidos){
            System.out.println("Tem números repetidos");
        }

        else{
            System.out.println("Não há números repetidos na lista");
        }
    
    }
    
}
