package core_java_practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find prime Or Not");
		int n = sc.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(n+" is not a prime number.");
				break;
			}else if(i==n/2) {
				System.out.println(n+" is a prime number.");
			}
		}
	}

}
