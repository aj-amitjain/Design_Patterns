package prototype;

public class BlueCard implements InvitationCard{

	public BlueCard() {
		System.out.println("Creating a Blue card...");
	}
	
	@Override
	public InvitationCard makeCopy() {
		
		BlueCard copyBlueCard = null;
		
		/*
		 * Using clone() method of cloneable class 
		 * to make a copy of the object
		 */
		try {
			System.out.println("Making a copying of a blue card....");
			copyBlueCard = (BlueCard)super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return copyBlueCard;
		
	}

	
}
