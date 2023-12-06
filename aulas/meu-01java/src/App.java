public class App {

    public static void main(String[] args) {
        String primeiroNome = "Eraldo";
        String segundoNome = "Leonardo";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "resultado: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
