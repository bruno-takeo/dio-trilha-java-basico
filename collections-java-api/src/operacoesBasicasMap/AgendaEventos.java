package operacoesBasicasMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    Map<LocalDate, Evento> listaEventos;

    public AgendaEventos(){
        this.listaEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){

        listaEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> ordemCrescenteData = new TreeMap<>(listaEventos);
        System.out.println(ordemCrescenteData);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dataSet = listaEventos.keySet();
        Collection<Evento> values = listaEventos.values();*/
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> ordemCrescenteData = new TreeMap<>(listaEventos);
        
        for (Map.Entry<LocalDate, Evento> entry : ordemCrescenteData.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " Acontecerá na data: " + entry.getKey());
                break;
            }   
        }
        
    } 

public static void main(String[] args) {
    
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2025, 4, 1), "Evento 1", "Atração 1");
    agendaEventos.adicionarEvento(LocalDate.of(2025, 2, 1), "Evento 2", "Atração 2");
    agendaEventos.adicionarEvento(LocalDate.of(2026, 4, 1), "Evento 3", "Atração 3");
    agendaEventos.adicionarEvento(LocalDate.of(2025, 3, 29), "Evento 4", "Atração 4");
    
    System.out.println("---------------------------------------------");
    agendaEventos.exibirAgenda();
    System.out.println("---------------------------------------------");
    agendaEventos.obterProximoEvento();

}
    
}
