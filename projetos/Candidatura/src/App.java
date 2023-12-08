import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
      /*   analisarCandidato(1999.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        */
        selecaoCandidatos();

    }

    static void selecaoCandidatos(){
        String [] cantidatos ={"leo","eraldo","junior","valmir"};
        
        int cantidatosSelecionados = 0;
        int cantidatosAtual = 0;
        double salarioBase=2000.0;
        while (cantidatosSelecionados < 5 && cantidatosAtual < cantidatos.length) {

            String candidato = cantidatos[cantidatosAtual];
            double salarioPretendido= valorPretendido();

            System.out.println("O candidato " +candidato +" Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase>=salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                cantidatosSelecionados++;
            }
            cantidatosAtual++;
        }

    }


    // isso é para o valor de valorPretendido ser de 1800 a 2200
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

/* 
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase==salarioPretendido)
        System.out.println("LIGAE PARA O CANDIDATO COM CONTRA PROPOSTA");
        else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    } */
}
