package Abstraction;

abstract class Bike {
	public void bikeCreated() {
	System.out.println("Bike is created");
}
	abstract void run();
	public void changeGear() {
		System.out.println("gear has been changed");
	}
}
