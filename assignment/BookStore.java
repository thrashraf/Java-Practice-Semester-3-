import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BookStore{
    public static void main(String args[]) throws IOException{

        // this is variable declaration
        int quantity = 0 ;
        double totalPrice = 0;
        String str ;

        // array declaration
        double[] Price = new double[20];
        String[] ProductName = new String[20];

        InputStreamReader Instream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(Instream);

        System.out.println("Enter how many item you want to get in");
        str = stdin.readLine();
        quantity = Integer.parseInt(str);

        //this is user input
       for( int i = 0 ; i < quantity ; i++) {

        System.out.println("Enter Item Name : ");
        ProductName[i] = stdin.readLine();
        
        System.out.println("Enter Price : ");
        Price[i] =Double.parseDouble(stdin.readLine());

        // this is formula how to calculate total price
        totalPrice = totalPrice + Price[i];

       }

        //this is how to display bill
        System.out.println("|*________________________________BILL__________________________________________*|");
        System.out.println("\nItem No \t\t\t Item Name \t\t\t\t Price ");
        System.out.println(" ");

       for(int i = 0 ; i < quantity ; i++ ){

        System.out.println(i+1 + "." + "\t\t\t\t "+ ProductName[i] + "\t\t\t\t RM " + Price[i]);

        }
        System.out.println("\n|*______________________________________________________________________________*|");
        System.out.println("\nTotal Quantity :\t\t\t\t\t\t\t X" + quantity);
        System.out.println("Total Amount :\t\t\t\t\t\t\t\t RM " + totalPrice);
        System.out.println("\n|*________________________THANK YOU FOR BUYING WITH US!_________________________*|");

    }
 }
