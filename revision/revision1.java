import java.io.*;


class Person {

    protected String name , weight , height;
    protected double w = 0,h = 0;

    public void insert()throws IOException{
        BufferedReader b=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        name=b.readLine();
        System.out.print("Your Weight (kg) : ");
        weight=b.readLine();
        w=Double.parseDouble(weight);
        System.out.print("Your Height (meter) : ");
        height=b.readLine();
        h=Double.parseDouble(height);
        }
        
    
}

class revision1 extends Person {

    void calculateBMI(){

        double BMI = w / (h*h);

        System.out.println(BMI);

        if(BMI > 19 && BMI < 25){

            System.out.println("GOOD");
        }else{

            System.out.println("BAD");
        }
    }

    public static void main(String[] args) {
        
        revision1 bmi = new revision1();

        try{
        bmi.insert();
        bmi.calculateBMI();
        } catch(IOException e){

            System.out.println(e);
        }
    }
}
