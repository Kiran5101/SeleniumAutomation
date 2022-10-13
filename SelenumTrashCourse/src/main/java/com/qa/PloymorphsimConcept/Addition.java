package com.qa.PloymorphsimConcept;

public class Addition {
	// METHODS OVERLOADING MY CHANGING NUMBER OF ARGUMENTS
	static int add(int a, int b) {
		return a+b;
	}
	 static int add(int a,int b,int c) {
		return a+b+c;
	}

	 // METHOD OVERLOADING BY CHANGING THE DATA TYPE OF ARGUMENTS.
	 public int addition(int a, int b) {
		 return a+b;
	 }
	 public double addition(int a, double b) {
		 return a+b;
	 }
}
