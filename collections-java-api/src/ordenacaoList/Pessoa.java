package ordenacaoList;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", idade: " + idade + ", altura: " + altura + "\n";
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
   
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
       
        return Double.compare(p1.getAltura(), p2.getAltura());

    }
    
    public static void main(String[] args) {
        
        OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();

        listaPessoas.adicionarPessoa("Bruno", 35, 1.66);
        listaPessoas.adicionarPessoa("Marília", 35, 1.55);
        listaPessoas.adicionarPessoa("Adriana", 54, 1.55);
        listaPessoas.adicionarPessoa("Caio", 6, 1.10);
        listaPessoas.adicionarPessoa("João", 27, 1.90);
        
        System.out.println(listaPessoas.ordenarPorAltura());
        System.out.println();
        System.out.println(listaPessoas.ordenarPorIdade());
        System.out.println();
        
    }


}
