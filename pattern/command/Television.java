package command;

public class Television implements Devices{

	/* Keep default value as 35 */
	private int volumn = 35; 
	private String state = "OFF";
	
	@Override
	public void on() {
		if(state.equals("OFF")) {
			System.out.println("Turning TV on...");
			state = "ON";
		}
		else {
			off();
		}
	}

	@Override
	public void off() {
		if(state.equals("ON")) {
			System.out.println("Turning TV off...");
			state = "OFF";
		}
		else {
			on();
		}
	}

	@Override
	public void volumnUp() {
		volumn++;
		System.out.println("Turning Volumn at " + volumn);
		
	}

	@Override
	public void volumnDown() {
		volumn--;
		System.out.println("Turning Volumn at " + volumn);
		
	}

}
