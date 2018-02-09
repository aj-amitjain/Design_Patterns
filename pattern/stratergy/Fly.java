package pattern.stratergy;

public interface Fly {

	public String canFly();
}

class itCanFly implements Fly {

	@Override
	public  String canFly() {
		return "Yes" ;
	}	
}

class itCantFly implements Fly {

	@Override
	public String canFly() {
		return "No";
		
	}
	
}