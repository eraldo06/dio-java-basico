public class condicional {
    public static void main(String[] args){

        int a, b;
        a = 6;
        b = 7;

        /*String resultado = "";
        if(a==b)
        resultado = "VERDADEIRO";
        else
        resultado = "FALSO";*/


        String resultado = a==b ?"VERDADEIRO" : "FALSO";

        System.err.println(resultado);




         /*
         .equals para objeto
        */
        String nomeUM = "ERALDO";
        String nomeDois = new String("ERALDO");

        System.out.println(nomeUM.equals(nomeDois));

       
    }
}
