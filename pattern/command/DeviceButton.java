package command;

public class DeviceButton {
	
	Command cmd;
	public DeviceButton(Command newCmd) {
		cmd= newCmd;
	}
	
	public void press() {
		cmd.execute();
	}
	
}
