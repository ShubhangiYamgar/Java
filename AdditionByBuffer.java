package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionByBuffer {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		int a, b, c;
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of a::");
		a=Integer.parseInt(reader.readLine());
		System.out.println("Enter value of b::");
		b=Integer.parseInt(reader.readLine());
		
        c=a+b;
        System.out.println("Addition= "+c);
        
        c=a-b;
        System.out.println("Substraction= "+c);
        
        c=a*b;
        System.out.println("Multiplication= "+c);
        
        c=a/b;
        System.out.println("Division= "+c);
        
	}

}

