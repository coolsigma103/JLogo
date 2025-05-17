package compiler.parser;

import java.util.ArrayList;

import compiler.dataType.Function;
import compiler.dataType.Variable;

public class ParseList extends ArrayList<Parse> {
	
	ArrayList<Function> functions;
	ArrayList<Variable> variables;
	public ParseList(ArrayList<Function> functions, ArrayList<Variable> variables) {
		this.functions = functions;
		this.variables = variables;
	}
	public ParseList() {
		this(null, null);
	}
}
