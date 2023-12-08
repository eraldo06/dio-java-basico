import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try{
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobre nome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola. me chamdo" + nome + " " + sobrenome);
        System.out.println("tenho " + idade);
        System.out.println("altura " + altura);
    }
    catch(InputMismatchException e){
        System.out.println("ops, deu erro");
    }
}
}
