package chapter5;

public class chapter5_4 {
	public static void main(String[] args) {
		System.out.println("メソッドを引数付きで呼び出す");
		hello("森");
		hello("岩崎");
		hello("岩渕");

		add(100, 20);
		add(200, 50);
	}
//	変数の型と変数名を引数として宣言
	public static void hello(String name) {
		System.out.println(name + "さんこんにちは");
	}

//	複数の値を引数で受け取る
	public static void add(int x,int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}
}
