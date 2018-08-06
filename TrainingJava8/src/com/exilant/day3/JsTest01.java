package com.exilant.day3;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest01 {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		
		ScriptEngine nashron=scriptEngineManager.getEngineByName("nashorn");
		
		String name="Anuj";
		Integer result=null;
		
		nashron.eval("print('"+name+"')");
		result=(Integer) nashron.eval("10+20");
		
		System.out.println("result is::"+result);
	}

}
