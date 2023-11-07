package Abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		Bike b=new Honda();
		b.bikeCreated();
		b.changeGear();
		b.run();
	}

}
