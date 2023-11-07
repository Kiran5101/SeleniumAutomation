package PolyMorphism;

public class TestOverriding {
	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		b=new AXIS();
		b=new ICICI();
		
		System.out.println("SBI "+b.rateofInterest()+"%"+b.speedLimit);
		System.out.println("AXIS %"+b.rateofInterest()+b.speedLimit);
		System.out.println("ICICI %"+b.rateofInterest());
	}
}
