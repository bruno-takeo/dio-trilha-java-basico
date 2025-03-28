package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exemplo1 {

    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "phyton", "javascript", "c", "go", "ruby");

        // Usar o Predicate com expressão lambda para filtrar palavras com mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        palavras.stream().filter(maisDeCincoCaracteres).toList().forEach(System.out :: println);

  }
    
}
