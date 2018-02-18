package observer;

public class Test {

	public static void main(String[] args) {
		
		ThiefNotifier sub = new ThiefNotifier();
		
		/* Multiple Observer */ 
		PoliceStations obv_1 = new PoliceStations(sub, "Chennai");
		PoliceStations obv_2 = new PoliceStations(sub, "Delhi");
		PoliceStations obv_3 = new PoliceStations(sub, "Mumbai");
		PoliceStations obv_4 = new PoliceStations(sub, "Kolkata");
		
		/*Display the list of the registered police station */
		sub.getObserverList();

		
		/* Adding few thief */
		sub.notify("Dani");
		sub.notify("Michel");
		sub.notify("Munna");
		sub.notify("Chetan");
		
		/* Police station obv_3 is shutting down */
		sub.unregister(obv_3);
		
		/*Display the list of the registered police station */
		sub.getObserverList();
		
		
		/* Found new thief */
		sub.notify("James");
		sub.notify("Krish");

	}

}
