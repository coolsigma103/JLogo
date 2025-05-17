package io.commandInput;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Main;

public class CommandInput extends JPanel{
	
	JPanel inputField = new JPanel();
	JTextField commandField = new JTextField();
	JButton enterButton = new JButton("Enter");
	CommandHistory commandHistory;
	CommandWindow commandWindow;
	CommandButtons commandButtons;
	Main main;
	
	public CommandInput(Main main, CommandHistory commandHistory, CommandWindow commandWindow) {
		this.commandHistory = commandHistory;
		this.main = main;
		this.commandWindow = commandWindow;
		
		commandButtons = new CommandButtons(main, this);
		this.setLayout(new BorderLayout());
		
		commandField.addActionListener(e -> ExecuteCommand());
		enterButton.addActionListener(e -> ExecuteCommand());
		
		inputField.setLayout(new BorderLayout());
		inputField.add(commandField, BorderLayout.CENTER);
		inputField.add(enterButton, BorderLayout.EAST);
		this.add(inputField, BorderLayout.SOUTH);
		
		this.add(commandButtons, BorderLayout.EAST);
		
		this.add(commandHistory.scrollPane, BorderLayout.CENTER);
		
	}
	
	private void ExecuteCommand() {
		if(!commandField.getText().isBlank()) {
			commandHistory.addText(main.executeCommand(commandField.getText()));
			commandField.setText("");
		}
	}
	
	public void openCommandWindow() {
		if(commandWindow.isVisible()) {
			commandWindow.setVisible(false);
		}
		else {
			commandWindow.setVisible(true);
		}
	}
	
}
