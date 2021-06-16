/**
 * LoopDemo
 */
public class LoopDemo {

    public static void main(String[] args) {
        
        int value = 3;
        int num ,multiple;

        System.out.println("Multiples of 3 :\n");

        for ( num = 1; num <+ 10; num++) {

            multiple = num* value;
            System.out.println("multiples of 3:" + multiple + " " );
            
        }

    }
}