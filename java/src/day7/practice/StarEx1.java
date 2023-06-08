package day7.practice;

public class StarEx1 {

	public static void main(String[] args) {
		/* ***** i=1 *=5
		 * ***** i=2 *=5
		 * ***** i=3 *=5
		 * ***** i=4 *=5
		 * ***** i=5 *=5
		 * 
		 * 반복문을 이용하여
		 */
	
		/* 외부 반복문 
		 * 반복횟수 : i는 1부터 5까지 1씩증가
		 * 실행문 : *5개를 출력후 엔터
		 */
		for(int i=1; i<=5; ++i) {
			
		
			/* 내부 반복문
			 * 반복횟수 : 
			 * 실행문 : j는 1부터 5까지 1씩 증가
			 * 규칙성 : *를 출력
			 */
		
			for(int j=1; j<=5; ++j) {
				System.out.print('*');
				
			}
			System.out.println();

		}
	}
}
