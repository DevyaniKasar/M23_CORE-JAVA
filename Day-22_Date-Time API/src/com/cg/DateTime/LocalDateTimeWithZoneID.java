package com.cg.DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeWithZoneID {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("Asia/Singapore"));
		LocalDateTime df=LocalDateTime.now(ZoneId.of("Egypt"));
		System.out.println(t);
		System.out.println(df);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
		

	}

}
