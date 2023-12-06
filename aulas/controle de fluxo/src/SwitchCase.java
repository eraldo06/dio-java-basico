public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "g";

        switch (sigla) {
            case "p":{
                System.out.println("pequeno");
                break;
            }
            case "m":{
                System.out.println("medio");
                break;
            }
                case "g":{
                    System.out.println("grande");
                    break;
                }
            default:
            System.out.println("não existe");
                break;
        }
    }
}
