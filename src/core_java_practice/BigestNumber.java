package core_java_practice;

import java.util.Scanner;

public class BigestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enetr two number");
		int a = sc.nextInt();
		int b =sc.nextInt();
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}else if(b>a) {
			System.out.println(b+" is greater than "+a);
		}else {
			System.out.println(a+" and "+b+" are equal");
		}
	}

}
