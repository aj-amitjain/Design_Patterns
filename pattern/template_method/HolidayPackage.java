package template_method;

public abstract class HolidayPackage {
	
	protected int cost = 0;
	
	final void getCombo() {
		
		if(isFlightReq()) 		{ bookFlight(); }
		if(isRoomReq()) 		{ bookRoom(); 	}
		if(isTaxiReq()) 		{ bookTaxi();	}
		if(isCandleNightReq())  { bookDinner(); }
		
		getTotalCost();
	}
	
	
	abstract protected void bookTaxi() ;
	abstract protected void bookRoom();
	abstract protected void bookFlight();
	abstract protected void bookDinner();
	abstract protected void getTotalCost();
	
	protected boolean isFlightReq() 		{return true;}
	protected boolean isRoomReq() 			{return true;}
	protected boolean isTaxiReq() 			{return true;}
	protected boolean isCandleNightReq() 	{return true;}


	public int getCost() {return cost; }
    public void setCost(int cost) { this.cost = cost;}

	
	
	
}
