package Chapter3;

public class chapter3_5 {
	public static void main (String[] args) {
//		(初期化処理; 繰り返し条件; 繰り返し時処理)
		for (int i = 0; i < 10; i++) {
			System.out.println("山へ行きたい");
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
//				掛け算
				System.out.print(i * j);
//				改行せず半角空欄を挟んで並べて表示
				System.out.print(" ");
			}
//			改行
			System.out.println("");
		}
	}
/*
 * 無限ループ
 * for(;;){}
 * while(true){}
 */
}