package com.java.vinay.swings;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyExample_FlowLayout1 extends JFrame
{
	public static void main(String[] args)
	{
		MyExample_FlowLayout1 bld = new MyExample_FlowLayout1();
		bld.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		bld.add(new JButton("Button1"));
		bld.add(new JButton("Button2"));
		bld.add(new JButton("Button3"));
		bld.add(new JButton("Button4"));
		bld.add(new JButton("Button5"));
		bld.setSize(300, 300);
		bld.setVisible(true);
	}
}
