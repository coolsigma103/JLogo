package io.mainWindow;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenuBar extends JMenuBar{
	
	JMenu fileMenu;
	
	public MenuBar() {
		fileMenu = new JMenu("File");
		this.add(fileMenu);
	}
	
}
