package desafioStreamApi;

/*Com a ajuda da Stream API, encontre o produto de todos
 os números da lista e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        /* O método reduce() aplica uma operação de redução à stream, combinando os elementos
   de forma acumulativa. No exemplo, usamos 1 como valor inicial e, a cada iteração,
   multiplicamos o acumulador (subtotal) pelo próximo número da lista. Assim, obtemos 
   o produto de todos os números da lista. */        
        int produtoNumeros  = numeros.stream().reduce(1, (subtotal, num)-> subtotal * num);

        System.out.println("O Produto da lista de números é " + produtoNumeros);
    }
    
}
