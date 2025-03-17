import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        int mesada = 50;

        while( mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            
            System.out.println("Doce do valor " + valorDoce + " adicionado no carrinho");
            mesada -= valorDoce;

        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda sua mesada em doces");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
