import java.util.stream.*;
import java.util.*;
class assignment_2
{
	public static void main(String args[])
	{
	  ArrayList<String> al=new ArrayList<>();
	  al.add("Aisha");
	  al.add("Nisha");
	  al.add("Tisha");
	  al.add("Misha");
	  al.add("Kisha");  al.add("Lisha");  al.add("Xisha");
	  StringJoiner s1=new StringJoiner(",","{","}");
	  s1.add("Kota");
	  s1.add("Mumbai");
	  s1.add("Delhi");
	  s1.add("Agra");
	  s1.add("Jamshedpur");
	  StringJoiner s2=new StringJoiner(",","[","]");
	  s2.add("Kerala");
	  s2.add("Bangalore");
	  s2.add("Coachi");
	  s2.add("Madras");
	  System.out.println("First StringJoiner s1:\n "+s1);
	  System.out.println("Second StringJoiner s2: \n"+s2);
	  System.out.println("Merge StringJoiner\n s1 merged to s2: "+s1.merge(s2));
	  System.out.println(" s2 merged to s1: "+s2.merge(s1));
	  
	
	}
}
