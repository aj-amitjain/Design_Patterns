package builder;

public class Pizza implements PizzaPlan{

	private String base;
	private String cheese;
	private String sauce;
	private String topping;
	
	
	@Override
	public void setBase(String base) {
		this.base = base;
		
	}
	
	public String getBase() {
		return base;
	}

	@Override
	public void setCheese(String cheese) {
		this.cheese = cheese;
		
	}
	
	public String getCheese() {
		return cheese;
	}

	@Override
	public void setSauce(String sauce) {
		this.sauce = sauce;
		
	}

	public String getSauce() {
		return sauce;
	}
	
	@Override
	public void setTopping(String topping) {
		this.topping = topping;
		
	}
	
	public String getTopping() {
		return topping;
	}

}
