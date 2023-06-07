package day6.dowhileex;

import java.util.*;


public class PrintMenuEx {

	public static void main(String[] args) {
		/*다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전까지 반복적으로
		*실행 되는 코드를 작성하세요
		*menu
		*1. start
		*2. save
		*3. exit
		*select menu:
		*/
		int menu;
		Scanner sc = new Scanner(System.in);
		
		//입력받은 menu가 3이 아니면 반복
		
		do {
			//메뉴 출력 및 메뉴 입력
			System.out.println("menu");
			System.out.println("1. start");
			System.out.println("2. save");
			System.out.println("3. exit");
			System.out.println("select menu: ");
			menu = sc.nextInt();
			//선택한 메뉴에 따른 출력문 실행
			switch (menu) {
			case 1: 
				System.out.println("program start!");
				break;
			case 2: 
				System.out.println("program save!");
				break;
			case 3: 
				System.out.println("program exit!");
				break;
			}
		}while(menu != 3);
		sc.close();
		

	}

}
