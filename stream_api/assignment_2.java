import java.util.stream.*;
import java.util.*;
class Employee
{
	int empNo;
    String name;
    int age;
    String location;
	Employee(int empNo,String name,int age,String location)
	{
		this.empNo=empNo;
		this.name=name;
		this.age=age;
		this.location=location;
	}
	void details()
	{
		System.out.println("Employee number: "+empNo+"\tName: "+name+"\tAge: "+age+"\tLocation: "+location );
	}
}
class assignment_2
{
	public static void main(String args[])
	{
		Employee e1=new Employee(111,"Aisha",21,"Pune");
		Employee e2=new Employee(222,"Nimisha",22,"Pune");
		Employee e3=new Employee(333,"Tanisha",23,"Borivilli");
		Employee e4=new Employee(444,"Latisha",24,"Pune");
		Employee e5=new Employee(555,"Meetisha",25,"Lonawala");
		
	  ArrayList<Employee> al=new ArrayList<>();
	  al.add(e1);
	  al.add(e2);
	  al.add(e3);
	  al.add(e4);
	  al.add(e5);
	  List<Employee> li=al.stream()
	          .filter(x->(x.location.equalsIgnoreCase("pune")))
			  .collect(Collectors.toList());
	  li.forEach(n->n.details());
	}
}
