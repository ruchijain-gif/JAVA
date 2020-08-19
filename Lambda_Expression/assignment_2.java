import java.util.*;
interface revWord
{
	public void rev(String word);
}
class assignment_2
{
	public static void main(String []args)
	{
		revWord r=(x)->{
			String word="";
			for(int i=x.length()-1;i>=0;i--)
			{
				word=word+x.charAt(i);
			}
			System.out.println(word);
		};
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
	   al.forEach(n->System.out.println(n));
	   System.out.println("-----------------REVERSED 10 Strings-----------------");
	    al.forEach(n->r.rev(n));
	}
	
}