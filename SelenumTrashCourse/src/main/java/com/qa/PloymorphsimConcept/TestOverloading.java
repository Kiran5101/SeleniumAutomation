package com.qa.PloymorphsimConcept;

public class TestOverloading {
	public static void main(String[] args) {
		Addition A=new Addition();
		//CALLING THE STATIC METHODS WITHOUT INSTANTIATING THE OBJECT
		System.out.println(Addition.add(10, 20));
		System.out.println(Addition.add(10, 20, 30));
		//CALLING THE PUBLIC METHODS WITH REFERENCE.
		System.out.println(A.addition(20, 30.6));
		System.out.println(A.addition(2001, 100));
	}

}
