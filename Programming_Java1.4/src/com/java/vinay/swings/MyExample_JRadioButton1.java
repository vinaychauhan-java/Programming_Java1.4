package com.java.vinay.swings;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// Program used to take two values in TextBox and then addition of the same.
public class MyExample_JRadioButton1 extends JFrame
{
	JLabel label = null;
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				MyExample_JRadioButton1 object = new MyExample_JRadioButton1();
				object.setTitle("My JRadioButton"); // set the title of the window
				object.setSize(300, 200); // resize the window to be 300px wide and 200px tall
				object.setLocationRelativeTo(null); // will center the window on the screen
				object.setDefaultCloseOperation(EXIT_ON_CLOSE); // will close the window, if we click on the close button of the titlebar. By default nothing happens.
				object.setVisible(true);
			}
		});

	}

	public MyExample_JRadioButton1()
	{
		initalizeComponent();
		pack(); // To show everything on the frame, frame will be resized by the pack() method or the setSize() method of Java Swing.
	}

	public void initalizeComponent()
	{

		Container container = getContentPane();
		JPanel panel = new JPanel();

		Action action2 = new AbstractAction("Pentium-II") {
		      public void actionPerformed(ActionEvent event) {
		    	  System.out.println("Result is "+event.getActionCommand());
		    	  label.setText(event.getActionCommand());
		    	  JOptionPane.showMessageDialog(null,"This is the " + event.getActionCommand() + 
		    	  " radio button.");
		      }
		   };
		    
		JRadioButton button1 = new JRadioButton("Pentium-I");
		button1.setSelected(true);
		JRadioButton button2 = new JRadioButton(action2);
		ButtonGroup group = new ButtonGroup();
	    group.add(button1);
	    group.add(button2);
	    panel.add(button1);
	    panel.add(button2);
	    label = new JLabel("Testing.....");
	    panel.add(label);
	    
	    container.add(panel, BorderLayout.NORTH);
	    container.add(label, BorderLayout.CENTER);
	    
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.out.println("Result is "+event.getActionCommand());
				label.setText(event.getActionCommand());
			}
		});
		
//		button2.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent event)
//			{
//				System.out.println("Result is "+event.getActionCommand());
//			}
//		});
		
	}
	

}
