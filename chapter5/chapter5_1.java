package chapter5;

public class chapter5_1 {
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}

//	プログラムは必ずmainから動き始める
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello();
		methodA();
		System.out.println("メソッドの呼び出し終了");
	}
	public static void hello() {
		System.out.println("森さんこんにちは");
	}
}
