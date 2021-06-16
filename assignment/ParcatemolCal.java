import java.io.*;
public class ParcatemolCal {

    
    public static void main(String[] args)  throws IOException {
        
        //this is variable declaration
        String name , str , choice;
        int age;

        
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);

        do {

            //take input from user
            System.out.println("Enter Your name : ");
            name = stdin.readLine();
    
            System.out.println("Enter Your age : ");
            str = stdin.readLine();
            age = Integer.parseInt(str);

            System.out.println("\nYour Name is " + name);
            System.out.println("Your Age is : " + age);
    

            //this loop is to measure how many user paracetamol dose.
            if (age >= 1 && age <= 5){
    
            System.out.println("your paracetamol dose is 2.5-5 mL (1/2-1 tsp.)");
              
            }
            
            else if  (age >= 6 && age <= 12){
        
                    System.out.println("your paracetamol dose is 5-10 mL (1-2 tsp.)");
                    
                    }

           else{y
    
                System.out.println("your paracetamol dose is 10-15 mL (2-3 tsp.)");
        
            }

        System.out.println("\nDo you want to continue? : [y/n]");
    }
        // if the user enter n , so the program will end. but if the user enter anything else , the program will loop.
        // charAt() is java take the first character. 
        while (stdin.readLine().charAt(0) != 'n' );
  
}
}

e

