//Class to simulate bank account operation
class SavingsAccount {

	//instance members
	private static int uniqueAccountNumber=123456;//initializer..
	private int accountNumber;
	private String name;
	private double accountBalance;
	
	//for checking account number for new account
	public SavingsAccount()
	{}

	//	For creating a zero balance account
	public SavingsAccount(int accountNumber, String name) {
		this(accountNumber,name,0.0);
	}

	//creating an account with some deposit
	public SavingsAccount(int accountNumber, String name, double accountBalance) {
	
		this.accountNumber = accountNumber;
		this.name = name;
		this.accountBalance = accountBalance;
		uniqueAccountNumber++;
	}
	
	//deducting amount for withdraw if requested amount is greater than balance
	protected boolean withdraw(double amount)
	{
		//if requested amount is greater than balance in account then service is denied
		if(amount>accountBalance)
			return false;
		
		//else the deductiion is done from balance and success message is passed
		accountBalance-=amount;
		return true;
	}
	
	//depositing the amount by incrementing the account balance
	protected void deposit(double amount)
	{
		accountBalance+=amount;
	}

	//to display the outputs
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", name=" + name + ", accountBalance="
				+ accountBalance + "]";
	}
	
	public static int getNextAccountNumber()//retuns a new account number to assists the banker to open the account
	{
		return uniqueAccountNumber;
	}

	//returning the account balance
	public double getAccountBalance() {
		return accountBalance;
	}

}
