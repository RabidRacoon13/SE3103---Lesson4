package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IDemoPanel {
	
	JFrame window;
	private JButton quitButton = new JButton("Quit");
	private IDemoCanvas canvas; 

	public IDemoPanel(JFrame window){
		this.window = window;
	}

	public void init(){
		Container cp = window.getContentPane();

		canvas = new IDemoCanvas(this);

		JPanel southPanel = new JPanel();
		southPanel.add(quitButton);

		cp.add(BorderLayout.CENTER, canvas);
		cp.add(BorderLayout.SOUTH, southPanel);
	}
}
