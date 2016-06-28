package com.java.vinay.swings;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// Program used to take two values in TextBox and then addition of the same.
public class MyExample_JText1 extends JFrame
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				MyExample_JText1 object = new MyExample_JText1();
				object.setTitle("My JText || Example"); // set the title of the window
				//object.setSize(300, 200); // resize the window to be 300px wide and 200px tall
				object.setLocationRelativeTo(null); // will center the window on the screen
				object.setDefaultCloseOperation(EXIT_ON_CLOSE); // will close the window, if we click on the close button of the titlebar. By default nothing happens.
				object.setVisible(true);
			}
		});
	}

	public MyExample_JText1()
	{
		initalizeComponent();
		pack(); // To show everything on the frame, frame will be resized by the pack() method or the setSize() method of Java Swing.
	}

	public void initalizeComponent()
	{

		Container container = getContentPane();
		JPanel panel = new JPanel();
		//panel.setLayout(new FlowLayout());
		//panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setLayout(new GridLayout(4, 1));
		
		JButton button1 = new JButton("    Click Here    ");
		//button1.setBounds(100, 60, 100, 30);
		button1.setToolTipText("Press here for results");
		final JTextField textField1 = new JTextField(10);
 	    final JTextField textField2 = new JTextField(10);
 	    final JTextField textField3 = new JTextField(10);
 	    panel.add(textField1);
		panel.add(textField2);
 	    panel.add(button1);
 	    panel.add(textField3);
		container.add(panel);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				int a = Integer.parseInt(textField1.getText());
				int b = Integer.parseInt(textField2.getText());
				int c = a+b;
				System.out.println("Result is "+c);
				textField3.setText(""+c);
			}
		});
		
	}

}
