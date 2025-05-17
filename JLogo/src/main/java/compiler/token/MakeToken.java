package compiler.token;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;

public final class MakeToken {

	public static ArrayList<Token> makeToken(String command) {
		
		ArrayList<Token> tokens = new ArrayList<Token>();
		command += ';';
		Token currentToken = new Token();
		for(int i = 0; i < command.length(); i++) {
			Character c = command.charAt(i);
			switch(c) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				if(currentToken.type == TokenType.NULL) {
					currentToken.type = TokenType.NUMBER;
					currentToken.value = c.toString();
				}
				else if(currentToken.type == TokenType.IDENTIFIER || currentToken.type == TokenType.NUMBER) {
					currentToken.value += c;
				}
				else {
					currentToken.type = TokenType.ERROR;
					currentToken.value = "Error: ";
					tokens.add(currentToken);
					currentToken = new Token();
				}
				break;
			case '.':
				if(currentToken.type == TokenType.NUMBER) {
					currentToken.value += c;
				}
				else {
					currentToken.type = TokenType.ERROR;
					currentToken.value = "Unexpected \'.\' in the command.";
				}
				break;
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
			case '(':
			case ')':
			case '=':
			case '&':
			case '|':
				if(currentToken.type != TokenType.NULL) {
					tokens.add(currentToken);
					currentToken = new Token();
				}
				tokens.add(new Token(TokenType.OPERATION, c.toString()));
				break;
			case ';':
			case ',':
			case ':':
			case '#':
				if(currentToken.type != TokenType.NULL) {
					tokens.add(currentToken);
					currentToken = new Token();
				}
				tokens.add(new Token(TokenType.SYMBOL, c.toString()));
			case '\n':
			case '\0':
			case '\t':
			case '\r':
			case '\b':
			case '\f':
			case ' ':
				if(currentToken.type != TokenType.NULL) {
					tokens.add(currentToken);
					currentToken = new Token();
				}
				break;
			default:
				if((Character.toLowerCase(c) >= 'a' && Character.toLowerCase(c) <= 'z') || (c == '_')){
					if(currentToken.type == TokenType.IDENTIFIER || currentToken.type == TokenType.NULL) {
						currentToken.value += c;
						currentToken.type = TokenType.IDENTIFIER;
					}
					else if(currentToken.type == TokenType.NUMBER) {
						tokens.add(currentToken);
						currentToken = new Token();
						currentToken.value = c.toString();
						currentToken.type = TokenType.IDENTIFIER;
					}
				}
				else {
					currentToken.type = TokenType.ERROR;
					currentToken.value = "Undefined character \'" + c + "\' in the command.";
					tokens.add(currentToken);
					currentToken = new Token();
				}
				break;
			}
		}
		return tokens;
	}
	
}
