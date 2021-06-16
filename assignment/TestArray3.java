import java.io.*;
import java.util.*;
public class Bill{
    Scanner scan=new Scanner(System.in);
    int sr, i, quantity[]=new int[20];
    String name, item[]=new String[20];
    float price[]=new float[20];
    float amount[]=new float[20];
    float taxAmount, tax, totalAmount, taxTotalAmount;
    public void input(){
        try{
            System.out.println("Enter the following details:- ");
            System.out.println("\n\nEnter the name of Buyer: ");
            name=scan.nextLine();
            System.out.println("Enter the number of total items purchased(Sr.No.): ");
            sr=scan.nextInt();
            for(i=1; i<=sr; i++){
                System.out.println("Enter the Name of "+i+" item: ");
                item[i]=scan.next();
            }
            for(i=1; i<=sr; i++){
                System.out.println("Enter the Price of \""+item[i]+"\": ");
                price[i]=scan.nextFloat();
            }
            for(i=1; i<=sr; i++){
                System.out.println("Enter the Quantity of \""+item[i]+"\": ");
                quantity[i]=scan.nextInt();
            }
        }
        catch(Exception ioe){
            System.out.println(ioe);
            System.exit(0);
        }
    }

    public void compute(){
        for(i=1; i<=sr; i++){
            amount[i]=price[i]*quantity[i];
            totalAmount+=amount[i];
        }
        if(totalAmount>3000){
            tax=17.5f;
            taxAmount=(totalAmount*tax/100);
            taxTotalAmount=totalAmount+taxAmount;
        }
        else if(totalAmount>1500&&totalAmount<=3000){
            tax=12.0f;
            taxAmount=(totalAmount*tax/100)+(totalAmount);
            taxTotalAmount=totalAmount+taxAmount;
        }
        else{
            tax=7.0f;
            taxAmount=(totalAmount*tax/100)+(totalAmount);
            taxTotalAmount=totalAmount+taxAmount;
        }
    }

    public void display(){
        System.out.println("\n\tBILL:- ");
        System.out.println("Sr.No.\tITEM\t\tPrice\t\tQuantity\tAmount");
        for(i=1; i<=sr; i++)
            System.out.println(i+"\t"+item[i]+"\t\t"+price[i]+"\t\t"+quantity[i]+"   \t\t"+amount[i]);
        System.out.println("\n\n\t\t\t\t\t1. Name of the Buyer:- "+name);
        System.out.println("\t\t\t\t\t2. Total:-             "+totalAmount);
        System.out.println("\t\t\t\t\t3. Tax Amount:-        "+taxAmount);
        System.out.println("\t\t\t\t\t4. Total Amount:-      "+taxTotalAmount);
    }

    public static void main(String[] args){
        Bill obj=new Bill();
        obj.input();
        obj.compute();
        obj.display();
    }
}