package operacoesBasicasSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class GerenciadorAlunos {

    Set<Aluno> listaAlunos;

    public GerenciadorAlunos(){

        listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){

        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    public Aluno removerAluno(long matricula){
        Aluno alunoRemovido = null;

        for (Aluno a : listaAlunos) {
            if(Objects.equals(a.getMatricula(), matricula)){
                alunoRemovido = a;
                break;
            }   
        }
        if(alunoRemovido != null){
            listaAlunos.remove(alunoRemovido);
        }
        return alunoRemovido;
    }

    public void exibirAlunosPorNome(){
        List<Aluno> alunosOrdemAlfabetica = new ArrayList<>(listaAlunos);
        Collections.sort(alunosOrdemAlfabetica);
        System.out.println("ORDEM ALFABÉTICA");
        System.out.println(alunosOrdemAlfabetica);
    }

    public void exibirAlunosPorNota(){
        List<Aluno> notasOrdemCrescente = new ArrayList<>(listaAlunos);
        Collections.sort(notasOrdemCrescente, new ComparatorPorMedia());
        System.out.println("NOTAS ORDEM CRESCENTE");
        System.out.println(notasOrdemCrescente);
    }
    
    public void exibirAlunos(){
        System.out.println(listaAlunos);
    }


    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        
        gerenciadorAlunos.adicionarAluno("Bruno", 12346l, 3.5);
        gerenciadorAlunos.adicionarAluno("Bruno", 12348l, 8.2);
        gerenciadorAlunos.adicionarAluno("Caio", 12347l, 5.5);
        gerenciadorAlunos.adicionarAluno("Eliana", 12455l, 4.5);
        gerenciadorAlunos.adicionarAluno("Ana", 12345l, 3.5);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("------------------------");
        gerenciadorAlunos.exibirAlunosPorNome();
        System.out.println("------------------------");
        gerenciadorAlunos.exibirAlunosPorNota();
        System.out.println("------------------------");
        System.out.println("Aluno Removido: " + gerenciadorAlunos.removerAluno(12345l));
        System.out.println("------------------------");
        gerenciadorAlunos.exibirAlunos();
    }
}
