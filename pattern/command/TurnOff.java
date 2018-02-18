package command;

public class TurnOff implements Command{
	
	Devices device;
	
	public TurnOff(Devices newDevice) {
		device = newDevice;
	}
	@Override
	public void execute() {
		device.off();
		
	}
}
