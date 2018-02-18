package adapter;

public class EnglishRobot implements Activity{

	private String name;
	
	public EnglishRobot(String name) {
		this.name = name;
	}
	
	@Override
	public void start() {
		System.out.println(name + " start cleaning.");
		
	}

	@Override
	public void hold() {
		System.out.println(name + " hold the sweeper.");
	}

	@Override
	public void clean() {
		System.out.println(name + " clean the trash.");
		
	}

	@Override
	public void throwTrash() {
		System.out.println(name + " throw the trash in the can.");
		
	}

	@Override
	public void startCleaningProcess() {
		start();
		hold();
		clean();
		throwTrash();
		
	}

	
}
