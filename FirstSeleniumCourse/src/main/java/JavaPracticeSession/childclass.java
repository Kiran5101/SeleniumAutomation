package JavaPracticeSession;

public class childclass extends parentClass {
	public void barking() {
		System.out.println("Dog is Barking loudly");
	}
	public static void main(String[] args) {
		childclass c=new childclass();
		c.eating();
		c.barking();
		System.out.println(c.EmployeeName);
		System.out.println(c.Package);
	}
}
