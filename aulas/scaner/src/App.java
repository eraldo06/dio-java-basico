import java.util.Scanner;

public class App {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int n1,n2,n3;
       String nome;


       System.out.println("Digite seu nome:");
       nome=scan.nextLine();
       System.out.println("Digite seu numero:");
       n1=scan.nextInt();
       System.out.println("Digite seu numero:");
       n2=scan.nextInt();
       n3=n1+n2;
       System.out.println("seus dados: " + nome +n1+n2+n3);
    }
}
