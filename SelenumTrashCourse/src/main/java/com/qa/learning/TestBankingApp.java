package com.qa.learning;

public class TestBankingApp implements InterfaceB,InterfaceConcept {
	public float rateofInterest() {
		return 20;
	}
	public void nameofbank() {
		System.out.println("hello multiple inheritance");
	}
	public static void main(String[] args) {
		InterfaceConcept I;
		I=new TestBankingApp();
		System.out.println(I.rateofInterest());
		I.nameofbank();
		I=new SBI();
		System.out.println(I.rateofInterest());
		I=new PNB();
		System.out.println(I.rateofInterest());
		I=new M();
		I.nameofbank();
		System.out.println(I.rateofInterest());
		I.nameofbank();
		
	}
}
