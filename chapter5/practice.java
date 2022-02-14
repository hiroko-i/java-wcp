package chapter5;

public class practice {
	public static void main(String[] args) {
		introduceOneself();
	}
	
	public static void introduceOneself() {
		String name = "hiroko";
		int age = 28;
		double height = 174.5;
		char zodiac = '酉';
		System.out.println("名前は" + name + "です。年齢は" + age);
		System.out.println("身長は" + height + "で、干支は" + zodiac + "です。");
	}
}
