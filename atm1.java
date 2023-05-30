package bankaccount;

public class atm1 {

	public static void main(String args[]) {
		  atm a = new atm();
		  a.setName("Silvi");
		  a.setBalance(50000);
		  
		  System.out.println(a.withdraw(10000));
		    }
}
