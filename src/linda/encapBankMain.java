package linda;

public class encapBankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount udaniAcc=new BankAccount(112233, 2000);
		udaniAcc.deposit(-1000);
		udaniAcc.withdraw(3000);

	}

}
