import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentanto = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentanto = !atendeu;
            if(continuarTentanto){
                tentativasRealizadas++;
            }
            else{
                System.out.println("Contato realizado com sucesso");
            }
        }
        while(continuarTentanto && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        }
        else{
            System.out.println("Não conseguimos contato com " + candidato + ", numero máximo de tentativas " + tentativasRealizadas + " tentativas");
        }

    }
    //metodo atender
    static boolean atender(){
        return new Random().nextInt(3)==1;

    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Canditaos seleciona com seus respectivos indices");
        
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("Canditato n° " + (indice+1) + " é " + candidatos[indice]);
        }
        //forma abreviada sem índice
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }


    static void analisarCanditado(double salarioPretendido){
        double salarioBase = 2000;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o canditado");
        }

        else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para o canditato com contra proposta");
        }

        else{
            System.out.println("Aguardando demais canditatos");
        }
    }
}
