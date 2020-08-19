import java.time.LocalTime;
import java.util.*;
class assignment_5
{
	public static void main(String args[])
	{
		LocalTime lt=LocalTime.now();
		System.out.println("Current Time: "+lt);
		
		System.out.println("Time After 30 minute: "+lt.plusMinutes(30));		
	}
}
