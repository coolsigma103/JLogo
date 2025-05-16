package io.mainWindow;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar{
	
	JMenu fileMenu;
	JMenuItem[] fileMenuItems = {
		new JMenuItem("Open"),
		new JMenuItem("Code file")
	};
	
	public MenuBar() {
		fileMenu = new JMenu("File");
		this.add(fileMenu);
	}
	
}
