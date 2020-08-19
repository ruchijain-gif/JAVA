


//////////////////////////////////////////////////////////
////////////----------INCOMPLETE PROGRAM------////////////
/////////////////////////////////////////////////////////
import java.util.*;
class InvalidEmployeeException extends Exception
{
	InvalidEmployeeException(String s)
	{
		System.out.println(s);
		//super(s);
	}
}
class Employee
{
	String first;
	String second;
}
class assignment_3
{
	public static void main(String args[]) throws InvalidEmployeeException
	{
	  Employee em=new Employee();
	  Optional<String> ob=Optional.ofNullable(em.first);
	  
	  System.out.println(ob.orElseThrow(()->new InvalidEmployeeException("InvalidEmployeeException has Ocurred")));
	}
}	


