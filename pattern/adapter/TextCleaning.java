package adapter;

public class TextCleaning {

	public static void main(String[] args) {
		
		/*Testing English Instructions*/
		System.out.println("For English Robot : ");
		EnglishRobot eRobot = new EnglishRobot("James");
		eRobot.startCleaningProcess();
		System.out.println("");
		
		/*Testing Hindi Instructions*/
		System.out.println("For Hindi Robot : ");
		HindiRobot hRobot = new HindiRobot("Chotu");
		hRobot.safayiKarekaram();
		System.out.println("");
		
		/*Testing Adapter Instructions*/
		System.out.println("For Adapter : ");
		ActivityAdapter aa = new ActivityAdapter("Shayam");
		aa.startCleaningProcess();
		
	}
}
