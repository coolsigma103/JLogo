package main;

import java.util.ArrayList;

import compiler.dataType.Function;
import compiler.dataType.Variable;
import compiler.parser.MakeParse;
import compiler.parser.Parse;
import compiler.parser.ParseList;
import compiler.token.MakeToken;
import compiler.token.Token;
import io.commandInput.CommandHistory;
import io.commandInput.CommandInput;
import io.commandInput.CommandWindow;
import io.mainScreen.MainScreen;
import io.mainWindow.Window;

public class Main {
	
	public String fileName;
	
	public ArrayList<Function> functions = new ArrayList<Function>();
	public ArrayList<Variable> variables = new ArrayList<Variable>();
	
	public Window window;
	public MainScreen mainScreen;
	
	public CommandHistory commandHistory;
	public CommandWindow commandWindow;
	public CommandInput commandInput;
	
	public static void main(String[] args) {
		System.out.println("Welcome to JLogo!");
		new Main();
	}
	
	public Main() {
		mainScreen = new MainScreen(this);
		commandHistory = new CommandHistory();
		commandWindow = new CommandWindow(this);
		commandInput = new CommandInput(this, commandHistory, commandWindow);
		window = new Window(this, commandInput, commandHistory, mainScreen);
	}
	
	//File action
	public void newFile() {
		System.out.println("Creating a new file");
	}
	public void openFile() {
		System.out.println("Opening a file");
	}
	public void save() {
		System.out.println("Saving current work.");
	}
	public void saveAs() {
		
	}
	public static void exit() {
		System.out.println("Exit programme.");
		System.exit(0);
	}
	
	public String executeCommand(String command) {
		ArrayList<Token> tokens = MakeToken.makeToken(command);
		ParseList parseList = MakeParse.makeParse(tokens, functions, variables);
		for(Parse parse:parseList) {
			System.out.println(parse.value[0]);
		}
		return command;
	}
	
}
