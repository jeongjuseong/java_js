package day4.homework;

import java.util.*;

public class ScoreAverEx {

	public static void main(String[] args) {
		//국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		//(package : day4.homework, file : ScoreAverageEx)
		//성적은 정수.
		int korscore1, engscore2, mathscore3;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int korsc1 = sc.nextInt();
		int engsc2 = sc.nextInt();
		int mathsc3 = sc.nextInt();
		
		double average = (korsc1 + engsc2 + mathsc3) / 3;
		System.out.println("해당 평균 성적은 " + average + "입니다.");
		
		

		sc.close();
	}

}
