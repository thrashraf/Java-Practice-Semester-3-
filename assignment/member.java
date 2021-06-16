import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * MembershipDiscount
 */
public class member {

    public static void main(String[] args)throws IOException {

        int years;
        String years1;
        for (int i = 0; i<6; i++){
        
        System.out.println("Please enter how many years you have become member:\n");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        years1 = br.readLine();
        years = Integer.parseInt(years1);

        
            
            
            

        if ((years >=1) && (years <=3)){

            System.out.println("You are entitled for 10% discount\n");

        }

        else if ((years >=4) && (years <=6)){

            System.out.println("You are entitled for 20% discount\n");

        }

        else if ((years >=7) && (years <=9)){

            System.out.println("You are entitled for 30% discount\n");

        }

        else if (years >=10){

            System.out.println("You are entitled for 40% discount\n");

        }

        else {

            System.out.println("You are not member yet\n");

        }
        
            }
    }
}
