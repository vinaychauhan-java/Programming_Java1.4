package com.java.vinay.swings;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyExample_BorderLayout1 extends JFrame
{

	public static void main(String[] args)
	{

		MyExample_BorderLayout1 bld = new MyExample_BorderLayout1();
		bld.setLayout(new BorderLayout(10,10));
		bld.add(new JButton("NORTH"), BorderLayout.NORTH);
		bld.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		bld.add(new JButton("EAST"), BorderLayout.EAST);
		bld.add(new JButton("WEST"), BorderLayout.WEST);
		bld.add(new JButton("CENTER"), BorderLayout.CENTER);
		bld.setSize(300, 300);
		bld.setVisible(true);
	}

}
