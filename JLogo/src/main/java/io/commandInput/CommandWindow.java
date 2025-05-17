package io.commandInput;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import main.Main;

public class CommandWindow extends JFrame{
	
	public JTextArea textArea = new JTextArea();
	private JScrollPane scrollPane;
	private JMenuBar menuBar = new JMenuBar();
	private JMenu buildAndRunMenu = new JMenu("Build/Run");
	private JMenuItem[] buildrunItems = {
			new JMenuItem("Build"),
			new JMenuItem("Run"),
			new JMenuItem("Build and run")
	};
	
	public CommandWindow(Main main) {
		buildAndRunMenu.add(buildrunItems[0]);
		buildAndRunMenu.add(buildrunItems[1]);
		buildAndRunMenu.add(buildrunItems[2]);
		menuBar.add(buildAndRunMenu);
		
		scrollPane = new JScrollPane(textArea);
		this.setLayout(new BorderLayout());
		this.add(scrollPane, BorderLayout.CENTER);
		this.setJMenuBar(menuBar);
		this.setSize(420, 420);
		this.setVisible(false);
	}
	
	
	
}
