import java.util.stream.*;
import java.util.*;
class assignment_1
{
	public static void main(String args[])
	{
	  ArrayList<String> al=new ArrayList<>();
	  al.add("Aisha");
	  al.add("Nisha");
	  al.add("Tisha");
	  al.add("Misha");
	  al.add("Kisha");  al.add("Lisha");  al.add("Xisha");
	  StringJoiner st=new StringJoiner(",","{","}");
	  al.forEach(n->st.add(n));
	  System.out.println(st);
	}
}
