package compiler.parser;

import java.util.ArrayList;

import compiler.dataType.Function;
import compiler.dataType.Variable;
import compiler.token.Token;

public class MakeParse {
	
	public static ParseList makeParse(ArrayList<Token> tokens, ArrayList<Function> functions, ArrayList<Variable> variables) {
		ParseList parses = new ParseList(functions, variables);
		Parse currentParse = new Parse();
		for(Token token:tokens) {
			switch(token.type) {
			case SYMBOL:
				if(token.value == ";" || token.value == ",") {
					
				}
				else if(token.value == ":") {
					
				}
				else if(token.value == "#") {
					if(currentParse.type == ParseType.NULL)
						currentParse.type = ParseType.VARIABLE_DECLARATION;
					else {
						currentParse.type = ParseType.FUNCTION_PARAMATER_DECLARATION;
					}
				}
				break;
			case NUMBER:
				break;
			case IDENTIFIER:
				if(currentParse.type == ParseType.NULL) {
					switch(token.value) {
					case "fd":
					case "bk":
					case "rl":
					case "rr":
					case "color":
					case "size":
					case "turtle":
						currentParse.type = ParseType.COMMAND;
						currentParse.name = token.value;
						currentParse.setValueNeeded(1);
						break;
					case "clean":
					case "editor":
					case "help":
					case "exit":
					case "end":
						currentParse.type = ParseType.COMMAND_WITH_NO_VALUE;
						currentParse.name = token.value;
						parses.add(currentParse);
						currentParse = new Parse();
						break;
					case "repeat":
					case "repeat_until":
					case "if":
					case "elif":
					case "else":
						currentParse.type = ParseType.STATEMENT;
						currentParse.setValueNeeded(1);
						break;
					}
				}
				else if(currentParse.type == ParseType.COMMAND || currentParse.type == ParseType.STATEMENT) {
					if(currentParse.currentValueIndex + 1 < currentParse.valueNeeded) {
						currentParse.value[currentParse.currentValueIndex] = token.value;
						currentParse.currentValueIndex ++;
					}
					else {
						currentParse.value[currentParse.currentValueIndex] = token.value;
						currentParse.currentValueIndex ++;
						parses.add(currentParse);
						currentParse = new Parse();
					}
				}
				break;
			case OPERATION:
				break;
			default:
				break;
			}
		}
		
		return parses;
	}
}