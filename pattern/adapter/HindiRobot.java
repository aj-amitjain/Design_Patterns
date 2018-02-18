package adapter;

/*
 * A Hindi understading robot 
 * Have used Hindi Langguage as 
 * name for methods and in prints 
 */
public class HindiRobot {

	private String name;
	
	public HindiRobot(String name) {
		this.name = name;
	}
	
	/*
	 * suru karo is start in hindi
	 */
	public void suruKaro() {
		System.out.println(name + " safayi suru karo.");
		
	}

	/*
	 * pakdo is hold in hindi
	 */
	public void pakdo() {
		System.out.println(name + " pocha pakdo.");
	}

	/*
	 * saafayi is cleaning in hindi
	 */
	public void saafayi() {
		System.out.println(name + " kachara saaf karo");
		
	}

	/*
	 * kachra feko is throw trash in hindi
	 */	
	public void kachrafeko() {
		System.out.println(name + " kachara ko kudedaan me feko.");
		
	}
	
	/*
	 * safayi karekaram is cleaning activity in hindi
	 */	
	public void safayiKarekaram() {
		suruKaro();
		pakdo();
		saafayi();
		kachrafeko();
	}
}
