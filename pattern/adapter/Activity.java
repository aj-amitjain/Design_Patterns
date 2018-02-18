package adapter;

/*
 * Creating a interface which contain 
 * sets of activity for cleaning robot
 * which might use Hindi or English language. 
 */
public interface Activity {
	
	public void start();
	public void hold();
	public void clean();
	public void throwTrash();
	public void startCleaningProcess();
	
}
