import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PaymentMethod

{

	public static void main (String [ ] args) throws IOException
	
	{

		int method;
        String method1;

		System.out.println ("Please select thr payment method : \n");
		System.out.println ("Press 1 : Online Banking\n");
		System.out.println ("Press 2 : Credit Card\n");

		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		method1 = br.readLine ( );
		method = Integer.parseInt (method1);

		if (method==1)
		{
			System.out.println ("The supported bank is Bank Islam, Maybank and CIMB \n");
		}

		else if (method==2)
		{
			System.out.println ("VISA only\n");
		}
	}

}