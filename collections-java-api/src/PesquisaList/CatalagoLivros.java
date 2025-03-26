package PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

   private List<Livro> livrosCatalogados;
    
    public CatalagoLivros(){
        this.livrosCatalogados = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosCatalogados.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        
        if(!livrosCatalogados.isEmpty()){
            for(Livro a : livrosCatalogados){
                if(a.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(a);
                }
            }
    }
        return livroPorAutor;
    }

    public List<Livro> pesquisaItervaloAno(int anoIncial, int anoFinal){
        List<Livro> livrosIntervaloAnos = new ArrayList<>();

        if(!livrosCatalogados.isEmpty()){
            for(Livro a : livrosCatalogados){
                if(a.getAnoPublicacao() >= anoIncial && a.getAnoPublicacao() <= anoFinal){
                    livrosIntervaloAnos.add(a);
                }
            }
        }

        return livrosIntervaloAnos;
    }

    public List<Livro> pesquisaPorTitulo (String titulo){
        List<Livro> livroPorTitulo = new ArrayList<>();

        if(!livrosCatalogados.isEmpty()){
            for(Livro a : livrosCatalogados){
                if(a.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo.add(a);
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        
        catalagoLivros.adicionarLivro("Pequeno Principe", "João", 1990);
        catalagoLivros.adicionarLivro("Ferreiro", "João", 1993);
        catalagoLivros.adicionarLivro("Maquiavel", "Jorge", 2000);
        catalagoLivros.adicionarLivro("Senhor dos Aneis", "Tolken", 1985);
        System.out.println(catalagoLivros.pesquisarPorAutor("João"));
        System.out.println(catalagoLivros.pesquisaItervaloAno(1990, 2000));

    }

}
