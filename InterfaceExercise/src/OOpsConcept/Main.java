package OOpsConcept;

public class Main {

	public static void main(String[] args) {
		
		// Parentclass object = new ChileClass();
		InheritanceExample1 in = new InheritanceExample1();
		in.inherit();
//		in.inheritClass1();
		
//		Bank b = new Bank();
//		b.customerPin();
		
//		Child ch = new Child();
//		ch.printInfo();
		
		Car test = new Car("BMW", "1000",40000);
		System.out.print(test.getBrand());
	}

}