package core_java_practice;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find Factorial");
		int n = sc.nextInt();
		int a =0;
		int b=1;
		int c=1;
		System.out.print(a+" "+b+" ");
		while(true) {
			c=a+b;
			a=b;
			b=c;
			
			if(c>=n)
				break;
			System.out.print(c+" ");
		}
		
	}
}
