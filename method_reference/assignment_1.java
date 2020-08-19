interface test
{
	int facto(int n);
}
class factorial
{
	int fact(int n)
	{
		int sum=1;
		for(int i=n;i>0;i--)
		{
			sum=sum*i;
		}
		return sum;
		//if(n==1)
			//return 1;
		//else
			//return fact(n)*fact(n-1);
	}
}
class assignment_1
{
	public static void main(String args[])
	{
	  factorial ft=new factorial();
	  test tt=ft::fact;
	  	System.out.println("Factorial: "+ tt.facto(5));
	}
}