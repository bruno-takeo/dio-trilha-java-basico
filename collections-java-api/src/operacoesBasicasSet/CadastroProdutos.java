package operacoesBasicasSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> listaProdutos;

    public CadastroProdutos(){
        listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade) {

        listaProdutos.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);

        return produtosPorNome;
    }
    
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtoPorPreco.addAll(listaProdutos);

        return produtoPorPreco;
    }

    public void exibirProdutos(){
        System.out.println(listaProdutos);
    }


    public static void main(String[] args) {
        
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Feijão", 12345l, 5.45, 1);
        cadastroProdutos.adicionarProduto("Arroz", 12346l, 5.45, 1);
        cadastroProdutos.adicionarProduto("Macarrão", 12347l, 6.29, 1);
        cadastroProdutos.adicionarProduto("Berinjela", 12348l, 7.10, 1);
        cadastroProdutos.adicionarProduto("Melancia", 12349l, 3.70, 1);
        
        cadastroProdutos.exibirProdutos();
        System.out.println("------------------------");
        System.out.println("Produtos por Nome");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("------------------------");
        System.out.println("Produtos por Preço");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

        
    }
    
}
