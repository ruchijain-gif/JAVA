
interface Test{
	int myFunction(int a,int b,int c);
}
class assignment_2
{
	private int  myFunction(int a,int b,int c, Test intf1)
	{
		return intf1.myFunction(a,b,c);
	}
	public static void main(String args[])
	{
		int value;
		assignment_2 asg=new assignment_2();
		Test t1=(a,b,c)->(a+b+c);
		value=asg.myFunction(5,4,3,t1);
		System.out.println("ADD Operation: "+value);
		Test t2=(a,b,c)->(a*b*c);
		value=asg.myFunction(5,4,3,t2);
		System.out.println("MULTIPY Operation: "+value);
	}
}