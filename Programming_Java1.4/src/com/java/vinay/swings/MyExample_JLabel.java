package com.java.vinay.swings;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyExample_JLabel extends JFrame
{

	public static void main(String[] args)
	{
		MyExample_JLabel obj = new MyExample_JLabel();
		obj.setSize(200, 200);
		obj.setLocationRelativeTo(null);
		obj.setVisible(true);
	}
	MyExample_JLabel() {
		JLabel jlbHelloWorld = new JLabel("Hello World");
		setLayout(new FlowLayout(FlowLayout.LEFT,10, 10));
		add(new Button("ONE"));
		add(new Button("TWO"));
		add(jlbHelloWorld);
		pack();
	}

}
