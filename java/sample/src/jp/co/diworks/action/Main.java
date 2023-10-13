package jp.co.diworks.action;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int total = gokei(2,3);
		System.out.println(total);
		System.out.println(circle(5));
		System.out.println(hikizan(10,10));
		System.out.println(kakezan(10,10));
		System.out.println(warizan(10,10));
	}
	
	public static int gokei(int number1, int number2) {
		return number1 + number2;
	}
	
	public static double circle(int hankei) {
		return hankei * hankei * 3.14;
	}
	public static int hikizan(int number1, int number2) {
		return number1 -number2;
	}
	public static int kakezan(int number1, int number2) {
		return number1 * number2;
	}
	public static int warizan(int number1, int number2) {
		return number1 / number2;
	}
}
