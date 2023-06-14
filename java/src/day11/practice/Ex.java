package day11.practice;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		//1~9사이의 랜덤한 수를 3개 만들어서 배열에 저장한후 출력하는 코드를 만드세요
		// 3개의 숫자를 저장할 배열 생성
		int [] arr = new int[3];
		
		int min = 1, max = 9;
	
		for (int i = 0 ; i < 3; i++) {
			arr[i]  = (int)(Math.random() * (max - min + 1) + min);
			System.out.println(arr[i]);
			                    
		
		}
	
	}	
	
}
