package Chapter4;

public class chapter4_2 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 60};
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
//		拡張for文  for(型　任意の変数名 : 配列変数名)
		for(int value : scores) {
			System.out.println(value);
		}


		int[] dna = new int[10];
		for (int i =0; i < dna.length; i++) {
			dna[i] = new java.util.Random().nextInt(4);
		}

		for(int i = 0; i < dna.length; i++) {
			char[] base = {'A', 'T', 'C', 'G'};
			System.out.print(base[dna[i]] + " ");
			/*↑下記の省略
			 * int baseType = dna[i];
			 * char baseChar = base[baseType];
			 * System.out.print(baseChar + " ");
			 * */
		}
	}
}
