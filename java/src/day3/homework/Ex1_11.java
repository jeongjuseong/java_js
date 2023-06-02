package day3.homework;

import java.util.*;

public class Ex1_11 {

	public static void main(String[] args) {
		//수업풀이
		//성별(M:남성,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건 연산자 이용
		char gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender :");
		gender = sc.next().charAt(0);
		boolean result = gender == 'W' ? true : false;
		System.out.println("Are you a women? " + result);
		sc.close();
	}

}
