package ExceptionHandingConcept;

public class ExceptionHandling {
	public void customException(int Age)throws CustomException  {
		
			if(Age<18) {	
			throw new CustomException("You are not eligible to caste a vote");
			}
			else {
				System.out.println("Welcome to vote");
			}
	}

	/*
	 * catch(CustomException e) { System.out.println(e); } finally {
	 * System.out.println("Exception has been handled"); }
	 */
	
	public void ArithmaticDemo() {
		try{
			int j=100/0;
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello World");
		
	}
	public void tryCatchORFinallyConcept() {
		try{
			int number=200/0;
		}
		catch(Exception e) {
		System.out.println("Hyderabad ");
		}
		
		finally {
			System.out.println("Hello Bangalore");
		}
		System.out.println("Hello Dear");
	}
	public static void throw_Concept(int age) {
		int Age=age;
			if(Age<18) {
			throw new ArithmeticException();
		}
			else {
				System.out.println("Not eligible");
			}
			}
	
	public static void throws_Concept() throws NullPointerException {
		//String s;
		//System.out.println(s.length());
		throw new NullPointerException("Hi Madam");
		
	}
	public static void main(String[] args) throws CustomException {
		ExceptionHandling EH=new ExceptionHandling();
		//EH.customException(45);
		//EH.tryCatchORFinallyConcept();
			/*try{
				throw_Concept(1);
			}
			catch(Exception e) {
				System.out.println("Person is not allowed to vote");
			}*/
		try{
			throws_Concept();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
}
}