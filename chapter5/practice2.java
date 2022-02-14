package chapter5;

public class practice2 {
	public static void main(String[] args) {
		String title = "メールタイトル";
		String address = "aa@aa";
		String text = "メール本文";
		email(title, address, text);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
