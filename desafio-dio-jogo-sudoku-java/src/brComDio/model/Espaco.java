package brComDio.model;
public class Espaco {

    private Integer atual;
    private final int esperado;
    private final boolean fixo;
    
    
    public Espaco(int esparado, boolean fixo) {
        this.esperado = esparado;
        this.fixo = fixo;
        if(fixo){
            atual = esperado;
        }
    }


    public Integer getAtual() {
        return atual;
    }

    public void setAtual(Integer atual) {
        if(fixo) return;
        this.atual = atual;
    }

    public void limparEspaco(){
        setAtual(null);
    }

    public int getEsparado() {
        return esperado;
    }


    public boolean isFixo() {
        return fixo;
    }


    

    

    
    
}
