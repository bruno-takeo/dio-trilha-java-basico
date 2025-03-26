package operacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> listaProdutos; 
    
    public EstoqueProdutos(){

        listaProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){

        listaProdutos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){

        System.out.println(listaProdutos);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;

        if(!listaProdutos.isEmpty()){
            for (Produto p : listaProdutos.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        
        if(!listaProdutos.isEmpty()){
            for (Produto p : listaProdutos.values()) {
                if(p.getPreco() > maiorValor){
                    maiorValor = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;
        
        if(!listaProdutos.isEmpty()){
            for (Produto p : listaProdutos.values()) {
                if(p.getPreco() < menorValor){
                    menorValor = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorValor = null;
        double maiorValorEstoque = Double.MIN_VALUE;

        if(!listaProdutos.isEmpty()){
            for (Produto p : listaProdutos.values()) {
                if((p.getPreco()*p.getQuantidade()) > maiorValorEstoque){
                    maiorValorEstoque = p.getPreco()*p.getQuantidade();
                    produtoMaiorValor = p;
                }
                
            }
        }
        return produtoMaiorValor;
    }

    public static void main(String[] args) {
        
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(12345l, "Sapado", 1, 50);
        estoqueProdutos.adicionarProduto(12346l, "Chinelo", 3, 20);
        estoqueProdutos.adicionarProduto(12347l, "Sandalha", 3, 10);
        estoqueProdutos.adicionarProduto(12348l, "Meias", 5, 5);

        estoqueProdutos.exibirProdutos();
        System.out.println("--------------------------------");
        System.out.println("Valor Total em Estoque");
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("--------------------------------");
        System.out.println("Produto Mais barato");
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("--------------------------------");
        System.out.println("Produto Mais Caro");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("--------------------------------");
        System.out.println("Produto Maior valor em Estoque");
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        
        
        
    }
}
