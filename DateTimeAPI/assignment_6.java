import java.time.LocalTime;
import java.util.*;
class assignment_6
{
	public static void main(String args[])
	{
		LocalTime lt=LocalTime.now();
		System.out.println("Current Time: "+lt);
		LocalTime lt1=lt.minusHours(5);
		LocalTime lt2=lt1.minusMinutes(30);
		
		System.out.println("Time Before 5 hour 30 minute: "+lt2);		
	}
}
