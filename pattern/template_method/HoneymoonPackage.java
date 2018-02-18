package template_method;

public class HoneymoonPackage extends HolidayPackage{

	
	public HoneymoonPackage() {
		System.out.println("Here is your Honeymoon Package :");
		cost = 0;
	}
	
	@Override
	protected void bookTaxi() {
		System.out.println("Taxi Booked");
		cost += 300; 
	}

	@Override
	protected void bookRoom() {
		System.out.println("Room Booked");
		cost += 1500;
	}

	@Override
	protected void bookFlight() {
		System.out.println("2 Flight Ticket Booked");
		cost += 15000;
	}

	@Override
	protected void bookDinner() {
		System.out.println("Candle Light Dinner Booked");
		cost += 500;
	}
	
	@Override
	protected void getTotalCost() {
		System.out.println("Honeymoon Package, Total Cost :" + cost);
		System.out.println("");
		
	}

}
