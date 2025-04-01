package brComDio.model;

import java.util.Collection;
import java.util.List;

import static brComDio.model.StatusJogoEnum.COMPLETO;
import static brComDio.model.StatusJogoEnum.INCOMPLETO;
import static brComDio.model.StatusJogoEnum.NAO_INICIADO;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Quadro {
    
    private final List<List<Espaco>> espacos;

    public Quadro(List<List<Espaco>> espacos) {
        this.espacos = espacos;
    }

    public List<List<Espaco>> getEspacos() {
        return espacos;
    }

    public StatusJogoEnum getStatus(){
        if(espacos.stream().flatMap(Collection::stream).noneMatch(s -> !s.isFixo() && nonNull(s.getAtual()))){
            return NAO_INICIADO;
        }

        return espacos.stream().flatMap(Collection::stream).anyMatch(s -> isNull(s.getAtual())) ? INCOMPLETO : COMPLETO;
    }

    public boolean temErro(){
        if(getStatus() == NAO_INICIADO){
            return false;
        }

        return espacos.stream().flatMap(Collection::stream).anyMatch(s -> nonNull(s.getAtual()) && !s.getAtual().equals(s.getEsparado()));
    }

    public boolean alterarValor(final int coluna, final int linha, final int valor) {
        var espaco = espacos.get(coluna).get(linha);
        if(espaco.isFixo()){
            return false;
        }

        espaco.setAtual(valor);
        return true;
    }

    public boolean limparValor(final int coluna, final int linha){
        var espaco = espacos.get(coluna).get(linha);
        if(espaco.isFixo()){
            return false;
        }

        espaco.limparEspaco();
        return true;
    }

    public void reiniciar(){
        espacos.forEach(c -> c.forEach(Espaco::limparEspaco));
    }

    public boolean jogoFinalizado(){
        return !temErro() && getStatus().equals(COMPLETO);
    }


    


}
