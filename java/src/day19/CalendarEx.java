package day19;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR); //get(1)
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "-" + month + "-" +day);
		
		//Date 객체를 Calendar 객체로
		Date date = new Date();
		cal = Calendar.getInstance();
		cal.setTime(date);
		
		//Calendar 객체를 Date 객체로
		cal = Calendar.getInstance();
		//Date(밀리초) 생성자는 1970년 1월1일0시를 기준으로 밀리초 만큼 흐른뒤의 날짜로 초기화
		Date date2 = new Date(cal.getTimeInMillis());
		
		
		//1970년 1월1일을 기준으로 1000ms흐른 날짜 객체를 생성 -> 1초
		//1초 흘렀는데, 9시간이 추가된 이유는 한국시간대이기 때문에, 한국 시간은 utc+9
		date2 = new Date(1000);
		System.out.println(date2);
	}

}
