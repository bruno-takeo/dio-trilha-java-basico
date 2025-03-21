import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;
        boolean sair = false;

        do{
            System.out.println("==========Iphone==========");
            System.out.println("Selecione qual sistema deseja utilizar: ");
            System.out.println("1 - Reprodutor musical");
            System.out.println("2 - Aparelho telefônico");
            System.out.println("3 - Navegador de internet");
            System.out.println("0 - Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: //reprodutor musical
                    do{
                    System.out.println("=======Escolha a função=======");
                    System.out.println("1 - Tocar música");
                    System.out.println("2 - Pausar música");
                    System.out.println("3 - Selecionar música");
                    System.out.println("0 - Voltar");
                    opcao = teclado.nextInt();
                    teclado.nextLine();
                    
                    if (opcao == 1){
                        Iphone iphone = new Iphone();
                        iphone.tocar();
                    } 
                    else if(opcao == 2){
                        Iphone iphone = new Iphone();
                        iphone.pausar();
                    }
                    else if(opcao == 3){
                        Iphone iphone = new Iphone();
                        String nomeMusica;
                        System.out.println("Digite o nome da música: ");
                        nomeMusica = teclado.nextLine();
                        iphone.selecionarMusica(nomeMusica);
                        System.out.println();
                    }
                    else if(opcao == 0){
                        sair = false;
                    }
                    else{
                        System.out.println("Opção inválida");
                    }    
                

                }while(opcao != 0);
                break;

                case 2: //aparelho telefonico
                    do{
                        System.out.println("=======Escolha a função=======");
                        System.out.println("1 - Ligar");
                        System.out.println("2 - Atender");
                        System.out.println("3 - Iniciar correio de voz");
                        System.out.println("0 - Voltar");
                        opcao = teclado.nextInt();
                        teclado.nextLine();
                        
                        if (opcao == 1){
                            Iphone iphone = new Iphone();
                            String numero;
                            System.out.println("Digite o número de telefone: ");
                            numero = teclado.nextLine();
                            iphone.ligar(numero);
                            System.out.println();
                        } 
                        else if(opcao == 2){
                            Iphone iphone = new Iphone();
                            iphone.atender();
                            System.out.println();
                        }
                        else if(opcao == 3){
                            Iphone iphone = new Iphone();
                            iphone.iniciarCorreioVoz();
                            System.out.println();
                        }
                        else if(opcao == 0){
                            sair = false;
                        }
                        else{
                            System.out.println("Opção inválida, tende novamente");
                            System.out.println();
                        }    
                    
                    
                    }while(opcao != 0);
                    break;
                case 3://navegador internet
                    do{
                        System.out.println("=======Escolha a função=======");
                        System.out.println("1 - Exibir página web");
                        System.out.println("2 - Adicionar nova aba");
                        System.out.println("3 - Atualizar página web");
                        System.out.println("0 - Voltar ao menu inicial");
                        opcao = teclado.nextInt();
                        teclado.nextLine();
                        
                        if (opcao == 1){
                            Iphone iphone = new Iphone();
                            String url;
                            System.out.println("Informa a url da página: ");
                            url = teclado.nextLine();
                            iphone.exibirPagina(url);
                            System.out.println();
                        } 
                        else if(opcao == 2){
                            Iphone iphone = new Iphone();
                            iphone.adicionarAba();
                            System.out.println();
                        }
                        else if(opcao == 3){
                            Iphone iphone = new Iphone();
                            iphone.atualizarPagina();
                            System.out.println();
                        }
                        else if(opcao == 0){
                            sair = false;
                        }
                        else{
                            System.out.println("Opção inválida tente novamente");
                            System.out.println();
                        }    
                }while(opcao != 0);
                break;

                case 0: //sair
                    System.out.println("Encerrando...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção invalida tente novamente");
                    System.out.println();
                    break;
                       

            }




        }while(!sair);
        teclado.close();
    }
}
