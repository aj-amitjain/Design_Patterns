package command;

public class TestRemote {

	public static void main(String[] arg) {
		
		Devices device		= TVRemote.getDevice();
		TurnOn  	on 		= new TurnOn(device);
		TurnOff 	off 	= new TurnOff(device);
		VolumnUp 	up 		= new VolumnUp(device);
		VolumnDown 	down 	= new VolumnDown(device);
		
		DeviceButton button = null;
		
		/* Turning the TV ON*/
		button = new DeviceButton(on);
		button.press();
		
		/* Turning the TV OFF*/
		button = new DeviceButton(off);
		button.press();
		
		button = new DeviceButton(up);
		button.press();
		button.press();
		button.press();

		button = new DeviceButton(down);
		button.press();
		
	}
}
