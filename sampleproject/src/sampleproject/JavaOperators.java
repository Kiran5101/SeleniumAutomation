package sampleproject;

public class JavaOperators {
	int value=100;
	public void verifylogicalOperators() {
		int a=10;
		int b=30;
		int c=50;
		if(a<b && b<c) {
			System.out.println("a is larger number");
		}
		else {
			System.out.println("not a larger number");
		}
	}
	public void verifyTernaryOperation() {
		int a=10;
		int b=20;
		
		int min=(a<b)?a:b;
		System.out.println(min);
	}
	public static void main(String[] args) {
		JavaOperators JO=new JavaOperators();
		JO.verifylogicalOperators();
		JO.verifyTernaryOperation();
		System.out.println(JO.value);
	}

}
