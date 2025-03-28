import java.util.Arrays;
import java.util.List;

/*Com a Stream API, encontre a soma dos números da lista que são
 divisíveis tanto por 3 quanto por 5 e exiba o resultado no console. */

public class Desafio19 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 30, 15, 5, 4, 3);

        int somaNumerosDivisiveis3e5 = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(n -> n).sum();

        System.out.println("A soma dos números contidos na lista diviseis por 3 e 5 é " + somaNumerosDivisiveis3e5);

    }
}
