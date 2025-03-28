package Supplier;

import java.util.List;
//import java.util.function.Supplier; caso use suplier pra indicar por fora
import java.util.stream.Stream;

public class Exemplo1{

    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        //Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
    
        // Usar o Supplier para obter uma lista com 3 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, sejam bem-vindos!").limit(3).toList();
        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
      }

}