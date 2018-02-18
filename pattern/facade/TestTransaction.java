package facade;

public class TestTransaction {

	
	public static void main(String[] args) {
		
		Accounts acc = new Accounts();
		
		/* Creating some sample acc */
		acc.createAccount("22453", "1234", 5000.00);
		acc.createAccount("11452", "8659", 15000.00);
		acc.createAccount("26217", "6045", 2000.00);
		acc.createAccount("98245", "6234", 6700.00);
		acc.createAccount("34459", "7654", 3200.00);
		
		System.out.println("");
		acc.deactivate("34459");
		
		/* Testing facade */
		TransactionFacade customer_1 = new TransactionFacade(acc, "98245", "6234");
		System.out.println("");
		customer_1.withDraw(4000.00);
		
		TransactionFacade customer_2 = new TransactionFacade(acc, "34459", "7654");
		System.out.println("");
		customer_2.deposit(500.00);
		
		TransactionFacade customer_3 = new TransactionFacade(acc, "26217", "6045");
		System.out.println("");
		customer_3.deposit(500.00);		
		
	}
}
