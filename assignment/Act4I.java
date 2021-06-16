//import package io to use InputStreamReader & BufferedReader class
import java.io.*;
class Act4I
{
public static void main (String[] args) throws IOException
{
 BufferedReader inData = new BufferedReader(new
InputStreamReader(System.in));
 //declare variable
String str;
 System.out.println("Enter the data : ");
 str = inData.readLine();//read input that is entered by user
//display an output, str value
 System.out.println("You have entered: " + str);
}//end main()
}//end class
