package Basic;

import java.util.Scanner;

public class PercentageGrade {
 
	public static void main(String args[]) {
		
		float phy ,che,math;
		double total,percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of three subjects");
		
		phy=sc.nextFloat();
		che=sc.nextFloat();
		math=sc.nextFloat();
		
		total=phy+che+math;
		System.out.println("total=" +total);
		percentage=total/3;
		System.out.println("percentage=" +percentage);
        
		if(percentage>=90) {
			System.out.println("A+");
		}
		else if(percentage>=76) {
			System.out.println("A");
		}
		else if(percentage>=60) {
			System.out.println("B+");
		}
		else if(percentage>=50) {
			System.out.println("B");
		}
		else {
			System.out.println("fail");
		}
	}
}
