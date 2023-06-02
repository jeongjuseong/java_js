package day4.practice;

import java.util.*;

public class IfScoreEx {

	public static void main(String[] args) {
		//성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요
		//90점 이상~100점 이하 : a
		//80이상 ~ 90미만 : b
		//70이상 ~ 80미만 : c
		//60이상 ~ 70미만 : d
		//60미만 f, 0보다 작거나 100보다 큰경우 :wrong score
		

		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요 : ");
		score = sc.nextInt();
		
		//90점 이상이거나 100점 이하인 점수
		if(score >= 90 && score <= 100) {
			System.out.println("이 점수는 A 입니다.");
		}else if(score >=80 && score < 90) {
			System.out.println("이 점수는 B 입니다.");
		}else if(score >=70 && score < 80) {
			System.out.println("이 점수는 C 입니다.");
		}else if(score >=60 && score < 70) {
			System.out.println("이 점수는 D 입니다.");
		}else if(score >=0 && score <= 60) {
			System.out.println("이 점수는 F 입니다.");
		}else{
			System.out.println("wrong score");
		}
		
			
		sc.close();
	}

}
