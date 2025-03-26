package operacoesBasicasMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

    Map<String, Livro> listaLivro;

    public LivrariaOnline(){
        listaLivro = new HashMap<>();
    }
    
    public void adicionarLivro(String link, String titulo, String autor, double preco){

        listaLivro.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        
        for (Map.Entry<String, Livro> entry : listaLivro.entrySet()) {
            if(entry.getValue().getTitulo().equals(titulo)){
                listaLivro.remove(entry.getKey());
                break;
            }
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosOrdenadosPorPreco = new ArrayList<>(listaLivro.entrySet());

        livrosOrdenadosPorPreco.sort(Comparator.comparing(entry -> entry.getValue().getPreco()));
        System.out.println("====Livros Ordenados por Preçço===");
        for(Map.Entry<String, Livro> entry : livrosOrdenadosPorPreco){
            System.out.println("Link: " + entry.getKey() + " | Título: " + entry.getValue().getTitulo() + " | Autor: " + entry.getValue().getAutor() + " | Preço: " + entry.getValue().getPreco());
        } 

    }

    public void pesquisarLivrosPorAutor(String autor){
        boolean encontrado = false;
        
        System.out.println("=====Livros do autor " + autor + "=====");
        for (Map.Entry<String, Livro> entry : listaLivro.entrySet()) {
            if(entry.getValue().getAutor().equalsIgnoreCase(autor)){
                System.out.println("Título: " + entry.getValue().getTitulo() + " | Preço: " + entry.getValue().getPreco());    
            encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Autor não encotrado.");
        }
    }

    public List<Livro> obterLivroMaisCaro(){
        List<Livro> livroMaisCaro = new ArrayList<>();
        double maiorPreco = Double.MIN_VALUE;

        for(Livro livro : listaLivro.values()){
            if(maiorPreco < livro.getPreco()){
                maiorPreco = livro.getPreco();
                livroMaisCaro.clear();
            }
            if(Double.compare(maiorPreco, livro.getPreco()) == 0) {
                livroMaisCaro.add(livro);
            }
        }
        return livroMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato(){
        List<Livro> livroMaisBarato = new ArrayList<>();
        double menorPreco = Double.MAX_VALUE;

        for(Livro livro : listaLivro.values()){
            if(menorPreco > livro.getPreco()){
                menorPreco = livro.getPreco();
                livroMaisBarato.clear();
            }
            if(Double.compare(menorPreco, livro.getPreco()) == 0) {
                livroMaisBarato.add(livro);
            }
        }
        return livroMaisBarato;
    }



    public static void main(String[] args) {
        
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("345678", "Livro 1", "Autor 1", 10);
        livrariaOnline.adicionarLivro("345679", "Livro 2", "Autor 2", 11);
        livrariaOnline.adicionarLivro("345680", "Livro 3", "Autor 3", 12);
        livrariaOnline.adicionarLivro("345681", "Livro 4", "Autor 4", 13);
        
        livrariaOnline.exibirLivrosOrdenadosPorPreco();
        System.out.println("---------------------------------");
        System.out.println("=====Livro mais Barato=====");
        System.out.println(livrariaOnline.obterLivroMaisBarato());
        System.out.println("---------------------------------");
        System.out.println("=====Livro mais Caro=====");
        System.out.println(livrariaOnline.obterLivroMaisCaro());

    }

}
