
/*Utilizando a Stream API, verifique se todos os números
 da lista são iguais e exiba o resultado no console. */

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1);
    
        int primeiro = numeros.get(0);
        boolean todosIguais = numeros.stream().filter(n -> n != primeiro).count() == 0;

        if(todosIguais) System.out.println("São todos iguais");
        else System.out.println("Não são todos iguais");    
    }
    
}
