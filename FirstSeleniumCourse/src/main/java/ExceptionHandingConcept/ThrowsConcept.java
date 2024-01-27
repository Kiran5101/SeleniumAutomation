package ExceptionHandingConcept;

public class ThrowsConcept {
	public static void exce(int a)throws ArithmeticException {
		int c=a/0;
	}
	public static void main(String[] args) {
		try{
			exce(10);
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(RuntimeException r) {
			System.out.println(r);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
