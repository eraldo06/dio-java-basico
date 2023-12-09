public class App {
    public static void main(String[] args)  {
        
        Estudante estudante1 = new Estudante();
        estudante1.nome = "eraldo";
        estudante1.idade = 19;
        estudante1.sexo = "M";

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Joao";
        estudante2.idade = 19;
        estudante2.sexo = "M";


        System.out.println(estudante1.teste());
        System.out.println(estudante2.teste());
    

    }

     

}
