package io.mainWindow;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import io.commandInput.CommandHistory;
import io.commandInput.CommandInput;
import io.mainScreen.MainScreen;
import main.Main;

public class Window extends JFrame {
	
	public MenuBar menuBar;
	public Main main;
	public CommandInput commandInput;
	public CommandHistory commandHistory;
	public Window(Main main, CommandInput commandInput, CommandHistory commandHistory, MainScreen mainScreen) {
		this.main = main;
		this.commandInput = commandInput;
		this.commandHistory = commandHistory;
		menuBar = new MenuBar(main);
		
		this.setSize(420, 420);
		this.setLayout(new BorderLayout());
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setJMenuBar(menuBar);
		this.add(commandInput, BorderLayout.SOUTH);
		this.add(mainScreen, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
}
