
interface iprime
{
	void isprime(int x);
}
class test{
	test(int x)
	{
		int flag=1;
		for(int i=2;i<=x/2;i++)
		{
			flag=1;
			if(x%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		System.out.println("PRIME");
     	else
		System.out.println("NOT PRIME");
	}
}
class assignment_3
{
	public static void main(String args[])
	{
		iprime ip=test::new;
		ip.isprime(88);
	 }
}