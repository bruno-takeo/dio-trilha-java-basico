public class Cliente {

    private static Long GERADOR_ID = 1l;

    private Long id;
    private String nome;

    public Cliente(String nome){
        this.id =  GERADOR_ID++;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | NOME: " + nome + "\n";
    }

    

    
    
}
