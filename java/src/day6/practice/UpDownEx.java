package day6.practice;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		//한판이 끝나면 더할건지를 물어서 n을 입력하면 종료,
		//y를 입력하면 이어서 게임이 진행 (updown 게임을 하는코드를 작성)
		
		int min = 1, max = 100;
		char menu;
		int num, random;
		Scanner sc = new Scanner(System.in);
		/*외부 반복문 : 게임을 더 진행할건지 결정하는 반복문
		 * 반복횟수 : 입력받은 문자가 n이 아니면 반복
		 * 규칙성 : up down 게임 한판 진행
		 */
		do {
			//랜덤한 수 생성
			random = (int)(Math.random() * (max - min + 1) + min);
			/*내부 반복문 : up down 게임 진행하는 반복문
			 * 반복횟수 : 입력받은 숫자가 랜덤한 숫자와 일치하지 않으면 반복
			 * 규칙성 : 입력받은 숫자가 정답보다 크면 down!, 작으면 up! , 맞으면 good!을 출력
			 */
			do {
				//입력
				System.out.println("input : ");
				num = sc.nextInt();
				
				//판별한 후 결과 출력
				if(num > random) {
					System.out.println("down!");
				}else if(num < random) {
					System.out.println("up!");
				}else {
					System.out.println("good!");
				}
			}while(random != num);
		
			
		
			//menu를 선택(더할건지 말건지)
			System.out.println("continue?(y/n) : ");
			menu = sc.next().charAt(0);
		}while(menu != 'n');
		
		sc.close();
		
		
	}

}
