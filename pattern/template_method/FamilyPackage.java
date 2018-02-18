package template_method;

public class FamilyPackage extends HolidayPackage{

	public FamilyPackage() {
		System.out.println("Here is your Family Package :");
	}
	
	@Override
	protected void bookTaxi() {}

	@Override
	protected void bookRoom() {
		System.out.println("2 Rooms Booked");
		cost += 1500; 
		
	}

	@Override
	protected void bookFlight() {
		System.out.println("4 Flight Ticket Booked");
		cost += 22000;
		
	}

	@Override
	protected void bookDinner() {}

	@Override
	protected void getTotalCost() {
		System.out.println("Family Package, Total Cost :" + cost);
		System.out.println("");
	}
	
	protected boolean isTaxiReq() 			{return false;}
	protected boolean isCandleNightReq() 	{return false;}

}
