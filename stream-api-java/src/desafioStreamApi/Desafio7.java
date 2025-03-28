package desafioStreamApi;

/*Com a ajuda da Stream API, encontre o segundo número maior da lista
 e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
       
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer segudoMaior = numeros.stream().distinct().sorted((n1, n2) -> n2 - n1).skip(1).findFirst().orElse(null);

        if(segudoMaior != null){
            System.out.println("O segundo maior número da lista é " + segudoMaior);
        }
        else{
            System.out.println("Não existe segundo maior número na lista");
        }

    }
    
}
