//class to represent payment gateway that assists in balance transfers
class PaymentGateway {
	
	//the withdraw() is called and within the withdraw() the amount requested is checked if lesser than the account balance
	//then the requested amount is de;osited to the receiver account by calling the deposit() 
	static boolean transfer(SavingsAccount sender,SavingsAccount reciever,double amount)
	{
		if(sender.withdraw(amount))
		{
			reciever.deposit(amount);
			return true;
		}
		else
			return false;
	}

}
