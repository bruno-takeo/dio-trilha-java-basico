package operacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private Map<String, Integer> listaContatos;

    public AgendaContatos(){
        listaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){

        listaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!listaContatos.isEmpty()){
            listaContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(listaContatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroTelefone = null;
        
        if(!listaContatos.isEmpty()){
            numeroTelefone = listaContatos.get(nome);
        }

        return numeroTelefone;
    }

public static void main(String[] args) {
    
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Bruno", 12345);
    agendaContatos.adicionarContato("Maria", 12346);
    agendaContatos.adicionarContato("Caio", 12347);
    agendaContatos.adicionarContato("Daniel", 12348);
    agendaContatos.adicionarContato("Fernando", 12345);
    
    agendaContatos.exibirContatos();
    System.out.println("-----------------------------");
    System.out.println("Numero do contato pesquisado");
    System.out.println(agendaContatos.pesquisarPorNome("Bruno"));
    System.out.println("-----------------------------");
    agendaContatos.removerContato("Fernando");    
    agendaContatos.exibirContatos();


}

}


