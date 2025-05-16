package main;

import io.commandInput.CommandHistory;
import io.commandInput.CommandInput;
import io.mainScreen.MainScreen;
import io.mainWindow.Window;

public class Main {
	
	public Window window;
	public CommandInput commandInput;
	public MainScreen mainScreen;
	public CommandHistory commandHistory;
	
	public static void main(String[] args) {
		System.out.println("Welcome to JLogo!");
		new Main();
	}
	
	public Main() {
		mainScreen = new MainScreen(this);
		commandHistory = new CommandHistory();
		commandInput = new CommandInput(this, commandHistory);
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
		
		return command;
	}
	
	
}
