
public class Java13 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		int a = 10;
		String b = a >= 0 ? "プラス" : "マイナス";
		
		System.out.println(b);
		System.out.println();
		
		for(int i = 0; i <= 5; i++) {
			String c = i % 2 == 0 ? "☆" : "★";
			System.out.println(c);
		}

	}

}
