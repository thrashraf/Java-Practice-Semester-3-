import java.io.*;


/**
 * MyInput
 */
public class string{

      public static void main(String[] args) throws IOException
      {
            BufferedReader bb=new BufferedReader(new InputStreamReader(System.in));

            String input1;
            input1=bb.readLine();
            System.out.println("ENTER YOUR BIRTH");
            System.out.println("YOUR BIRTH:"+input1);

            String name;
            name=bb.readLine();
            System.out.println("ENTER YOUR NAME");
            System.out.println("YOUR NAME:"+name);


      }
}
