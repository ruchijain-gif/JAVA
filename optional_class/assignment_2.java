import java.util.*;
class assignment_2
{
	String address;
	  String default_value="India";
	public static void main(String args[])
	{
	  assignment_2 a2=new assignment_2();
	  Optional<String> ob=Optional.ofNullable(a2.address);
	  
	  System.out.println(ob.orElse(a2.default_value));
	}	
}

