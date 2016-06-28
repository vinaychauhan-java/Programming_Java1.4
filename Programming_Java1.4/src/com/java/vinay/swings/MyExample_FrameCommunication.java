package com.java.vinay.swings;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class ChildFrame extends JFrame
{

	public ChildFrame()
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				initalizeChildComponent();
				setVisible(true);
				//pack();
			}
		});
	}

	public void initalizeChildComponent()
	{
		this.setTitle("Child Frame || FrameCommunication-Example"); // set the title of the window
		this.setSize(300, 200); // resize the window to be 300px wide and 200px tall
		this.setLocationRelativeTo(null); // will center the window on the screen
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE); // will close the window, if we click on the close button of the titlebar. By default nothing happens.
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		Container container = getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("Welcome");
		label.setBounds(100, 60, 100, 30);
		label.setToolTipText("You are Welcome to the FrameCommunication-Example");
		panel.add(label);
		container.add(panel);
	}
}

public class MyExample_FrameCommunication extends JFrame
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				MyExample_FrameCommunication object = new MyExample_FrameCommunication();
				object.setTitle("Parent Frame || FrameCommunication-Example"); // set the title of the window
				object.setSize(600, 400); // resize the window to be 300px wide and 200px tall
				object.setLocationRelativeTo(null); // will center the window on the screen
				object.setDefaultCloseOperation(EXIT_ON_CLOSE); // will close the window, if we click on the close button of the titlebar. By default nothing happens.
				//object.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
				object.setVisible(true);
				
			}
		});

	}

	public MyExample_FrameCommunication()
	{
		initalizeComponent();
		pack();
	}

	public void initalizeComponent()
	{

		Container container = getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,1));
		final JButton button1 = new JButton("Click Here");
		button1.setToolTipText("Press here for Child Window");
		panel.add(button1,BorderLayout.CENTER);
		container.add(panel);

		button1.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent evt)
			{
				ChildFrame childFrame = new ChildFrame();
				button1.setEnabled(false);
			}
		});

	}

}