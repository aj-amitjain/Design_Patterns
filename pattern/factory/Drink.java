package factory;

public abstract class Drink {

	private String name;
	private String size;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public abstract void getDrink(String CustomerName);
	
	
	
}
