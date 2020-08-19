import java.util.stream.*;
import java.util.*;
class Student
{
	int rollNo;
    String name;
    int mark;
 
	Student(int rollNo,String name,int mark)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.mark=mark;
	}
	void details()
	{
		System.out.println("Student number: "+rollNo);
//		System.out.println("Student number: "+empNo+"\tName: "+name+"\tAge: "+age+"\tLocation: "+location );
	}
}
class assignment_3
{
	public static void main(String args[])
	{
		Student e1=new Student(111,"Aisha",78);
		Student e2=new Student(222,"Nimisha",99);
		Student e3=new Student(333,"Tanisha",51);
		Student e4=new Student(444,"Latisha",22);
		Student e5=new Student(555,"Meetisha",50);
		
	  ArrayList<Student> al=new ArrayList<>();
	  al.add(e1);
	  al.add(e2);
	  al.add(e3);
	  al.add(e4);
	  al.add(e5);
	 long li=al.stream()
	          .filter(x->(x.mark>=50))
			.count();
			System.out.println("Student number count: "+li);
	 // li.forEach(n->n.details());
	}
}
