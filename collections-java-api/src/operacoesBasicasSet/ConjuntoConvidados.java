package operacoesBasicasSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> listaConvidados;

    public ConjuntoConvidados(){
        listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){

        listaConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for (Convidado c : listaConvidados) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }           
        }
        listaConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){

        return listaConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(listaConvidados);
    }

    public static void main(String[] args) {
        
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Bruno", 1235);
        conjuntoConvidados.adicionarConvidado("joão", 1235);
        conjuntoConvidados.adicionarConvidado("Marilia", 1236);
        conjuntoConvidados.adicionarConvidado("Caio", 1237);
        conjuntoConvidados.adicionarConvidado("Adriana", 1238);
        conjuntoConvidados.adicionarConvidado("Fernando", 1239);
        
        System.out.println(conjuntoConvidados.contarConvidados());
        System.out.println();
        conjuntoConvidados.exibirConvidados();
        System.out.println();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}




