package com.java.vinay.swings;

import javax.swing.JOptionPane;

public class MyExample_JOptionPane1
{

	JOptionPane optionPane;

	void launchFrame()
	{
		optionPane = new JOptionPane();
		String name = optionPane.showInputDialog("Hi, what's your name?");
		optionPane.showMessageDialog(null, "Nice to meet you, " + name + ".", "Greeting...", optionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	public static void main(String args[])
	{
		new MyExample_JOptionPane1().launchFrame();
	}

}
