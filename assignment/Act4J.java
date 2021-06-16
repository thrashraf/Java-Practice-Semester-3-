
import java.io.*;
class Act4J
{
public static void main (String[] args) throws IOException
{
 BufferedReader inData = new BufferedReader(new

 InputStreamReader(System.in));
//declare variable
String str;
String num1, num2, num3;
int number1, number2, number3;
 System.out.println("Enter your name : ");
 str = inData .readLine();//read input that is entered by user

 System.out.println("Enter first number : ");
 num1 = inData .readLine();//read input that is entered by user
//convert @parsing String(num1) to integer data type
 number1=Integer.parseInt(num1);

System.out.println("Enter second number : ");
 num2 = inData .readLine();//read input that is entered by user
 //convert @parsing String(num1) to integer data type
 number2=Integer.parseInt(num2);
 System.out.println("Enter third number : ");
 num3 = inData .readLine();//read input that is entered by user
 //convert @parsing String(num1) to integer data type
 number3=Integer.parseInt(num3);

 //calculate number1, number2 & number3
int total = number1+number2*(number3/number1);
//display output
System.out.println("Details:");
 System.out.println("Name entered: " + str);
 System.out.println("Number entered: " + number1 +
 "," + number2 + "," + number3);
 System.out.println("The total is: "+ total);
}//end main()
}//end class