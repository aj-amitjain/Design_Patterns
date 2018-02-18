package prototype;

public class Test {

	public static void main(String[] args) {
		PrototypeFactory pf = new PrototypeFactory();
		
		InvitationCard ic = new BlueCard();
		InvitationCard ic_copy = (BlueCard)pf.getCopy(ic);
		
		
		/*
		 * Making a copying will create a copy in some different 
		 * location, as can be verified by using identityHashCode
		 */
		System.out.println("Ic : " + System.identityHashCode(ic));
		System.out.println("Ic : " + System.identityHashCode(ic_copy));
		
		

	}

}
