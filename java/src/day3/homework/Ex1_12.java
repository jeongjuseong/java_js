package day3.homework;

import java.util.*;

public class Ex1_12 {

	public static void main(String[] args) {
		//수업풀이 ( 문자열로 어떻게 하는지 )
		//성별(M:남성,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건 연산자 이용
		String gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender :");
		gender = sc.next();
		boolean result = gender.equals("W") ? true : false;
		System.out.println("Are you a women? " + result);
		sc.close();
	}

}
