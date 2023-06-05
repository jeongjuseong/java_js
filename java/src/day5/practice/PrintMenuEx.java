package day5.practice;

import java.util.*;

public class PrintMenuEx {

	public static void main(String[] args) {
		//다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전까지
		//반복적으로 실행되는 코드를 작성하세요.
		//menu
		//1. start
		//2. save
		//3. exit
		//select menu : 1
		//program start!
		int menu = 0; //3이 아닌값으로 초기화
		Scanner sc = new Scanner(System.in);
		while(menu != 3) {
			System.out.println("menu");
			System.out.println("1. start ");
			System.out.println("2. save ");
			System.out.println("3. exit ");
			System.out.println("Select Menu : ");
		
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("Program start!");
				break;
			case 2:
				System.out.println("Program save!");
				break;
			case 3:
				System.out.println("Program exit!");
				break;
			}
		
		}
		sc.close();

	}

}
