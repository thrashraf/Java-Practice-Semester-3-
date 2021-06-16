import java.io.*;
import java.util.Scanner;
/**
 *  This class holds data of a MySejahtera.
 */
class MySejahtera {

    //declaration variable
    String name; 
    double temp;
    
    //contructor accepts MySejahteras's  name and temp
    MySejahtera(){
        System.out.println("WELCOME TO MY SEJAHTERA");
    }
    
    //method MySejahtera
    void register()throws IOException{
        
        
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Enter Name : ");
        name = stdin.nextLine();

        System.out.println("Enter Temperature : ");
        temp = stdin.nextDouble();

        System.out.println("Hi " + name);

        if(temp < 37.5){
            System.out.println("Low Risk");
        }else{
            System.out.println("High Risk");
        }
    }

    
}
/**
 *  This class holds data of a Users.
 */
public class syuRevi extends MySejahtera{

    public syuRevi() {
        super();
        System.out.println("SILA PATUHI SOP SBG LANGKAH PENCEGAHAN COVID19");   
     }

     void display() {
           
        System.out.println("SILA PATUHI SOP SBG LANGKAH PENCEGAHAN COVID19");
     }

     void displayMethod() {

        if (temp >= 37.5){
            System.out.println("High Risk");
           }
           else{
              System.out.println("Low Risk");
           }
      }

     public static void main(String[] args) throws IOException {

        String name; 
        double temp;

        //create a users object
        syuRevi U = new syuRevi();
       

        try{
            U.register();
            } catch(IOException e){
                System.out.println(e);
            }

        
     }
}