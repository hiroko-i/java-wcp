package Chapter3;

public class chapter3_1 {
	public static void main(String[] args) {
//		分岐
		boolean tenki = false;
		if(tenki == true) {
			System.out.println("洗濯をします");
		}else {
			System.out.println("DVDを見ます");
		}

		String tenki_2 = "晴れ";
		if(tenki_2.equals("晴れ")){
			/*
			 * if(tenki_2 == "晴れ"){ 文字列は"＝＝"で比較できない
			 * ”==”でもコンパイルエラーは起きない
			 */
			System.out.println("洗濯をします");
		}else {
			System.out.println("DVDを見ます");
		}



//		繰り返し
		boolean doorClose = false;
//		trueの場合無限ループ
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("１分待つ");
		}
	}
}
