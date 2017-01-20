package controlStatements;

import java.util.Scanner;
class PrimeCheck {
	public static void main(String args[]) {
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=2;i<=Math.ceil(Math.sqrt(num));i++) {

			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not Prime Number");
	}
}