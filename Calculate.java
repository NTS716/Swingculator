import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class Calculate {
	
	public static String calculate(String equation) throws Exception
	{
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");

		return engine.eval(equation).toString();
	}


	public static void main(String[] args) throws Exception
	{
		System.out.println("The Answer is " + calculate());
	}
}
