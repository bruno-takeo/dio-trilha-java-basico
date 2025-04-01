package brComDio;

import brComDio.model.Quadro;
import brComDio.util.ModeloQuadro;
import brComDio.model.Espaco;

import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class App {

    private final static Scanner teclado = new Scanner(System.in);
    private static Quadro quadro;
    private final static int LIMITE_QUADRO = 9;


    public static void main(String[] args) throws Exception {
        final var posicoes = Stream.of(args).collect(toMap(k -> k.split(";")[0], v -> v.split(";")[1]));

        var opcao = -1;

        while(true){
            System.out.println("Selecione uma das opções a seguir");
            System.out.println("1 - Iniciar um novo Jogo");
            System.out.println("2 - Inserir um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> iniciarJogo(posicoes);
                case 2 -> inserirNumero();
                case 3 -> removerNumero();
                case 4 -> mostrarQuadro();
                case 5 -> mostrarStatusJogo();
                case 6 -> limparJogo();
                case 7 -> finalizarJogo();
                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida. Selecione umas das opções do menu.");
                    
            }
        }
        



    }


    private static void iniciarJogo(Map<String, String> posicoes) {
        if(nonNull(quadro)){
            System.out.println("O jogo já foi iniciado");
            return;
        }

        List<List<Espaco>> espacos = new ArrayList<>();
        for(int i = 0; i < LIMITE_QUADRO; i++){
            espacos.add(new ArrayList<>());
            for(int j = 0; j < LIMITE_QUADRO; j++){
                var configPosicao = posicoes.get("%s,%s".formatted(i, j));
                var esperado = Integer.parseInt(configPosicao.split(",")[0]);
                var fixo = Boolean.parseBoolean(configPosicao.split(",")[1]);
                var espacoAtual = new Espaco(esperado, fixo);
                espacos.get(i).add(espacoAtual);
            }
        }

        quadro = new Quadro(espacos);
        System.out.println("O jogo está pronto para começar");
    }


    private static void inserirNumero() {
        if(isNull(quadro)){
            System.out.println("O jogo ainda não foi iniciado.");
            return;
        }

        System.out.println("Informe a coluna que em que o número será inserido");
        var coluna = executarAteObterNumeroValido(0, 8);
        System.out.println("Informe a linha que em que o número será inserido");
        var linha = executarAteObterNumeroValido(0, 8);
        System.out.printf("Informe o número que vai entrar na posição [%s,%s]\n", coluna, linha);
        var valor = executarAteObterNumeroValido(1, 9);
        if (!quadro.alterarValor(coluna, linha, valor)){
            System.out.printf("A posição [%s,%s] tem um valor fixo\n", coluna, linha);
        }
    }


    private static void removerNumero() {
        if(isNull(quadro)){
            System.out.println("O jogo ainda não foi iniciado");
        }

        System.out.println("Informe a coluna que em que o número será removido");
        var coluna = executarAteObterNumeroValido(0, 8);
        System.out.println("Informe a linha que em que o número será removido");
        var linha = executarAteObterNumeroValido(0, 8);
        if(!quadro.limparValor(coluna, linha)){
            System.out.printf("A posição [%s,%s] tem um valor fixo\n", coluna, linha);
        }
                
    }


    private static void mostrarQuadro() {
        if (isNull(quadro)){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        var args = new Object[81];
        var argPos = 0;
        
        for (int i = 0; i < LIMITE_QUADRO; i++) {
            for (var coluna : quadro.getEspacos()){
                args[argPos ++] = " " + ((isNull(coluna.get(i).getAtual())) ? " " : coluna.get(i).getAtual());
            }
        }

        System.out.println("Seu jogo se encontra da seguinte forma");
        System.out.printf(ModeloQuadro.MODELO_QUADRO, args);
    }




    private static void mostrarStatusJogo() {
        if (isNull(quadro)){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        System.out.printf("O jogo atualmente se encontra no status %s\n", quadro.getStatus().getRotulo());
        if(quadro.temErro()){
            System.out.println("O jogo contém erros");
        } else {
            System.out.println("O jogo não contém erros");
        }
    }

    private static void limparJogo() {
        if (isNull(quadro)){
            System.out.println("O jogo ainda não foi iniciado iniciado");
            return;
        }

        System.out.println("Tem certeza que deseja limpar seu jogo e perder todo seu progresso?");
        var confirma = teclado.next();
        while (!confirma.equalsIgnoreCase("sim") && !confirma.equalsIgnoreCase("não")){
            System.out.println("Informe 'sim' ou 'não'");
            confirma = teclado.next();
        }

        if(confirma.equalsIgnoreCase("sim")){
            quadro.reiniciar();
        }
    
    }


    private static void finalizarJogo() {
        if (isNull(quadro)){
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }

        if (quadro.jogoFinalizado()){
            System.out.println("Parabéns você concluiu o jogo");
            mostrarQuadro();
            quadro = null;
        } else if (quadro.temErro()) {
            System.out.println("Seu jogo contém erros, verifique seu quadro e ajuste-o");
        } else {
            System.out.println("Você ainda precisa preenhcer algum espaço");
        }
    }

    private static int executarAteObterNumeroValido (final int min, final int max){
        var atual = teclado.nextInt();
        while (atual < min || atual > max){
            System.out.printf("Informe um número entre %s e %s\n", min, max);
            atual = teclado.nextInt();
        }
        return atual;
    }


    
}
