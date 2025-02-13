package core_java_practice;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to find Lcm");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int minNum = a<b?a:b;
		while(true) {
			if(a%minNum == 0 && b%minNum==0) break;
			minNum--;
		}
		System.out.println("Hcf of "+a+" and "+b+" is:"+minNum);

	}

}
