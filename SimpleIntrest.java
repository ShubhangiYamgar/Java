package Basic;

import java.util.Scanner;

public class SimpleIntrest {
 public static void main(String args[]) {
	 float pa,rate,time,si;
	 
	 Scanner sc = new Scanner(System.in);
		System.out.println("enter Principle Amount, rate, time::");
		pa=sc.nextInt();
		rate=sc.nextInt();
		time=sc.nextInt();
		
		si=(pa*rate*time)/100;
		
		System.out.println("Simple Intrest=" +si);

 }
}
