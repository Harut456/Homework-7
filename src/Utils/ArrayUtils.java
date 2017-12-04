package Utils;
public class ArrayUtils {
	public static int[] reverse(int[] array) {
		int B = 0;
		int C;
		for(; B < array.length/2; B++) {
			C = array.length - 1 - B;
			int R = array[B];
			array[B] = array[C];
			array[C] = R;
		}
		return array;
	}
	
	public static String stringifyArray(int[] array) {
		int B = 0;
		String comma = ", ";
		String C = "";
		for(; B < array.length; B++) {
			if (B == array.length - 1) {
				System.out.print(C);
			}
			System.out.print(array[B] + comma);
		}
		return C;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		System.out.println(reverse(array));
		System.out.println(stringifyArray(array));
	}
}