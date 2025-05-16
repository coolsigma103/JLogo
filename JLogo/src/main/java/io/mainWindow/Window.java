package io.mainWindow;

import javax.swing.JFrame;

public class Window extends JFrame {
	
	MenuBar menuBar;
	
	public Window() {
		menuBar = new MenuBar();
		this.setSize(420, 420);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}
	
}
