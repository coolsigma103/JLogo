package io.commandInput;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Main;

public class CommandInput extends JPanel{
	
	JPanel inputField = new JPanel();
	JTextField commandField = new JTextField();
	JButton enterButton = new JButton("Enter");
	CommandHistory commandHistory;
	
	public CommandInput(Main main, CommandHistory commandHistory) {
		this.setLayout(new BorderLayout());
		
		inputField.setLayout(new BorderLayout());
		inputField.add(commandField, BorderLayout.CENTER);
		inputField.add(enterButton, BorderLayout.EAST);
		this.add(inputField, BorderLayout.SOUTH);
		
		
		this.add(commandHistory.scrollPane, BorderLayout.CENTER);
		
		
	}
	
}
