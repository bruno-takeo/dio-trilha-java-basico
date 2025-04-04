import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        int parametroUm = 0;
        int parametroDois = 0;
        Scanner terminal = new Scanner(System.in);

        do{
            System.out.println("Digite o primeiro parâmetro: ");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            parametroDois = terminal.nextInt();
            
            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            
            }catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
            }
        }while(parametroUm > parametroDois);
        terminal.close();
		
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int c=1; c <= contagem; c++){
            System.out.println("Imprimindo o número " + c);
        }
    }
}
