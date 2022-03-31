package Java11DEmo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Java11Demo {
	
	public static void isBlankExample()
	{
		String s1="";
		System.out.println(s1.isBlank());
	}

	public static void LinesExample()
	{
		String s1="Hi.....!"+"Bye.....!";
		Stream<String> l=s1.lines();
		l.forEach(System.out::println);
		
		//System.out.println(s1.isBlank());
	}
	public static void repeatExample()
	{
		String s1="*";
		System.out.println(s1.repeat(10));
	}
	public static void StripExample()
	{
		String s1="\n\t Hiiii\tbuddy";
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
	}
	public static void TimeUnitExample()
	{
		TimeUnit mydate=TimeUnit.HOURS;
		System.out.println(mydate.convert(Duration.ofDays(2)));
		
		TimeUnit mydate1=TimeUnit.DAYS;
		System.out.println(mydate1.convert(Duration.ofHours(48)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isBlankExample();
		LinesExample();
		repeatExample();
		StripExample();
		TimeUnitExample();
	}

}
