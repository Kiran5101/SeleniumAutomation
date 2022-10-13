package com.qa.EncapuslationConcept;

public class TestEnpasulation {
	public static void main(String[] args) {
		
	
	Student S=new Student();
	System.out.println(S.getID());
	S.setID(40);
	System.out.println(S.getID());
	}
}
