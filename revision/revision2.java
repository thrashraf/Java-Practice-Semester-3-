import java.io.*;
import java.util.Scanner;

class MySejahtera
{
    String name;
    double temp;
    
    MySejahtera()
    {
        System.out.println("WELCOME TO MY SEJAHTERA");
    }
}

public class revision2 extends MySejahtera {
    
    revision2(){
        super();
        System.out.println("SILA PATUHI SOP SBG LANGKAH PENCEGAHAN COVID19");
    }

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

    public static void main(String[] args) {
        
        revision2 my = new revision2();
        
        try{
        my.register();
        } catch(IOException e){
            System.out.println(e);
        }
    }

   
}
