package OOpsConcept;

import java.util.Scanner;

public abstract class AbstractExample {
		
	abstract void customerPin();
}

class Bank extends AbstractExample{

	@Override
	void customerPin() {
		System.out.print("Enter your pin:");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		System.out.print("Enter amount:");
		float amt = sc.nextFloat();
		System.out.print("You entered amount:"+ amt);
		System.out.print("Withdraw cash & card!");
		sc.close();
	}
	
}