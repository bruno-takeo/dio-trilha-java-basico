import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in).useLocale(Lacale.US);

        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobreNome = teclado.next();
        
        System.out.println("Digite sua idade: ");
        int idade = teclado.next();

        

    }
    
}
