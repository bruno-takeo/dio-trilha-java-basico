import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner teclado = new Scanner(System.in);
         
        System.out.println("Digite o numero da sua conta: ");
        numero = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite sua agencia: ");
        agencia = teclado.nextLine();
        
        System.out.println("Digite seu nome: ");
        nomeCliente = teclado.nextLine();
        
        System.out.println("Infome seu saldo: ");
        saldo = teclado.nextDouble();
        
        System.out.println("------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        
        
        
        
        
        //TODO: conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada
    }
}
