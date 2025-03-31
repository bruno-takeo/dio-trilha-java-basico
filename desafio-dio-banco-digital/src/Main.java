import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;
        Conta contaAcessada = null;    
        boolean contaValida = false;



        do {
            System.out.println("===== TERMINAL =====");
            System.out.println("1 - Abrir conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Listar Contas");
            System.out.println("6 - Extrato");
            System.out.println("0 - Encerrar");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    banco.abrirConta();
                    break;
                
                //depositar
                case 2:
                    contaAcessada = null;    
                    contaValida = false;

                    while(!contaValida){
                    System.out.println("Informe o número da conta para depósito: ");
                    int numeroContaAcessada = teclado.nextInt();

                    contaAcessada = banco.getContas().stream().filter(c -> c.getNumeroConta() == numeroContaAcessada).findFirst().orElse(null);

                    if(contaAcessada != null){
                        contaValida = true;
                        System.out.println("Conta N° " + contaAcessada.getNumeroConta() + " acessada");
                        System.out.println("Digite o valor para depósito: ");
                        double valorDeposito = teclado.nextDouble();
                        contaAcessada.depositar(valorDeposito);
                        System.out.println();
                        System.out.println("Depósito realizado com sucesso!");
                        System.out.println(String.format("Novo Saldo: R$ %.2f", contaAcessada.getSaldo()));
                    }else {
                        System.out.println("Conta não encontrada. Verifique o número da conta e tente novamente");
                        
                    }
                }
                break;
                
                //sacar
                case 3:
                    contaAcessada = null;    
                    contaValida = false;

                    while(!contaValida){
                        System.out.println("Informe o número da conta para saque: ");
                        int numeroContaAcessada = teclado.nextInt();

                        contaAcessada = banco.getContas().stream().filter(c -> c.getNumeroConta() == numeroContaAcessada).findFirst().orElse(null);

                        if(contaAcessada != null){
                            contaValida = true;
                            System.out.println("Conta N° " + contaAcessada.getNumeroConta() + " acessada");
                            System.out.println("Digite o valor para saque: ");
                            double valorSaque = teclado.nextDouble();
                            contaAcessada.sacar(valorSaque);
                            System.out.println();
                            System.out.println("Saque realizado com sucesso!");
                            System.out.println(String.format("Novo Saldo: R$ %.2f", contaAcessada.getSaldo()));
                        }else {
                            System.out.println("Conta não encontrada. Verifique o número da conta e tente novamente");
                            
                        }
                }
                break;

                //transferir
                case 4:
                contaAcessada = null;    
                contaValida = false;
                Conta contaRecepitora = null;

                while(!contaValida){
                    System.out.println("Informe o número da conta que deseja acessar: ");
                    int numeroContaAcessada = teclado.nextInt();

                    contaAcessada = banco.getContas().stream().filter(c -> c.getNumeroConta() == numeroContaAcessada).findFirst().orElse(null);

                    if(contaAcessada != null){
                        contaValida = true;
                        System.out.println("Informe o número da conta que para a qual deseja transferir: ");
                        int numeroContaDeposito = teclado.nextInt();
                        contaRecepitora = banco.getContas().stream().filter(c -> c.getNumeroConta() == numeroContaDeposito).findFirst().orElse(null);
                        
                        if(contaRecepitora != null){
                            System.out.println("Informe o valor que deseja transferir: ");
                            Double valorTranferencia = teclado.nextDouble();

                            contaAcessada.transferir(valorTranferencia, contaRecepitora);
                        }

                    }else {
                        System.out.println("Conta não encontrada. Verifique o número da conta e tente novamente");
                        
                    }
            }
            break;

            //listar contas
            case 5:
                banco.listarContas();

                default:
                    break;
            }


            
        } while (opcao != 0);

        teclado.close();

    }
    
}
