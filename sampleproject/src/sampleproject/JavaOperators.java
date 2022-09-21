package sampleproject;

public class JavaOperators {
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
	public static void main(String[] args) {
		JavaOperators JO=new JavaOperators();
		JO.verifylogicalOperators();
	}

}
