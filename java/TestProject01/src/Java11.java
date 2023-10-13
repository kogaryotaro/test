
public class Java11 {

	public static void main(String[] args) {
		String[][] country1 = {
				{"日本", "タイ"},
				{"アメリカ", "ブラジル"},
				{"フランス", "ロシア"}
		};
		System.out.println(country1[0][0]);
		System.out.println(country1[0][1]);
		System.out.println(country1[1][0]);
		
		String country2[][] = new String[3][2];
		
		country2[0][0] = "日本";
		country2[0][1] = "タイ";
		country2[1][0] = "アメリカ";
		country2[1][1] = "ブラジル";
		country2[2][0] = "フランス";
		country2[2][1] = "ロシア";
		
		System.out.println(country2[1][1]);
	}

}
