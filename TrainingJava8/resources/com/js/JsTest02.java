package com.js;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest02 {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		
		ScriptEngine nashron=scriptEngineManager.getEngineByName("nashorn");
		nashron.eval(new FileReader("resources/com/js/ext.js"));
		
		System.out.println(nashron.eval("fnTest()"));
		System.out.println(nashron.eval("sayHello('herry')"));
		
	}

}
