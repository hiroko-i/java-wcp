package Chapter4;

public class chapter4_6 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		array = null;
		array[0] = 10;

		/*
		 * nullを代入したので何も参照しなくなる
		 * エラーメッセージ
		 * Exception in thread "main" java.lang.NullPointerException
		 * at Chapter4.chapter4_6.main(chapter4_6.java:7)
		 */
	}
}
