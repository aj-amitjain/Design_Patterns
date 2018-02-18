package singleton;

public class Test {

	public static void main(String[] args) {
		
/*		PartyHall person_one = PartyHall.bookHall();
		System.out.println("Instance One ID :" + System.identityHashCode(person_one));
		person_one.getDetails();
		
		PartyHall person_two = PartyHall.bookHall();
		System.out.println("Instance Two ID :" + System.identityHashCode(person_two));
		person_two.getDetails();
*/		
		/*
		 * Trying to book two halls by a single person
		 */
		BookingThread ph_1 = new BookingThread();
		new Thread(ph_1).start();
		
		BookingThread ph_2 = new BookingThread();
		new Thread(ph_2).start();
		
		

	}

}
