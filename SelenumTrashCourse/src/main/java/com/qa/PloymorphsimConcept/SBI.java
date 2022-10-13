package com.qa.PloymorphsimConcept;

public class SBI extends Bank {
	String Location="Bangalore";
	public double rateOfInterest() {
		return 8.4;
	}
	public void getLocation() {
		 System.out.println(Location);
		 System.out.println(super.Location);
	}
	public void naming() {
		System.out.println("Banki is giving the loans");
	}

}
