package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    
    List<Item> itensCarrinho;

    public CarrinhoCompras(){
        this.itensCarrinho = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        itensCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemRemovido = new ArrayList<>();
        
        for(Item i : itensCarrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemRemovido.add(i);
            }
        }
        itensCarrinho.removeAll(itemRemovido);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        for(Item i : itensCarrinho){
            valorTotal += (i.getPreco() * i.getQuantidade());
        }

        return valorTotal;
    }

    public void exibirItens(){

        System.out.println(itensCarrinho);
    }

    public static void main(String[] args) {
        
        CarrinhoCompras bruno = new CarrinhoCompras();

        bruno.exibirItens();
        bruno.adicionarItem("Feijão", 8.35, 2);
        bruno.adicionarItem("Arroz", 10.83, 1);
        bruno.adicionarItem("Macarrão", 6.30, 3);
        bruno.exibirItens();
        System.out.println(bruno.calcularValorTotal());
        bruno.removerItem("Feijão");
        bruno.exibirItens();
        System.out.println(bruno.calcularValorTotal());


    }

}
