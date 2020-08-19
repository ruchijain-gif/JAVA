import java.util.*;
class employee
{
	int id;
	String name;
	String address;
	double salary;
	employee(int id, String name,String address,double salary)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	public void getdeatils()
	{
		System.out.println("---------Employee Details--------");
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);
		System.out.println("ADDRESS :"+address);
		System.out.println("SALARY :"+salary);
	}
}
class assignment_2
{
	public static void main(String args[])
	{
		System.out.println("----------WEEKDAYS----------");
		employee e1=new employee(1,"Elizah","Delhi",35000);
		employee e2=new employee(2,"Bennet","Bombay",40000);
		employee e3=new employee(3,"Caroline","NZ",5000);
		employee e4=new employee(4,"Dameon","KOTA",3000);
		employee e5=new employee(5,"Stefan","BANGLORE",8000);
		ArrayList<employee> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);al.add(e4);al.add(e5);
		al.forEach(n->n.getdeatils());
	}
}