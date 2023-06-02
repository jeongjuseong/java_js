package day4.ifex;

public class EvenNumberEx {

	public static void main(String[] args) {
		//if else문을 이용한 홀짝 판별 예제
		//num가 짝수이면(조건식) 짝수라고 출력하고(실행문) 아니면(else) 홀수라고 출력해라.
		//num가 2로 나누었을때 나머지가 0과 같다.
		int num = 4;
		if(num % 2 == 0) {
			System.out.println(num + " is a even number.");
		}else {
			System.out.println(num + " is a odd number.");
		}

	}

}
