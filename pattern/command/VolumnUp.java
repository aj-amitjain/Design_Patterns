package command;

public class VolumnUp implements Command{

	Devices device;
	
	public VolumnUp(Devices newDevice) {
		device = newDevice;
	}
	@Override
	public void execute() {
		device.volumnUp();
		
	}
}
