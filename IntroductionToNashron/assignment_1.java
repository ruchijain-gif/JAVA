import javax.script.*;
class assignment_2
{
	public static void main(String args[]) throws Exception
	{
		ScriptEngineManager manager=new ScriptEngineManager();
		ScriptEngine engine=manager.getEngineByName("nashron");
		FileReader fr=new FileReader("G:\\WIPRO\\IntroductionToNashron\\demo.js")
		engine.eval(fr);
		Invocable invocable=(Invocable )engine;
		System.out.println("Today's date:  "+ld);
		System.out.println("After 10 days:  "+ld.plusDays(10));
		
	}
}
