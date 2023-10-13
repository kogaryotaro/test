
public class java10 {

	public static void main(String[] args) {
		String[] name1 = new String[3];
		
		name1[0] = "田中";
		name1[1] = "高橋";
		name1[2] = "斎藤";
		
		System.out.println(name1[0]);
		
		
		String[] name2 = {"田中", "高橋", "斎藤"};
		
		System.out.println(name2[1]);
		
		
		char[] c = {'a', 'b', 'c'};
		
		System.out.println(c[2]);
		
		int[] d = {1, 5, 10};
		
		System.out.println(d[1]);
		
		name2[0] = "加藤";
		System.out.println(name2[0]);
	}	
	

}
