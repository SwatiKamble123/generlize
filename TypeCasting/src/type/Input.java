package type;

import java.util.Scanner;

public class Input {
	
	static String name;
	static double balance=3000;
	static void call() {
		System.out.println("The Customer Name is="+name);
		System.out.println("Current Balance: ="+balance);
		System.out.println("Thank You");
	}
	static void deposit(double amt) {
		balance=balance+amt;
		System.out.println("Your Account has been credited="+amt+"RS");
		
	}
	static void withDraw(double amt) {
		balance=balance-amt;
		System.out.println("Your Account has been debited"+amt+"RS");
	}
	

	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			while(true) {
				System.out.println("Enter Your Name:");
				name=sc.next();
				System.out.println("Your balance is="+balance+"RS");
				System.out.println("enter the amount to credit");
				deposit(sc.nextDouble());
				System.out.println("enter the amount withdraw");
			withDraw(sc.nextDouble());
			call();
			}
			
		}

	}

}
