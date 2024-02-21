package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//accepting input from bufferedreader class

public class Percentage {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		int id;
		String name;
		double phy ,chem,maths,total,percentage;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id::");
		id=Integer.parseInt(reader.readLine());
		System.out.println("Enter Name::");
		name=reader.readLine();
		System.out.println("Enter Marks of phy , chem and maths::");
		phy=Double.parseDouble(reader.readLine());
		chem=Double.parseDouble(reader.readLine());
		maths=Double.parseDouble(reader.readLine());

        total=phy+chem+maths;
        System.out.println("total= "+total);
        
        percentage=total/3;
        System.out.println("percentage= "+percentage);
	}

}
