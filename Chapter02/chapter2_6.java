package Chapter02;

public class chapter2_6 {
	public static void main(String[] atrgs) {
		String name = "すがわら";
		System.out.print("私の名前は");
		System.out.print(name);
		System.out.print("です");
//		改行しない
		
		String address = "東京都";
		System.out.println("私の名前は");
		System.out.println(address);
//		"後ろ"に改行

//		大きい数値代入
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		System.out.println("比較実験：" + a + "と" + b + "とで大きい方は" + m);
		
//		文字列を数値変換
		String age = "32";
		int n = Integer.parseInt(age);
		System.out.println("あなたは" + (n + 1) + "歳になる");
		
//		乱数 nextIntの値を含まない
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはおそらく" + r + "歳ですね" );
		
//		キーボードから入力値を受け取る
		System.out.print("名前を入力してください");
//		一行の文字列受付
		String myname = new java.util.Scanner(System.in).nextLine();
//		1つの整数受付
		System.out.print("年齢を入力してください");
		int myage = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ" + myage + "歳の" + myname + "さん");
		
	}
}
