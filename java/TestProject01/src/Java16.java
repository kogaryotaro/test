
public class Java16 {

	public static void main(String[] args) {
		System.out.println("山田さん。"+ hello());
		System.out.println(totalPrice(300, 1.08, 350));
	}
		public static String hello() {
		return "こんにちは";
		}
	
		public static int totalPrice(int fruitprice, double tax, int haiso) {
		return (int)(fruitprice*tax) + haiso;
		}
}
	

