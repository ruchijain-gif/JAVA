interface Vehicle
{
	default void message()
	{
		System.out.println("Inside Vehicle");
	}
}
interface FourWheeler
{
	default void message()
	{
		System.out.println("Inside FourWheeler");
	}
}
class car implements Vehicle,FourWheeler
{
	public void message()
	{
		
		System.out.println("Inside Override message method");
		Vehicle.super.message();
	}
}
class assignment_1
{
	public static void main(String args[])
	{
		car c=new car();
		c.message();
	}
}