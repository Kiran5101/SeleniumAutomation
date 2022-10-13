package com.qa.HandlingExceptionsConcept;

public class HandlingExceptions {
	public static void arithematicException(int A) {
		int B = A;
		try {
			int C = B / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Hello Kiran");
	}

	public static void nullpointerException() {
		String s = null;
		try {
			System.out.println(s.charAt(3));
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("NullpointerException has beed handled");
		}
	}

	public static void arrayindesoutofBoundsException() {
		int[] a = new int[] {};
		try {
			System.out.println(a[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("Index out of bounds excpetion has been handled");
		}
	}

	public void votingAGe(int Age) {
		int A=Age;
		try{
			if(A>=18) {
				throw new MyException("Your age is not allowed to vote");
		}
			else {
				System.out.println("Please cast your vote");
			}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		}
	

	public static void main(String[] args) {
		HandlingExceptions HE=new HandlingExceptions();
		HE.votingAGe(20);
		//arithematicException(100);
		//nullpointerException();
		//arrayindesoutofBoundsException();
		// arrayindesoutofBoundsException();
	}

}
