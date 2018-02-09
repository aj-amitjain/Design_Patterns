package pattern.stratergy;

public class Airplane extends Vehicle{

	public Airplane() {
		super();
		setCategory("Flight");
		
		flytype = new itCanFly();
	}
}
