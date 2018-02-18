package prototype;

public class PrototypeFactory {

	/*
	 * Factory helps changing the object in runtime 
	 */
	public InvitationCard getCopy(InvitationCard ic) {
		
		return (InvitationCard)ic.makeCopy();
		
	}
}
