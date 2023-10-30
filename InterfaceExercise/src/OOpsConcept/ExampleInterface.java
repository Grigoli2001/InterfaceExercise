package OOpsConcept;

interface ExampleInterface {
	
	void printInfo();
	
	default void pritInfo() {
		System.out.println("Interface Class");
	}
}

abstract class ExampleAbstract {
	abstract void printInfo();
	
	void print() {
		System.out.println("Abstract Class");
	}
}

class Child extends ExampleAbstract implements ExampleInterface {
	
	@Override
	public void printInfo(){
		System.out.println("Child Class");
	}
	
}