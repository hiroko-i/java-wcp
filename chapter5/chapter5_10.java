package chapter5;

public class chapter5_10 {
	public static int add(int x, int y) {
		return x + y;
	}
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	public static double add(double x, double y) {
		return x + y;
	}
	public static String add(String x, String y) {
		return x + y;
	}
//	仮引数が異なる・個数が異なると同じメソッド名でも複数定義可能
	public static void main (String[] args) {
		System.out.println(add(10, 10));
		System.out.println(add(10, 20, 30));
		System.out.println(add(3.5, 10.2));
		System.out.println(add("hello", "world"));
	}
}
