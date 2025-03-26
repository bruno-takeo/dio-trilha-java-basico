package ordenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    } 

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenadoPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdenadoPorIdade);

        return listaOrdenadoPorIdade;
    }
    
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaOrdernarPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(listaOrdernarPorAltura, new ComparatorPorAltura());
        
        return listaOrdernarPorAltura;
    }
}
