public class App {
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola. me chamdo" + nome + " " + sobrenome);
        System.out.println("tenho " + idade);
        System.out.println("altura " + altura);

    }
}
