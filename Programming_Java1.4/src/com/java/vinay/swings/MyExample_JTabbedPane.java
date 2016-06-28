package com.java.vinay.swings;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;


public class MyExample_JTabbedPane extends JFrame
{


	public static void main(String[] args)
	{
		MyExample_JTabbedPane object = new MyExample_JTabbedPane();
		object.setTitle("Tabbed Pane Frame Example"); // set the title of the window
		object.setSize(300, 200); // resize the window to be 300px wide and 200px tall
		object.setLocationRelativeTo(null); // will center the window on the screen
		object.setDefaultCloseOperation(EXIT_ON_CLOSE); // will close the window, if we click on the close button of the titlebar. By default nothing happens.
		object.setVisible(true);
	}

	public MyExample_JTabbedPane(){
		initalizeComponent();
		pack(); // To show everything on the frame, frame will be resized by the pack() method or the setSize() method of Java Swing.
	}

	private void initalizeComponent()
	{
		Container container =  getContentPane(); //Returns the contentPane object for this frame.
		JTabbedPane tab = new JTabbedPane();
		// For First Tab
		JPanel panel1 = new JPanel();
		JButton button = new JButton("1");
		panel1.add(button);

		// For Second Tab
		JPanel panel2 = new JPanel();
		
		JRadioButton button1 = new JRadioButton("Pentium-I");
		button1.setSelected(true);
		JRadioButton button2 = new JRadioButton("Pentium-II");
		ButtonGroup group = new ButtonGroup();
	    group.add(button1);
	    group.add(button2);
	    panel2.add(button1);
	    panel2.add(button2);
	    JLabel label = new JLabel("Testing.....");
	    JPanel panel3 = new JPanel();
	    panel3.add(panel2);
	    panel3.add(label);
		
	    tab.add("Tab 1", panel1);
		tab.add("Tab 2", panel3);
		container.add(tab, BorderLayout.CENTER);
	}

}
