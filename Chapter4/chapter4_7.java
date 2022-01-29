package Chapter4;

public class chapter4_7 {
	public static void main(String[] args) {
		int[][] scores = new int[2][3]; //2行×３列
//		要素の型[][] 配列変数名 = new 要素の型[行数][列数]
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 50;
		scores[1][1] = 70;
		scores[1][2] = 80;
//		int[][] scores ={{40, 50, 60},{50, 70, 80}} と同一
		System.out.println(scores[1][2]);
		System.out.println(scores.length);//行数
		System.out.println(scores[0].length);//０行目の列数
	}
}
