package com.java.vinay.swings;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// Program used to take two values in TextBox and then addition of the same.
public class MyExample_JList1 extends JFrame
{
	JLabel label = null;
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				MyExample_JList1 object = new MyExample_JList1();
				object.setTitle("My JList"); // set the title of the window
				object.setSize(300, 200); // resize the window to be 300px wide and 200px tall
				object.setLocationRelativeTo(null); // will center the window on the screen
				object.setDefaultCloseOperation(EXIT_ON_CLOSE); // will close the window, if we click on the close button of the titlebar. By default nothing happens.
				//object.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
				object.setVisible(true);
			}
		});

	}

	public MyExample_JList1()
	{
		initalizeComponent();
		pack(); // To show everything on the frame, frame will be resized by the pack() method or the setSize() method of Java Swing.
	}

	public void initalizeComponent()
	{

		Container container = getContentPane();
		JPanel panel1 = new JPanel();
		String subject[] = {"Math", "Computer", "Phisics", "Chemestry"};
		JList list = new JList(subject);
		panel1.add(list);
		
		JPanel panel2 = new JPanel();
		JTextArea textArea= new JTextArea("Welcome Roseindia",5,20);
		panel2.add(textArea);

		container.add(panel1, BorderLayout.NORTH);
		container.add(panel2, BorderLayout.SOUTH);
	   	    
//		button1.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent event)
//			{
//				System.out.println("Result is "+event.getActionCommand());
//				label.setText(event.getActionCommand());
//			}
//		});
	}

}
