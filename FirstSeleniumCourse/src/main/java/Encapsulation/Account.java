package Encapsulation;

public class Account {
	private long Account_no;
	private String name,email;
	private float amount;
	
	public long getAccount() {
		return Account_no;
	}
	public void setAccount(long Account) {
		this.Account_no=Account;
	}
	public String getName() {
		return name;
	}
	public void setName(String Gname) {
		this.name=Gname;
	}
	public String getemail() {
		return email;
	}
	public void setEmail(String Gname) {
		this.email=Gname;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float GAmount) {
		this.amount=GAmount;
	}


}
