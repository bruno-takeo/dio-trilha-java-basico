import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do {
            opcao = exibirMenuPrincipal(teclado);

            switch (opcao) {
                case 1 -> banco.abrirConta();
                case 2 -> acessarConta(teclado, banco);
                case 3 -> banco.listarContas();
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        teclado.close();
    }

    private static int exibirMenuPrincipal(Scanner teclado) {
        System.out.println("\n===== TERMINAL =====");
        System.out.println("1 - Abrir conta");
        System.out.println("2 - Acessar conta");
        System.out.println("3 - Listar contas");
        System.out.println("0 - Encerrar");
        return lerOpcao(teclado);
    }

    private static void acessarConta(Scanner teclado, Banco banco) {
        while (true) {
            System.out.print("Informe o número da conta que deseja acessar (ou 0 para voltar): ");
            int numeroContaAcessada = teclado.nextInt();
            if (numeroContaAcessada == 0) return;

            Conta conta = banco.getContaPorNumero(numeroContaAcessada);
            if (conta == null) {
                System.out.println("Conta não encontrada. Tente novamente.");
                continue;
            }

            System.out.println("Conta N° " + conta.getNumeroConta() + " acessada");
            menuConta(teclado, banco, conta);
        }
    }

    private static void menuConta(Scanner teclado, Banco banco, Conta conta) {
        int opcao;
        do {
            System.out.println("\n===== CONTA " + conta.getNumeroConta() + " =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Extrato");
            System.out.println("9 - Voltar ao menu principal");
            opcao = lerOpcao(teclado);

            switch (opcao) {
                case 1 -> realizarDeposito(teclado, conta);
                case 2 -> realizarSaque(teclado, conta);
                case 3 -> transferir(teclado, banco, conta);
                case 4 -> conta.imprimirExtrato();
                case 9 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 9);
    }

    private static void realizarDeposito(Scanner teclado, Conta conta) {
        System.out.print("Digite o valor para depósito: ");
        double valor = teclado.nextDouble();
        conta.depositar(valor);
        exibirSaldo(conta);
    }

    private static void realizarSaque(Scanner teclado, Conta conta) {
        System.out.print("Digite o valor para saque: ");
        double valor = teclado.nextDouble();
        conta.sacar(valor);
        exibirSaldo(conta);
    }

    private static void transferir(Scanner teclado, Banco banco, Conta contaOrigem) {
        while (true) {
            System.out.print("Informe o número da conta para transferir (ou 0 para cancelar): ");
            int numeroDestino = teclado.nextInt();
            if (numeroDestino == 0) return;

            Conta contaDestino = banco.getContaPorNumero(numeroDestino);
            if (contaDestino == null) {
                System.out.println("Conta não encontrada. Tente novamente.");
                continue;
            }

            System.out.print("Informe o valor para transferir: ");
            double valor = teclado.nextDouble();

            contaOrigem.transferir(valor, contaDestino);
            System.out.println("Transferência realizada com sucesso!");
            exibirSaldo(contaOrigem);
            exibirSaldo(contaDestino);
            break;
        }
    }

    private static void exibirSaldo(Conta conta) {
        System.out.printf("Saldo da conta %d: R$ %.2f%n", conta.getNumeroConta(), conta.getSaldo());
    }

    private static int lerOpcao(Scanner teclado) {
        try {
            System.out.print("Escolha uma opção: ");
            return teclado.nextInt();
        } catch (InputMismatchException e) {
            teclado.nextLine();
            System.out.println("Entrada inválida. Digite um número.");
            return -1;
        }
    }
}
