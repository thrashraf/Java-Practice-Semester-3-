import java.io.*;



/**
 * SwitchPaymentMethod
 */
public class SwitchPaymentMethod {

    public static void main(String[] args) throws IOException{
        
        int method;
        String method1;

        System.out.println("please select the payment method : \n");
        System.out.println("press 1 : Online Bankin\n");
        System.out.println("press 2 : Credit Card\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        method1 = br.readLine();
        method = Integer.parseInt(method1);

        switch (method) {
            case 1:

                System.out.println("the supported bank is Bank Islam , Maybank and CIMB");
                
                break;

                case 2:

                System.out.println("Visa Only");
                
                break;
        
            default:
            System.out.println("you are not choose the availabe method ");
                break;
        }
    
    }
}