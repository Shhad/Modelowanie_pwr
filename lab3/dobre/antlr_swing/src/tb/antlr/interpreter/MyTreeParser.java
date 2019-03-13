package tb.antlr.interpreter;

import java.util.HashMap;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class MyTreeParser extends TreeParser {
	protected HashMap<String, Integer> map = new HashMap<String,Integer>();

    public MyTreeParser(TreeNodeStream input) {
        super(input);
    }

    public MyTreeParser(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    protected void drukuj(String text) {
        System.out.println(text.replace('\r', ' ').replace('\n', ' '));
    }

    protected Integer sum(Integer e1, Integer e2) {
		return e1 + e2;
	}
	
	protected Integer difference(Integer e1, Integer e2) {
		return e1 - e2;
	}
	
	protected Integer multiply(Integer e1, Integer e2) {
		return e1 * e2;
	}
	
	protected Integer divide(Integer e1, Integer e2) {
		if (e2 == 0)
			throw new ArithmeticException("Dont divide by 0!");
		return e1 / e2;
	}
	
	protected Integer initialize(String i1) {
		return this.initialize(i1, 0);
	}
	
	protected Integer initialize(String i1, Integer e2) {
		if(map.containsKey(i1)) {
			throw new RuntimeException("Variable \"" + i1 + "\" was already initialized");
		}
		map.put(i1, e2);
		return e2;
	}
	
	protected Integer podstaw(String i1, Integer e2) {
		if(map.containsKey(i1)) {
			map.put(i1, e2);
			return e2;
		}
		throw new RuntimeException("Variable \"" + i1 + "\" was not initialized");
	}
	
	protected Integer getInt(String i1) {
		return Integer.parseInt(i1);
	}
	
	protected Integer getValue(String i1) {
		if(map.containsKey(i1))
			return map.get(i1);

		throw new RuntimeException("You tried to get value of variable \"" + i1 + "\" which was not initialized");
	}
}
