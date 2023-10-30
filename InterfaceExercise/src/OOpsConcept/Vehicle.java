package OOpsConcept;

public interface Vehicle {
	String getBrand();
	
	String getSpeed();
	
//	default double getPrice() {
	//	return 0;
	//}
	double getPrice();
}

class Car implements Vehicle{
	private String brand;
	private String speed;
	private double price;
	
	Car(String brand, String speed, double price){
		this.brand = brand;
		this.speed= speed;
		this.price = price;
	}
	
	@Override
	public String getBrand() {
		return brand;
	}
	@Override
	public String getSpeed() {
		return speed;
	}
	@Override
	public double getPrice() {
		return price;
	}
}
