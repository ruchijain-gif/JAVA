import java.util.*;

class assignment_1
{
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 25 Integers: ");
		for(int i=0;i<25;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("DATA: ");
		
		al.forEach((x)->{
			int flag=1;
			if(x==1)
				System.out.println(" ");
			else if(x==2)
			{
				System.out.println(x);
			}
			else{
			for(int i=2;i<=x/2 ;i++)
			{
				if(x%i==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
			  System.out.println(x);
	        flag=0;
		}	}			
			});
	}
}