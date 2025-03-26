package operacoesBasicasSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    Set<Contato> listaContatos;

    public AgendaContatos(){

        listaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){

        listaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){

        System.out.println(listaContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato>contatoPesquisado = new HashSet<>();

        for (Contato c : listaContatos) {
            if(c.getNome().startsWith(nome)){
                contatoPesquisado.add(c);
            }
        }
        return contatoPesquisado;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        
        for(Contato c : listaContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                return c;
            }
        }
        System.out.println("Contato não encontrado");
        return null;    
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Bruno Takeo", 123456);
        agendaContatos.adicionarContato("Bruno Takeo", 754321);
        agendaContatos.adicionarContato("Bruno Miranda", 89897);
        agendaContatos.adicionarContato("Maria Josefa", 123456);
        agendaContatos.adicionarContato("João Silva", 99999);
        System.out.println("Contato Atualizado " + agendaContatos.atualizarNumeroContato("Bruno Takeo", 5689779));

        agendaContatos.exibirContatos();
        System.out.println("---------------------------------");
        agendaContatos.atualizarNumeroContato("Bruno Takeo", 33497155);
        agendaContatos.exibirContatos();
        System.out.println("---------------------------------");
        System.out.println(agendaContatos.pesquisarPorNome("Bruno"));
        
    }
}
