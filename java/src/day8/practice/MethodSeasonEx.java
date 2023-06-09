package day8.practice;

import java.util.Scanner;

public class MethodSeasonEx {

	public static void main(String[] args) {
		//월을 입력받아 계절을 출력하는 코드를 작성하세요
		
		int month;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input number : ");
		month = sc.nextInt();
		
		//month가 3이거나 4이건 5이면 spring 출력
		//month가 3과 같거나 month가 4와 같거나 month가 5와 같으면
		
		
		System.out.println(month + " is " + getSeason(month));
		
		sc.close();
	}
	/**월이 주어지면 주어진 월에 맞는 계절을 알려주는 메서드
	 * 매개변수 : 월 -> int month
	 * 리턴타입 : 계절 -> String
	 * 메서드명 : getSeason
	 */
	public static String getSeason(int month) {
		if(month == 3 || month == 4 || month == 5) {
			return"spring!";
		}
		//month가 6이거나 7이건 8이면 summer 출력
		else if(month == 6 || month == 7 || month == 8) {
			return"summer!";
		}
		//month가 9이거나 10이건 11이면 fall 출력
		else if(month == 9 || month == 10 || month == 11) {
			return"fall!";
		}
		//month가 12이거나 1이건 2이면 winter 출력
		else if(month == 12 || month == 1 || month == 2) {
			return"winter!";
		}
		else {//아니면 wrong month출력
			return"wrong month!";
		}
	}
}
