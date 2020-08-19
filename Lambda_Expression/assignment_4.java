import java.util.*;
interface WordCount
{
	int count(String str);
}
class assignment_4
{
	public static void main(String args[])
	{
	WordCount wc=(x)->
	{
		int count=0;
		for(int i=0;i<x.length()-1;i++)
		{
			if(x.charAt(i+1)==' ')	//if((x.charAt(i+1)).equals(" "))
			{
				i=i+1;
				count++;
			}
		}
		return count+1;
	};
	Scanner sc=new Scanner(System.in);
	String word=sc.nextLine();
	int count=wc.count(word);
	System.out.println("COUNTED WORDS: "+count);
}
}