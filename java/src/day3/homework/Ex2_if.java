package day3.homework;

import java.util.*;

public class Ex2_if {

	public static void main(String[] args) {
			//성별(M:남성,W:여성)를 입력받아 M이면 남성을, 
			//W이면 여성을 출력하는 코드를 작성하세요. if문 이용
		 	Scanner scanner = new Scanner(System.in);
		 	System.out.print("성별을 입력하세요 (M:남성, W:여성): ");
	        String gender = scanner.nextLine();
	        
	        if (gender.equals("M")) {
	            System.out.println("남성");
	        } else if (gender.equals("W")) {
	            System.out.println("여성");
	        }
	        
	        scanner.close();
	    }
	}