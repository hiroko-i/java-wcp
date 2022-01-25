package Chapter3;

public class chapter3_4 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = 1;
		switch (fortune) {
			case 1:
				System.out.println("大吉");
				break;
			case 2:
				System.out.println("中吉");
				break;
			case 3:
				System.out.println("吉");
				break;
			default:
				System.out.println("凶");
		}

//		breakをあえて書かないと明示的に処理を中断してswitch文から抜け出さない。次のcaseに飛ぶ。
		System.out.println("あなたの運勢を占います");
		int fortune_2 = new java.util.Random().nextInt(5) + 1;
		switch (fortune_2) {
			case 1:
			case 2:
				System.out.println("いいね！");
				break;
			case 3:
			case 4:
				System.out.println("まあまあ");
				break;
			case 5:
				System.out.println("気をつけて");
		}
	}
}
