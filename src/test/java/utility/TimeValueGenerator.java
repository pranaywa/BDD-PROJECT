package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeValueGenerator {
public static String getTime() {
	DateTimeFormatter df=DateTimeFormatter.ofPattern("dd mm yy"); // date minute year
	LocalDateTime now = LocalDateTime.now();
	String timeValue =df.format(now);
	String time = timeValue.replace(" ","");
	return time;
}
public static void main(String[] args) {
	String time =getTime();
	System.out.println(time);
}
}
