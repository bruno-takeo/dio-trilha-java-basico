package operacoesBasicasSet;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{

    private String nome;
    private Long cod;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, Long cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Codigo: " + cod + " Preço: " + preco + " Quantidade: " + quantidade + "\n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cod == null) ? 0 : cod.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod == null) {
            if (other.cod != null)
                return false;
        } else if (!cod.equals(other.cod))
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}


class comparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {

        return Double.compare(o1.getPreco(), o2.getPreco());
    }

       
}
