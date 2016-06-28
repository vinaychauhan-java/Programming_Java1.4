package com.java.vinay.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MyExample_JFrame1 extends JFrame
{

	// JFrame is a toplevel container, which is used for placing other widgets
	public MyExample_JFrame1()
	{
		MyExample_JFrame1_init();
	}

	public final void MyExample_JFrame1_init()
	{
		setTitle("My JFrame || Quit Button Example"); // set the title of the window
		setSize(300, 200); // resize the window to be 300px wide and 200px tall
		setLocationRelativeTo(null); // will center the window on the screen
		setDefaultCloseOperation(EXIT_ON_CLOSE); // will close the window, if we click on the close button of the titlebar. By default nothing happens.
		
		JPanel panel = new JPanel();
		// It is a generic lightweight container. We add the JPanel to the JFrame
		getContentPane().add(panel); 
		//By default, the JPanel has a FlowLayout manager. 
		//The layout manager is used to place widgets onto the containers. 
		//If we call setLayout(null) we can position our components absolutely. For this, we use the setBounds() method
		panel.setLayout(null);
		panel.setToolTipText("A Panel container");

		// We created a button and positioned it by calling the setBounds() method
		JButton quitButton = new JButton("Quit");
		quitButton.setBounds(100, 60, 100, 30);
		quitButton.setToolTipText("A button component");
		// The action listener will be called, when we perform an action on the button. 
		// In our case, if we click on the button. The click will terminate the application.
		quitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		});
		//In order to show the quit button, we must add it to the panel
		panel.add(quitButton);
	       
	}

	public static void main(String[] args)
	{
		// The invokeLater() method places the application on the Swing Event Queue.
		// It is used to ensure that all UI updates are concurrency-safe.
		// In other words, it is to prevent GUI from hanging in certain situations
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				MyExample_JFrame1 ex = new MyExample_JFrame1();
				ex.setVisible(true);
			}
		});
	}
}
