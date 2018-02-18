package facade;

public class TransactionFacade {

	Accounts acc;
	VerifyAccount va;
	DoTrancation trans;
	WelcomeMessage msg;
	
	private String acc_no;
	private String pin;
	
	public TransactionFacade(Accounts acc, String acc_no, String pin) {
		this.acc = acc;
		this.acc_no = acc_no;
		this.pin = pin;
		va = new VerifyAccount(acc);
		trans = new DoTrancation(acc);
		msg = new WelcomeMessage();
		msg.greet();
		
	}
	
	public void withDraw(Double amount) {
		if(va.VerfiyDetails(acc_no, pin, acc)) {
			trans.withDraw(acc_no, amount);
		}
	}
	
	public void deposit(Double amount) {
		if(va.VerfiyDetails(acc_no, pin, acc)) {
			trans.desposit(acc_no, amount);
		}
	}
	
}
