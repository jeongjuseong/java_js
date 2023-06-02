package day4.practice;

import java.util.*;

public class IfAdultEx {

	public static void main(String[] args) {
		//나이를 입력받아 나이가 20세 이상이면 adult, 20세 미만이면
		//minor로 출력하는 코드를 이용 if else를 이용하여.
		int age;
		
	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("input age : ");
	 	age = sc.nextInt();
		if(age >= 20 ) {
			System.out.println(age + " is adult.");
		}else {
			System.out.println(age + " is minor.");
		}
		sc.close();

	}

}
