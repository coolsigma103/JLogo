package io.commandInput;
import java.awt.Button;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

import main.Main;

public class CommandButtons extends JPanel{
	
	private Button[] buttons = {
			new Button("Open Editor"),
	};
	Main main;
	CommandInput commandInput;
	public CommandButtons(Main main, CommandInput commandInput){
		this.main = main;
		this.commandInput = commandInput;
		buttons[0].addActionListener(e -> commandInput.openCommandWindow());
		
		this.setLayout(new GridBagLayout());
		this.add(buttons[0]);
	}
	
}
