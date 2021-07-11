class Account {
	int accountNo;
	double accountBalance;
	String accountPassword;
	
	private static String bankName;
	static void setBankName(String bn) {
		bankName = bn;
	}
	
	public Account() {
		super();
	}

	public Account(int accountNo, double accountBalance, String accountPassword) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}

	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	void displayAccount() {
		System.out.println("Bank Name : "+ bankName);
		System.out.println("Account Number : "+ accountNo);
		System.out.println("Account Balance : "+ accountBalance);
		System.out.println("Account Password : "+ accountPassword);
	}
	
}

public class Assignment5 {

	public static void main(String[] args) {
		Account.setBankName("Kotak Mahindra Bank");
		Account ac1 = new Account(1254004, 55000.0, "NewUser123");
		ac1.displayAccount();
		System.out.println("============================");
		Account ac2 = new Account();
		ac2.displayAccount();
		System.out.println("============================");
		Account ac3 = new Account(13645200, 325000.0, "Pass@1234");
		ac3.displayAccount();

	}

}
