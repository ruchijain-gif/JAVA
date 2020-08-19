import javax.script.*;
import java.io.*;
import java.util.*;
class assignment_2
{
	public static void main(String args[]) throws Exception
	{
		ScriptEngineManager manager=new ScriptEngineManager(null);
		ScriptEngine engine=manager.getEngineByName("nashorn");
		
		FileReader fr=new FileReader("G:\\WIPRO\\IntroductionToNashron\\demo.js");
     	engine.eval(fr);
		Invocable invocable=(Invocable )engine;
		Object flag=invocable.invokeFunction("value",25);
		System.out.println(flag);
	}
}
