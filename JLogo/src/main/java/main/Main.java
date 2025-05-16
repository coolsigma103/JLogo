package main;

import io.mainWindow.Window;

public class Main {
	
	public Window window;
	
	public Main() {
		Window window = new Window();
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to JLogo!");
		new Main();
	}
}
