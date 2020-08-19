import java.util.stream.*;
import java.util.*;
class assignment_1
{
	public static void main(String args[])
	{
	  ArrayList<Integer> al=new ArrayList<>();
	  al.add(5);
	  al.add(-6);
	  al.add(2);
	  al.add(9);
	  al.add(-4);  al.add(-5);  al.add(-10);
	  List<Integer> li=al.stream()
	          .filter(x->(x<0 && x%2==0))
			  .collect(Collectors.toList());
			  li.forEach(System.out::println);
	}
}
