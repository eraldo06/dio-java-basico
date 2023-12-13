public class App {
    public static void main(String[] args) {

        No<String> no1 = new No<String>("conteudo 01");

        No<String> no2 = new No<String>("conteudo 02");
        no2.setProximo(no2);

        No<String> no3 = new No<String>("conteudo 03");
        no3.setProximo(no3);

        No<String> no4 = new No<String>("conteudo 04");
        no4.setProximo(no4);
      
    }
}
