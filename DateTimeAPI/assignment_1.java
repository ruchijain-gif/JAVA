import java.time.LocalDate;
import java.util.*;
class assignment_1
{
	public static void main(String args[])
	{
		LocalDate ld=LocalDate.now();
		System.out.println("Today's date:  "+ld);
		System.out.println("After 10 days:  "+ld.plusDays(10));
		
	}
}
