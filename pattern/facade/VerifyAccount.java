package facade;

import java.util.HashMap;
import java.util.Map;

public class VerifyAccount {

	Map<String, Boolean> accList = new HashMap<>();
	Map<String, String> pinList = new HashMap<>();
	Accounts acc;
	
	public VerifyAccount(Accounts acc) {
		this.acc = acc;
		this.accList = acc.getAccList();
		this.pinList = acc.getPinList();		
	}
	
	public boolean VerfiyDetails(String acc_no, String pin, Accounts acc) {

		if(isActive(acc_no)) {
			if(isCorrectPin(acc_no, pin)) {
				System.out.println("Account Verified.");
				return true;
			} else {
				System.out.println("Incorrect Pin.");
				return false;
			}
		} else {
			System.out.println("Inactive Account.");
			return false;
		}
	}

	private boolean isCorrectPin(String acc_no, String pin) {
		return pin.equals(pinList.get(acc_no));
	}

	private boolean isActive(String acc_no) {
		return accList.get(acc_no);
		}
	
}
