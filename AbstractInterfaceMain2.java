package LMS;

abstract class BankAccount
{
		private String accountNumber;
		protected double balance;
	BankAccount(String an,double b)
	{
		this.accountNumber=an;
		this.balance=b;
	}
	abstract void Deposit(double amount);
	abstract void Withdraw(double amount);
	public double getBalance() {
		return balance;
	}
}

class CheckingAccount extends BankAccount
{

	CheckingAccount(String an, double b)
	{
		super(an,b);
	}
	@Override
	 void Deposit(double amount)
	 {
		if(amount>=0)
		{
			super.balance += amount;//deposit the amount into the balance
			System.out.println("Deposited:"+ amount);
		}
		else
			System.out.println("Invalid amount!");
		 
	 }
	@Override
	 void Withdraw(double amount)
	 {
		 if(amount >= 0 && amount <= super.balance)
		 {
			 super.balance -= amount; // Withdraw the amount from the balance
			 System.out.println("Withdraw:"+ amount);
		 }
		 else
			 System.out.println("Insufficient balance!");
	 }
}
public class AbstractInterfaceMain2 {

	public static void main(String[] args) {
			CheckingAccount  account = new CheckingAccount("2784968596",1000.0);
			 // Call the deposit and withdraw methods
	        account.Deposit(500.0);
	        account.Withdraw(200.0);

	        // Display the current balance
	        System.out.println("Current Balance: " + account.getBalance());
	}

}
