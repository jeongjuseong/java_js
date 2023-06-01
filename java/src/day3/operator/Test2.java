package day3.operator;

public class Test2 {

	public static void main(String[] args) {
		//성적을 입력받아 입력받은 성적이 60점이상인지 확인하는 코드를 작성하시오
		//int score : 65 ( do you pass 65 points ? true )
		//int score : 45 ( do you pass 45 points ? false )
		int score = 65;
		String str;
		
		str = score >= 60 ? "true" : "false";
		System.out.println("do you pass 65 points? " + str);
		
		str = score <= 45 ? "true" : "false";
		System.out.println("do you pass 45 points? " + str);
		
		
		
		

	}

}
