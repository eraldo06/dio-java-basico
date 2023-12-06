public class BreakContinue {
    public static void main(String[] args) {
        for(int n =1; n<=5; n++){
            if(n==3)
            continue;
            System.out.println(n);
            
            /*
            1
            2
            4
            5
             */

            for(int n =1; n<=5; n++){
            if(n==3)
            break;
            System.out.println(n);
            
            /*
            1
            2
             */
        }
    }
}
