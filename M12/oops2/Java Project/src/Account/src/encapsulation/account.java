package encapsulation;

public class account{

	private String name;
	private String bank;
	private long accno;
	private int pin;
	private double balance;
	private String type;
	private String ifsc;
	private String branch;
	
	System.out.println("Account created");

	public account()
		{
			
		}

	public account(String name,String bank,String accno,String pin,String balance,String type,String ifsc,Strin branch)
		{
			this.name = name;
			this.bank = bank;
			this.accno = accno;
			this.pin = pin;
			this.balance = balance;
			this.type = type;
			this.ifsc = ifsc;
			this.branch = branch;
		}

	public String getName() {
		return name;
	}

	public String getBank() {
		return bank;
	}

	public String getAccno() {
		return accno;
	}

	public String getIfsc() {
		return ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public double getBalance(long accno, int pin) {
		if (this.accno == accno && this.pin == pin) {
			return balance;
		} else {
			System.out.println("Invalid Credintails");
			return 0;
		}
	}

	public void withdraw(double amount.long accno,int pin) {
		if(accno==this.accno && pin==this.pin)
		{
			if(amt>0 &&(balance-amount)>=2000)
			{
				balance-=amt;
				System.out.println("Amount Debited");
				System.out.println("Your Balance:"+balance);
			}
			else {
				System.out.println("Insuffisunt Fund!");
			}
		}
		else
		{
			System.out.println("Invalid Credintails");
		}
	}

	public void deposite(long accno, int pin, double amt) {
		if (accno == this.accno && pin == this.pin) {
			if (amt > 0) {
				balance += amt;
				System.out.println("Amount Credited");
				System.out.println(balance);
			} else {
				System.out.println("Invalid Amount");
			}
		} else {
			System.out.println("Invalid Credintails");
		}
	}

	public void setPin(long accno,int oldPin,int newPin)
	{
		if(accno==this.accno && oldPin=this.pin)
		{
			pin=newPin;
			System.out.println("Invalid Credintails");
		}
	}

	public String getType() {
		return type;
	}
}
