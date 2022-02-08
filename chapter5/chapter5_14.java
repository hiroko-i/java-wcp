package chapter5;

public class chapter5_14 {
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static void main(String[] args) {
		int[] array = {1,2,3};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static int[] makeArray(int size){
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	public static void main(String[] args) {
		int[] array = makeArray(3);
		for (int i : array) {
			System.out.println(i);
		}
	}
}
