package Encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		Account A=new Account();
		A.setAccount(2015555);
		A.setName("Kiran Kumar");
		A.setEmail("Kiura@gamil.com");
		A.setAmount(22000);
		System.out.println(A.getName()+" "+A.getAccount()+" "+A.getemail()+" "+A.getAmount());
	}

}
