import java.util.*;
class assignment_1
{
	public static void main(String args[])
	{
		System.out.println("----------WEEKDAYS----------");
		ArrayList<String> al=new ArrayList<>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thrusday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		al.forEach(System.out::println);
	}
}