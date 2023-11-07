package PolyMorphism;

public class addTestLoading {
	public static void main(String[] args) {
		Adder ad=new Adder();
		System.out.println(ad.add(10, 20));
		System.out.println(ad.add(20, 30.00));
		System.out.println(ad.add(10, 15.00f, 30.00f));
		
	}

}
