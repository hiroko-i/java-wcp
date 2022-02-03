package chapter5;

public class chapter5_7 {
//	returnで戻り値を受け取って呼び出し元に戻す。　※voidは何も戻さない
	public static int add(int x,int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
//		常に右辺から評価！　☓add(100, 30) = int ans
		int ans = add(100, 30);
		System.out.println("100 + 30 = " + ans);
//		変数で受け取らない例
		System.out.println(add(add(10, 20),add(30, 40)));		
		System.out.println(add(10, 10));		
	}
}
