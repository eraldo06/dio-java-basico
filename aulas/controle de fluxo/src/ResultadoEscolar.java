public class ResultadoEscolar {

    public static void main(String[] args) throws Exception {
       int nota = 4;


       //primeiro jeito de fazer
        if(nota>=7)
        System.out.println("aprovado");

        else if(nota >=5 && nota <7)
        System.out.println("recuperação");

        else
        System.out.println("reprovado");



        // segundo jeito de fazer
        String resultado = nota >=7 ? "aprovado" : "reprovado";
        System.out.println(resultado);


        // terceiro jeito de fazer
        String resultado1 = nota >=7 ? "aprovado" : nota >=5 && nota <7 ? "recuperação" : "reprovado";
        System.out.println(resultado1);
    
    }
    
}
