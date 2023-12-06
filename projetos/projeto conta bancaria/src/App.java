import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.next();

        System.out.println("Digite o sua da agencia: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o valor para depositar: ");
        double dinheiro  = scanner.nextDouble();

        System.out.println(nome +" seu saldo é de "+dinheiro);
        System.out.println("Conta: "+conta);
        System.out.println("Agencia :"+agencia);
    }
}
