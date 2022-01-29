package Chapter4;

public class chapter4_9 {
	public static void main(String[] args) {
//		4_1
//		int[] points = new int[4];
//		double[] weights = new double[5];
//		boolean[] answers = new boolean[3];
//		String[] names = new String[3];

//		4_2
		int[] moneyList = {121902, 8302, 55100};
		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for(int list : moneyList) {
			System.out.println(list);
		}

//		4_4
		int[] numbers = {3, 4, 9};
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int num : numbers) {
			if(num == input) {
				System.out.println("あたり");
			}
//			for文で回すのでelseを書くと3度表示
//			else {
//				System.out.println("はずれ");
//			}
		}
	}
}
