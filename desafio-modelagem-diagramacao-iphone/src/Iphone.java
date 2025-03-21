public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {

        System.out.println("Página web: " + url);

    }

    @Override
    public void adicionarAba() {
        
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        
        System.out.println("Página web atualizada");
    }

    @Override
    public void ligar(String numero) {
        
        System.out.println("Ligando para o número : " + numero);


    }

    @Override
    public void atender() {
        
        System.out.println("Ligação atendida");

    }

    @Override
    public void iniciarCorreioVoz() {
        
        System.out.println("Correio de voz iniciado");

    }

    @Override
    public void tocar() {
        
        System.out.println("Reproduzindo música");

    }

    @Override
    public void pausar() {
        
        System.out.println("Música pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        
        System.out.println("Musica " + musica + " selecionada");

    }
    
}
