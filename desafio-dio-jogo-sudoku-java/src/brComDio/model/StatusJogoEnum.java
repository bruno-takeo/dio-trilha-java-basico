package brComDio.model;

public enum StatusJogoEnum {
    
    NAO_INICIADO("não iniciado"),
    INCOMPLETO("incompleto"),
    COMPLETO("completo");

    private String rotulo;

    StatusJogoEnum(final String label){
        this.rotulo = label;
    }

    public String getRotulo() {
        return rotulo;
    }




}
