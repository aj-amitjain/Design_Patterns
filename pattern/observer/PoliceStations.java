package observer;

import java.util.ArrayList;

public class PoliceStations implements Observer {

	private Subject thiefNotifier;
	private ArrayList<String> thiefList;
	private String name;
	
	public PoliceStations(ThiefNotifier notifier, String name) {
		this.name = name ;
		thiefNotifier = notifier;
		thiefList = new ArrayList<>();
		thiefNotifier.register(this);
	}
	
	public String getName() {
		return name;	
	}
	
	@Override
	public void update(String thiefName) {
		thiefList.add(thiefName);
		dispaly(thiefList);
	}

	public void dispaly(ArrayList<String> thiefList) {
		System.out.println("Police Station " + this.name + " : ");
		int thiefCount = 0;
		for(String thief : thiefList) {
			System.out.println( ++thiefCount + ". " + thief );
		}
		System.out.println("\n---------------------------------------\n");
	}
}
