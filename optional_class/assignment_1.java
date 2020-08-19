import java.util.*;
class assignment_1
{
	public static void main(String args[])
	{
	  String names[] = new String[5];
	  Optional<String> ob=Optional.ofNullable(names[0]);
	  if(ob.isPresent())
	  {
	  System.out.println(names[0].length());
	}
	else
	{
	  System.out.println("NULL VALUE");
	}	
	}
}
