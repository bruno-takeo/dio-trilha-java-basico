import java.util.Arrays;
import java.util.List;

/*Com a ajuda da Stream API, filtre os números primos
 da lista e exiba o resultado no console. */

public class Desafio17 {
    public static void main(String[] args) {
        
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> numerosPrimos = numeros.stream().filter(Desafio17::ehPrimo).toList();
    
    if(numerosPrimos.isEmpty()){
        System.out.println("Não exitem números primos na lista");
    
    }else System.out.println("=====Lista de números primos=====\n" + numerosPrimos);
    

    }    

    public static boolean ehPrimo(int numero){

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
