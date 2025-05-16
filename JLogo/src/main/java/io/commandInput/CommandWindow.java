package io.commandInput;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CommandWindow extends JFrame{
	
	public JTextArea textArea = new JTextArea();
	private JScrollPane scrollPane;
	
	public CommandWindow() {
		scrollPane = new JScrollPane(textArea);
		this.setLayout(new BorderLayout());
		this.add(scrollPane, BorderLayout.CENTER);
		this.setSize(420, 420);
		this.setVisible(false);
	}
	
	
	
}
