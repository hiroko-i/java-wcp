package Chapter02;

public class chapter2_2 {
	public static void main(String[] args) {
		int a;
		a = 100;
		a++;
		System.out.println(a);

		int b;
		b = 100;
		b += 1;
		System.out.println(b);

		int c;
		c = 100;
		c = c + 1;
		System.out.println(c);
//		上記３つ同様　減算”−−”も

//		基本的にオペランドの前後どちらにつけてもOK。しかし他の演算子と使うときの違い
		int d = 10;
		int e = 10;
		System.out.println(++d + 10);
//		①変数dが１増え　②10加算
		System.out.println(e++ + 10);
//		①変数eに10足した値が表示　②変数eに1加算

		float f = 3;
		double g = f;
		System.out.println(f);
//		int3 →　float3.0F に自動変換
		System.out.println(g);
//		float型がdouble型に自動変換

		int age = (int)3.2;
		System.out.println(age);
//		強制型変換　キャスト演算子
	}
}
