import java.util.Arrays;

public class teste {
    public static void main(String[] args){
        int[] nu=new int[5];
        int[] nu2={10,20,20,30,40};

        for(int i=0;i<nu2.length; i++){
            System.out.println(nu2[i]);
        }

        Arrays.sort(nu2); // ele vai ordenar todos os numeros, do menor para o maior.
        Arrays.fill(nu2, 10); // todos os lugares que tiver em branco ele vai preencher com o 10.
    }

}
