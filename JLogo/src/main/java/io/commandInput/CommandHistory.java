package io.commandInput;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CommandHistory extends JTextArea{
	
	public JScrollPane scrollPane = new JScrollPane(this);
	public CommandHistory() {
		this.setEditable(false);
		this.setRows(10);
		this.setColumns(50);
		this.setColumns(100);
		this.addText("Welcome to JLogo! Type \'help\' for list of commands or \'exit\' to quit.");
		
	}
	
	public void addText(String value) {
		this.append(value + '\n');
	}
}
