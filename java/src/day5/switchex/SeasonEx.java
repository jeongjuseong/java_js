package day5.switchex;

import java.util.Scanner;

public class SeasonEx {

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
		
		
		//월에 따른 계절을 출력(switch문으로)
		//== 일때마 쓸수있다.
		switch(month) {
		//월이 1,2,12일때 12의 실행문이 실행이 돼서 겨울이 출력
		//case 1: case 2: case 12: 1의 실행문이 없고 break도 없음 
		//2의 실행문도 없고 break문도 없음.
		case 3,4,5: //jdk 7버전 이후로 가능
			System.out.println("봄입니다.");
		break;
		
		case 6,7,8:
			System.out.println("여름입니다.");
		break;
		
		case 9,10,11:
			System.out.println("가을입니다.");
		break;
		
		case 12,1,2:
			System.out.println("겨울입니다.");
		break;
		
		}
		sc.close();
	}

}
