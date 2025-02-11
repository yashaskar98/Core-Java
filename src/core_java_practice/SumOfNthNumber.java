package core_java_practice;

import java.util.Scanner;

public class SumOfNthNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enther number to add till then");
		int n = sc.nextInt();
		int sum =0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of "+ n +" number is ="+sum);
		/*
		 * Otherwise you can apply below formula
		 * (n(n+1))/2
		 * for better time complexity
		*/
	}

}
