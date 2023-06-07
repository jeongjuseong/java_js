package day6.practice;

import java.util.*;

public class AverageEx {

	public static void main(String[] args) {
		/*국어 , 영어, 수학 성적을 입력받아 평균을 구하는 코드를 작성하세요.
		* n을 입력하기 전까지
		*/
		

		int kor, eng, math;
		char menu = 'y';
		double avg;
		Scanner sc = new Scanner(System.in);
		
		//반복문 : menu가 n이 아니면 반복( y,n이 아닌 다른문자를 입력하면 반복 )
		//menu가 y이면 반복( y,n이 아닌 다른문자를 입력하면 종료)
		while (menu != 'n') {
			//국어, 영어, 수학 점수 입력
			System.out.println("점수를 입력하세요 : ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			//평균을 계산
			avg = (kor + eng + math) / 3.0; 
			//평균을 출력
			System.out.println("해당 평균 점수는" + avg + "입니다.");
			//더할건지 물어본후, 입력
			System.out.println("continue?(y/n) : ");
			menu = sc.next().charAt(0);
		}
		//exit를 출력
		System.out.println("exit!");
		
		sc.close();


	}

}
