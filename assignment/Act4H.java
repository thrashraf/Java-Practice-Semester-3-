//import package io to use InputStreamReader & BufferedReader class
import java.io.*;
class Act4H
{
public static void main (String[] args) throws IOException
{
InputStreamReader inStream = new InputStreamReader(System.in);
BufferedReader stdin = new BufferedReader(inStream);
//declare variable
 String str;
 int num;
System.out.println("Enter an integer:");
str = stdin.readLine(); //read input that is entered by user
num = Integer.parseInt(str); // convert str to int
//display an input that was entered by user
System.out.println("You have entered an integer value of "+num);
 }//end main()
}//end class