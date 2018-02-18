package facade;

import java.util.HashMap;

public class Accounts {

	private HashMap<String, Boolean> accList;
	private HashMap<String, String> pinList;
	private HashMap<String, Double> balanceList;
	
	public Accounts() {
		accList = new HashMap<>();
		pinList = new HashMap<>();
		balanceList = new HashMap<>();
	}
	public HashMap<String, Boolean> getAccList() {
		return accList;
	}
	public HashMap<String, String> getPinList() {
		return pinList;
	}
	public HashMap<String, Double> getBalanceList() {
		return balanceList;
	}
	
	public void createAccount(String acc_no, String pin, Double amount) {
		accList.put(acc_no, true);
		pinList.put(acc_no, pin);
		balanceList.put(acc_no, amount);
		System.out.println("Account \"" + acc_no + "\" Created.");
	}
	
	public void deactivate(String acc_no) {
		System.out.println("Hope! you did withdraw your remaining balance, Thank you for choosing us");
		balanceList.put(acc_no, 0.0);
		accList.put(acc_no, false);
		System.out.println("Account " + acc_no + " Deactivated");
	}
}
