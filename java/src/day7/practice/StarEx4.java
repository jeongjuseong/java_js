package day7.practice;

public class StarEx4 {

	public static void main(String[] args) {
		
		/* 외부 반복문 
		 * 반복횟수 : i는 1부터 5까지 1씩증가
		 * 실행문 : 별이 하나씩 증가하는 코드를 출력후 엔터
		 */
		
		for(int i=1; i<=5; ++i) {
			//공백을 출력하는 코드
			//내부 반복문
			for(int j=1; j<=5-i ; ++j) {
				System.out.print(' ');
			}
			/* 내부 반복문
			 * 반복횟수 : 
			 * 실행문 : j는 1부터 i까지 1씩 증가
			 * 규칙성 : ☆ 를 출력
			 */
				for(int j=1; j<=i; ++j) {
					System.out.print('☆');
		
				}
				for(int j=1; j<=i-1; ++j) {
					System.out.print('☆');
				
					
				}
				System.out.println();
		}
	}
	
}