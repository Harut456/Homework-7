package Utils;
public class MyMath {
	
	public static int factorial(int NUMBER) {
		if (NUMBER<=1) {
			return 1;
		}
		return NUMBER * factorial(NUMBER - 1);
	}
		
	public static int factorialLoop(int NUMBER) {
		int B = 1;
		int C = 1;
		for(;)
		while ( C <= NUMBER) {
			B = B * C;
			C++;
		}
		return B;
	}
	
	public static void main(String[] args) {
		System.out.println(factorialLoop(5));
		System.out.println(factorial(5));
	}
}