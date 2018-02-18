package singleton;

public class BookingThread implements Runnable {

	@Override
	public void run() {
		
		PartyHall ph = PartyHall.bookHall();
		ph.getDetails();
		
	}

	
}
