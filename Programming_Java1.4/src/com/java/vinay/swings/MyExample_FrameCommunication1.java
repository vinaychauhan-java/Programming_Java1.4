package com.java.vinay.swings;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyExample_FrameCommunication1 extends JFrame
{

	JLabel label = new JLabel();
	JTextField text = new JTextField(20);
	JPanel panel = new JPanel(new GridLayout(2, 2));
	JButton button1 = new JButton("OK");
	JButton button2 = new JButton("Next");

	public MyExample_FrameCommunication1()
	{
		label.setText("Enter Name:");
		panel.add(label);
		panel.add(text);
		panel.add(button1);
		panel.add(button2);
		add(panel, BorderLayout.CENTER);
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				JOptionPane.showConfirmDialog(null, "Are you Confirm?");
			}
		});
		button2.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent ae)
			{
				String value = text.getText();
				JLabel label1 = new JLabel("Welcome: " + value);
				JPanel pan = new JPanel();
				pan.add(label1);
				frame.add(pan);
				frame.setSize(400, 300);
				frame.setVisible(true);
				
			}
		});
	}
	
	private static MyExample_FrameCommunication1 frame;
	public static void main(String arg[])
	{
		frame = new MyExample_FrameCommunication1();
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
}