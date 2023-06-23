package day18.practice;

public class StringIndexOfEx {

	public static void main(String[] args) {
		//헬로월드에서 l이 몇개 있는지 확인하는 코드를 작성하세요
		
		String str = "Hello World";
        int count = 0;
        String search = "l";
        int index = -1;
        
        //반복
        do {
        	//hello world에 l의 위치를 찾음
        	//->d에서 l의 위치를 찾음
        	index = str.indexOf(search, ++index);
        	//찾았으면 개수를 증가
        	if(index != -1) {
        		count++;
        	}
        }while(index != -1);
        //개수를 출력
        System.out.println(str + " : " + search + " : " + count);
        
      
	}

}
