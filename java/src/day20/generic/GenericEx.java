package day20.generic;

public class GenericEx {

	public static void main(String[] args) {
		Student<Integer> std = new Student<Integer>();
		std.kor = 10; //10.0을 넣으면 에러가 발생
		
		Student<Double> std2 = new Student<Double>();
		std2.kor = 10.0;
		
		print(std2);
		GenericEx.<Double>print(std2);
		GenericEx.print(std2);//std2가 double로 되어있어서 print의 t를 double로 추정할수 있다.
	}
	//학생 정보를 출력하는 메서드
	public static <T extends Number> void print(Student<T> std) {
		System.out.println(std.grade);
		System.out.println(std.classNum);
		System.out.println(std.num);
		System.out.println(std.name);
		System.out.println(std.kor);
	}
	
}
