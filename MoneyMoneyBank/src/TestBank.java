//Driver Program to test the implemention of SavingsAccount
class TestBank
{

	public static void main(String[] args) 
	{
		//creating accounts
		SavingsAccount accountOne=new SavingsAccount(SavingsAccount.getNextAccountNumber(),"Mehta");	//0 balance account
		SavingsAccount accountTwo=new SavingsAccount(SavingsAccount.getNextAccountNumber(),"Kumaar",1000.00);	//normal account
		SavingsAccount accountThree=new SavingsAccount(SavingsAccount.getNextAccountNumber(),"Ramesh");	//0 balance account
		SavingsAccount accountFour=new SavingsAccount(SavingsAccount.getNextAccountNumber(),"Suresh",1000.00);	//normal account
		
		System.out.println("After creating the account:--");
		System.out.println(accountOne);
		System.out.println(accountTwo);
		System.out.println(accountThree);
		System.out.println(accountFour);
			
		accountOne.withdraw(100.00);
		accountTwo.deposit(1000.00);
			
		//a correct payment
		boolean statusCorrectPayment = PaymentGateway.transfer(accountFour, accountThree, 200.00);
		//an incorrect payment
		boolean statusIncorrectPayment = PaymentGateway.transfer(accountOne, accountTwo, 99999.00);
			
		System.out.println("After few transactions");
		System.out.println(accountOne);
		System.out.println(accountTwo);
		System.out.println(accountThree);
		System.out.println(accountFour);
			
		System.out.println("The status of two payment:-\nstatusCorrectPayment="+statusCorrectPayment+"\nstatusIncorrectPayment="+statusIncorrectPayment);

		//checking account no. for new account
		SavingsAccount checkAccountNo=new SavingsAccount();
		System.out.println("Account Number for new account will be :: "+(checkAccountNo.getNextAccountNumber()));

	}
}
