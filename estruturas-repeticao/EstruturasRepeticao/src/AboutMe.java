import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobreNome = teclado.next();
        
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();


        System.out.println("Olá me chamo " + nome.toUpperCase() + sobreNome.toUpperCase());
        System.out.println("Tenho " + idade + " de idade");
        System.out.println("Minha altura é " + altura + " Metros");
        teclado.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numericos");
        }





    }
    
}
