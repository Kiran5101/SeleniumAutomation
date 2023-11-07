
public class Student {
	public int id;
	public String name;
	//intialization by a method
	public void insertRecord(int i, String n) {
		id=i;
		name=n;
	}
	
	void displayData() {
		System.out.println(" ID:"+id+" "+name);
	}
}
