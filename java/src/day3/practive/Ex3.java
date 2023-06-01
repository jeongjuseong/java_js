package day3.practive;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		/*정수 num를 입력받아서 num가 음수인지, 양수인지 판별하는
		*코드 if문을 이용하여 작성하세요.
		*num가 0이면 0이라고 출력하고
		*num가 양수이면 양수라고 출력하는 코드를 작성하세요
		*/
		Scanner sc = new Scanner(System.in);
		
		int num = 2;
		
		if(num == 0) {
			System.out.println("0입니다.");
		}
		
		if(num > 0) {
			System.out.println("양수입니다.");
		}//if를 하나씩 확인하고 출력하기 위해서 }를 넣는다.
		
		if(num < 0) {
			System.out.println("음수입니다.");
			sc.close();	
		}
	}

}
