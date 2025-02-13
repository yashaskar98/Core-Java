package core_java_practice;

import java.util.Scanner;

public class FebonaciSeriesBetweenTwoNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to find Factorial between that range");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int a =0;
		int b = 1;
		int c =1;
		for(int i=0;c<=n2;i++) {
			c=a+b;
			a=b;
			b=c;
			if(c>=n1 && c<=n2) {
				System.out.print(c+" ");
			}
					
		}
		
	}

}
