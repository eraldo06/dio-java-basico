import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {

        double mesada = 50.50;

        while(mesada>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce>mesada) // esse if é só para a conta não ficar negativa
            valorDoce=mesada;

            System.out.println("doce do valor: "+valorDoce+" adicionado no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: "+mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 10);
    }
}
