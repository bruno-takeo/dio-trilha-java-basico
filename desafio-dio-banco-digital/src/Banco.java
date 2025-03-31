import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco{

    private String nome;
    private List<Conta> contas;

    public Banco(){
        contas = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    public List<Conta> getContas() {
        return contas;
    }

    public Conta getContaPorNumero(int numeroConta) {
        return contas.stream()
            .filter(c -> c.getNumeroConta() == numeroConta)
            .findFirst()
            .orElse(null);
    }

    public void ListarClientes(){
        System.out.println(contas);
    }

    Scanner teclado = new Scanner(System.in);
    int opcao;

    public void abrirConta(){
        System.out.println("===== ESCOLHA O TIPO DE CONTA =====");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("--------------------------------");
        opcao = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeNovoCliente = teclado.nextLine();

        Cliente novoCliente = new Cliente(nomeNovoCliente);
        Conta novaConta = null;

        if(opcao == 1){
            novaConta = new ContaCorrente(novoCliente);
        }
        else if(opcao == 2){
            novaConta = new ContaPoupanca(novoCliente);
        }
        else{
            System.out.println("Opção inválida. Conta não criada");
            return;
        }

        contas.add(novaConta);
        System.out.println("Conta criada com sucesso!");
        System.out.println("Conta: " + novaConta.getNumeroConta());

    }

    public void listarContas(){

        System.out.println(contas);
    }

    
}