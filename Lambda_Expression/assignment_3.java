import java.util.*;

class assignment_3
{
	public static void main(String []args)
	{
	
		ArrayList<String> al=new ArrayList<>();
		al.add("Hello");
		al.add("How");
		al.add("were");
		al.add("you");
		al.add("when");
		al.add("stranded");
		al.add("in the");
		al.add("coronavirus");
		al.add("hospital");
		al.add("in mumbai");
		System.out.println("-----------------INSERTED 10 Strings-----------------");
	   al.forEach(System.out::println);
	   System.out.println("-----------------ODD LENGTH Strings-----------------");
	    al.forEach(x->{
			if(x.length()%2!=0)
			{
				System.out.println(x);
			}
		});
	}
	
}