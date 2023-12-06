public class ForArray {
    public static void main(String[] args) {
        String alunos []={"eraldo","leo","junior","val"};


        // jeito 01 de fazer
        for(String aluno : alunos){
            System.out.println("nome do aluno é :"+aluno);
        }

        //jeito 02 de fazer

       /*  for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice x= "+x+" é "+alunos[x]);
        }*/
    }
}
