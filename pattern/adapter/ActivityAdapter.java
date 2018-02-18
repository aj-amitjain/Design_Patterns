package adapter;

public class ActivityAdapter implements Activity{

	HindiRobot robo;
	
	public ActivityAdapter(String name) {
		robo = new HindiRobot(name);
	}
	
	@Override
	public void start() {
		robo.suruKaro();
		
	}

	@Override
	public void hold() {
		robo.pakdo();
	}

	@Override
	public void clean() {
		robo.saafayi();
		
	}

	@Override
	public void throwTrash() {
		robo.kachrafeko();
		
	}
	
	@Override
	public void startCleaningProcess() {
		start();
		hold();
		clean();
		throwTrash();
		
	}

}
