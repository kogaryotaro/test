
public class Java08 {

	public static void main(String[] args) {
		int a = 3;
		
		if(a > 0) {
			if(a == 2) {
				System.out.println("A");
			}else if(a == 3) {
				System.out.println("B");
			}else {
				System.out.println("C");
			}
		}
		
		
		int number = 110;
		
		if(number <= 100) {
			if(number < 20) {
				System.out.println("未成年");
			}else if(number == 77) {
				System.out.println("喜寿");
			}else if(number == 88) {
				System.out.println("米寿");
			}else {
				System.out.println("成人");
			}
		}

	}

}
