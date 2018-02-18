package command;

public class TurnOn implements Command {

	Devices device;
	
	public TurnOn(Devices newDevice) {
		device = newDevice;
	}
	@Override
	public void execute() {
		device.on();
		
	}

	
}
