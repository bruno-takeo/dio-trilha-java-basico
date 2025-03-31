public abstract class Conta {
    
    @Override
    public String toString() {
        return "Agência: " + agencia + " | Numero da Conta: " + numeroConta + " | Cliente: " + cliente.getNome() + "\n";
    }

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    
    public  void sacar(Double valor){
        if(this.saldo < valor){
            System.out.println("Saldo Insuficiente.");
        }
        else saldo -= valor;
    }

    
    public void depositar(Double valor){
        saldo += valor;
    }

    
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    abstract void imprimirExtrato();

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        
    }

}
