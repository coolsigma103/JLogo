package io.commandInput;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CommandHistory extends JTextArea{
	
	public JScrollPane scrollPane = new JScrollPane(this);
	public CommandHistory() {
		this.setEditable(false);
		this.setRows(12);
		this.setColumns(100);
	}
	
}
