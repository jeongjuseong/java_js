package day19.date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) throws ParseException {
		//현재 시간을 Date 객체로 생성(java.util)
		Date now = new Date();
		System.out.println(now);
		
		
		
		//Date객체 -> 문자열로
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd EE요일 HH:mm:ss");
		String str = format.format(now);
		System.out.println(str);
		
		//문자열 -> Date 객체
		format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		str = "2023-06-27 18:00:00";
		Date date = format.parse(str);
		System.out.println(date);
	}

}
