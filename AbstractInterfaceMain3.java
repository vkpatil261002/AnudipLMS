package LMS;

interface BankAccount
{
	abstract void diposit(double amount);
	abstract void withdraw(double amount);
}

class CheckingAccount implements BankAccount
{
	String AccountNumber;
	int balance;
	CheckingAccount(String A,int b)
	{
		this.AccountNumber=A;
		this.balance=b;
	}
	
	// getter Method for returning balance
	public double getBalance()
	{
		return balance;
	}
	
	@Override
	public void diposit(double amount) 
	{
		if(amount>=0)
		{
			this.balance+=amount;
			System.out.println("Diposited:"+ amount);
		}
		else
			System.out.println("Invalid amount!");
	}

	@Override
	public void withdraw(double amount) 
	{
		if(amount>=0 && amount<=this.balance)
		{
			this.balance-=amount;
			System.out.println("Withdraw:"+ amount);
		}
		else
			System.out.println("Insufficient balance!");
	}
}
public class AbstractInterfaceMain3 {

	public static void main(String[] args) {
		CheckingAccount account = new CheckingAccount("4765934976",2000);
		account.diposit(5000);
		account.withdraw(3000);
		
		// Display the current balance
        System.out.println("Current Balance: " + account.getBalance());
	}
}
