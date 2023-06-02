package day4.ifex;

import java.util.*;

public class IfSeasomEx {

	public static void main(String[] args) {
		//월을 입력받아 입력받은 월의 계절을 출력하세요.
		// 3,4,5 : 봄
		// 6,7,8 : 여름
		// 9,10,11 : 가을
		// 12,1,2 : 겨울
		// 그외 : 잘못된 월
		int month;
		System.out.println("월을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		
		//&& 두항이 참인경우 결과가 참
		if(month >= 3 && month <= 5) {
			System.out.println("봄 입니다.");
		}else if (month >= 6 && month <= 8) {
			System.out.println("여름 입니다.");
		}else if (month >= 9 && month <= 11) {
			System.out.println("가을 입니다.");
		}
		// || 두 항중 하나만 참이면 결과는 참.
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울 입니다.");
		}else { System.out.println("잘못된 월 입니다.");
		}
		sc.close();
	
	}

}
