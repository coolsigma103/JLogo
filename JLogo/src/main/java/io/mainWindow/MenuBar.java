package io.mainWindow;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import main.Main;

public class MenuBar extends JMenuBar{
	
	private JMenu fileMenu;
	private Main main;
	JMenuItem[] fileMenuItems = {
			new JMenuItem("New"),
			new JMenuItem("Open"),
			new JMenuItem("Save"),
			new JMenuItem("Save as"),
			new JMenuItem("Exit")
	};
	
	public MenuBar(Main main) {
		this.main = main;
		fileMenu = new JMenu("File");
		addFileItems();
		this.add(fileMenu);
	}
	
	private void addFileItems() {
		fileMenuItems[0].addActionListener(e -> main.newFile());
		fileMenuItems[1].addActionListener(e -> main.openFile());
		fileMenuItems[2].addActionListener(e -> main.save());
		fileMenuItems[3].addActionListener(e -> main.saveAs());
		fileMenuItems[4].addActionListener(e -> Main.exit());
		for(JMenuItem item:fileMenuItems) {
			fileMenu.add(item);
		}
	}
	
}
