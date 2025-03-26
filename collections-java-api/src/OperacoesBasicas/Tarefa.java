package OperacoesBasicas;

public class Tarefa {

    private String descricao;

    @Override
    public String toString() {
        return descricao;
    }

    public Tarefa(String descricao){
        this.descricao = descricao;
    
    }

    public String getDescricao(){
        return descricao;
    }
}
