package ExceptionHandingConcept;

public class ExceptionHandling {
	public void customException(int Age) {
		try{
			if(Age<18) {	
			throw new CustomException("You are not eligible to caste a vote");
			}
	}
		catch(CustomException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Exception has been handled");
		}
	}
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
	public static void main(String[] args) {
		ExceptionHandling EH=new ExceptionHandling();
		EH.customException(4);

}
}