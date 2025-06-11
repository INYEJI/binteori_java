package ex08;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExam01 {

	public static void main(String[] args) {
		
		//Europe/Paris 시간 구하기
		
		ZoneId.getAvailableZoneIds()
		.stream()
		.filter(s->s.startsWith("America"))
		.sorted()  //정렬
		.forEach(zoneId->System.out.println(zoneId));
		
		
		//Paris시간대의 현재 날짜와 시간 구하기
		ZonedDateTime parisDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
		System.out.println(parisDateTime);
		
		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("paris 현재 날자와 시간 : " + fomatter.format(parisDateTime));

		//Paris시간대의 현재 날짜와 시간 구하기
		ZonedDateTime laDateTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		
		System.out.println(laDateTime);
		
		DateTimeFormatter fomatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("LA 현재 날자와 시간 : " + fomatter2.format(laDateTime));
		
	}

}