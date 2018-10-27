package linda;


public class BankAccount{
	
	
		private int acctNumber;
		private int accBalance;
		
public BankAccount(int accnumber, int accbalance)
		{
			this.acctNumber=accnumber;
			this.accBalance=accbalance;
			
			System.out.println("Your bank account number is= "+ acctNumber);
		}
		

	
	
	public void deposit(int addmoney)
	{
		if(addmoney<0)
		{
			System.out.println("you cannot diposit negative values");
		}
		else if(addmoney>0)
		{
			accBalance=accBalance+addmoney;
			
			System.out.println("Account balance after deposit = "+this.accBalance);
			
		}
	}
	
	public void withdraw(int remvmoney)
	{
		if(remvmoney>accBalance)
		{
			System.out.println("Your account balance is insufficient to do this withdrawal");
		}
		else if(remvmoney<accBalance)
		{
			accBalance=accBalance-remvmoney;
			
			System.out.println("Balance of acc after withdraw= "+accBalance);
			
		}
	}

}
