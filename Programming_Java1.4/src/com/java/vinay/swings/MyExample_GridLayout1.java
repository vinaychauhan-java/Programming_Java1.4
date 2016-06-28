package com.java.vinay.swings;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyExample_GridLayout1 extends JFrame
{
	public static void main(String[] args)
	{
		MyExample_GridLayout1 bld = new MyExample_GridLayout1();
		bld.setLayout(new GridLayout(2, 3, 10, 10));
		bld.add(new JButton("Button1"));
		bld.add(new JButton("Button2"));
		bld.add(new JButton("Button3"));
		bld.add(new JButton("Button4"));
		bld.add(new JButton("Button5"));
		bld.setSize(300, 300);
		bld.setVisible(true);
	}
}
