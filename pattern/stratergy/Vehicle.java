package pattern.stratergy;

public class Vehicle {


	private	int topSpeed;
	private	int price;
	private	String brand;
	private	String Category;
	
	Fly flytype;
	
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}

	public String tryToFly() {
		return flytype.canFly();
	}
	
	public void setFlyType(Fly newFlyType) {
		flytype = newFlyType ;
	}
		
}
