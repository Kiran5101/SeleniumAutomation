package JavaConcepts;

public abstract class Bike {
	void Bike(){
		System.out.println("I have a bike");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Please change the gear");
	}

}
