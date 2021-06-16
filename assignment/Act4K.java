//import util package to use Scanner class
import java.util.*;
class Act4K {
public static void main(String[] args) {
System.out.println("Enter any THREE numbers : ");
//create object of Scanner to invoke method from Scanner class.
Scanner sc = new Scanner(System.in);
/*A Scanner breaks its input into tokens using a delimiter pattern,
which by default matches whitespace. The resulting tokens may then
be converted into values of different types using the various next
methods.*/
 int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();
//calculate num1, num2, num3
int sum = num1*num2-num3;
//display an output, sum
System.out.println("The sum is: "+sum);
}//end main()
}//end class