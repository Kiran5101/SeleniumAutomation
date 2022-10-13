package com.qa.PloymorphsimConcept;

public class TestBank {
	public static void main(String[] args) {
		Bank B=new Bank();
		SBI I=new SBI();
		ICICI IC=new ICICI();
		System.out.println(I.rateOfInterest());
		System.out.println(IC.rateOfInterest());
		System.out.println(B.rateOfInterest());
		//Verifying Super key word
		I.getLocation();
	}

}
