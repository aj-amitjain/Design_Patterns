package observer;

import java.util.ArrayList;

public class ThiefNotifier implements Subject{

	private ArrayList<Observer> observers ;
	
	public ThiefNotifier() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void register(Observer newPoliceStation) {
		observers.add(newPoliceStation);
	}

	@Override
	public void unregister(Observer OldPoliceStation) {
		observers.remove(OldPoliceStation);
	}

	@Override
	public void notify(String theifName) {
		
		for(Observer o : observers) {
			o.update(theifName);
		}
		
	}

	public void getObserverList() {
		System.out.println("Police Stations :");
		for(Observer o : observers) {
			System.out.println(o.getName());
		}
		System.out.println("\n---------------------------------------\n");
	}

}
