package singleton;

public class PartyHall {
	
	private static PartyHall hall= null;
	
	
	private PartyHall() {}
	
	/*
	 * One way to deal with multiple thread to create different instance 
	 * is to use synchronized keyword. It will wait till the existing 
	 * thread is done.Or we can use synchronized block with the method
	 */
	
//	public static synchronized PartyHall bookHall() {
	public static  PartyHall bookHall() {	
		if (hall == null) {
			
			/*
			 * Putting a sleep will allow another thread to
			 * act while current thread is in sleep.
			 * This is when we are not using synchronized. 
			 */
			Thread.currentThread();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (PartyHall.class) {
				if(hall == null) {
					hall = new PartyHall();
				}	
			}
			
		}
		
		return hall;
	}
	
	public void getDetails() {
		
		/* Putting details of hall area
		 * Only one hall can be booked by a person
		 */
		System.out.println("Hall is 10000*5000 in Area");
		System.out.println("Hall "+ System.identityHashCode(this) + " has been book for you" );
		
	}


}
