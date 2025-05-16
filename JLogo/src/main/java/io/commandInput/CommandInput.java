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
	Main main;
	
	public CommandInput(Main main, CommandHistory commandHistory) {
		this.commandHistory = commandHistory;
		this.main = main;
		this.setLayout(new BorderLayout());
		
		commandField.addActionListener(e -> ExecuteCommand());
		enterButton.addActionListener(e -> ExecuteCommand());
		
		inputField.setLayout(new BorderLayout());
		inputField.add(commandField, BorderLayout.CENTER);
		inputField.add(enterButton, BorderLayout.EAST);
		this.add(inputField, BorderLayout.SOUTH);
		
		this.add(commandHistory.scrollPane, BorderLayout.CENTER);
		
	}
	
	private void ExecuteCommand() {
		commandHistory.addText(main.executeCommand(commandField.getText()));
		commandField.setText("");
	}
	
}
