interface icount
{
	int count(int n);
	
	
}
class test{
	static int DigitCount(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
}
class assignment_2
{
	public static void main(String args[])
	{
	 icount i=test::DigitCount;
	 System.out.println("DigitCount in given number is  : " +i.count(48679));
	 }
}