package facade;

import java.util.HashMap;
import java.util.Map;

public class DoTrancation {

	private Map<String, Double> balanceList = new HashMap<>();
	Accounts acc;
	
	public DoTrancation(Accounts acc) {
		this.acc = acc;
		this.balanceList = acc.getBalanceList();
	}
	
	public void withDraw(String acc_no, Double amount) {
		
		if(amount > balanceList.get(acc_no)) {
			System.out.println("Sorry, You are out of money");
			System.out.println("Balance remaining : Rs." + balanceList.get(acc_no));
		} else {
			System.out.println("Please collect your cash");
			balanceList.put(acc_no, (balanceList.get(acc_no)-amount));
			System.out.println("Balance remaining : Rs." + balanceList.get(acc_no));
		}
	}
	
	public void desposit(String acc_no, Double amount) {
			balanceList.put(acc_no, (balanceList.get(acc_no)+amount));
			System.out.println("Desposited Rs."+ amount + ", Balance remaining : Rs." + balanceList.get(acc_no));
	}
}
