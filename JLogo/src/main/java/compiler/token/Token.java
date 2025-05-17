package compiler.token;

public class Token {
	public TokenType type;
	public String value;
	
	public Token(TokenType type, String value) {
		this.type = type;
		this.value = value;
	}
	public Token(TokenType type) {
		this(type, null);
	}
	public Token(String value) {
		this(TokenType.NULL, value);
	}
	public Token() {
		this(TokenType.NULL);
	}
}
