package command;

public class VolumnDown implements Command{
	
	Devices device;
	
	public VolumnDown(Devices newDevice) {
		device = newDevice;
	}
	@Override
	public void execute() {
		device.volumnDown();
		
	}
}
