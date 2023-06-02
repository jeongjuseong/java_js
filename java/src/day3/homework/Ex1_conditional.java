package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {

	public static void main(String[] args) {
		//성별(M:남성,W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요. 조건 연산자 이용
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("성별을 입력하세요 (m:남성, w:여성): ");
        String gender = scanner.nextLine();
        String result = (gender.equals("w")) ? "여성입니다." : "남성입니다.";
        
        System.out.println(result);
        
        scanner.close();
    }
}