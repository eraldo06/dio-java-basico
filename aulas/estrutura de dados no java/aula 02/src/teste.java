import java.util.Stack;

public class teste {

    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();

        carros.push("carro 01");
        carros.push("carro 02");
        carros.push("carro 03");
        carros.push("carro 04");
        carros.push("carro 05");

        // mostra toda a array
        System.out.println(carros);

        // topo da fila
        System.out.println("topo da pilha: "+ carros.peek());

        //  retirando da fila
        System.out.println("saiu da fila" + carros.pop());


        
            for(String c:carros){
                System.out.println(c);
            }
    }
    
}
