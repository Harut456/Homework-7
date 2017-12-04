import Animal.Puppy;
import Utils.MyMath;
import Utils.ArrayUtils;

public class Driver {
	static Animal.Puppy Joey = new Puppy("Joey");
	static Animal.Puppy Chandler = new Puppy("Chandler");
	static Animal.Puppy Ross = new Puppy("Ross");
	
	static int[] array = {9, 20, 3, 44, 88, 300};
	
	static double numb = 15.4;
	
	public static void main(String[] args) {
		System.out.println(Joey.getName());
		System.out.println(Chandler.getName());
		System.out.println(Ross.getName());
		System.out.println(ArrayUtils.reverse(array));
		System.out.println(ArrayUtils.stringifArray(ArrayUtils.reverse(array)));
		System.out.println(MyMath.factorialLoop((int) numb));
	}
	
}