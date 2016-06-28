package com.java.vinay.swings;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MyExample_ImagePanel1 extends JPanel
{

	Image image;

	public MyExample_ImagePanel1()
	{

		image = Toolkit.getDefaultToolkit().createImage("E:\\MyTestWorkSpace\\Programming_Java1.4\\src\\wallpaper.jpg");
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if (image != null)
		{
			g.drawImage(image, 0, 0, this);
		}
	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				JFrame frame = new JFrame();
				frame.add(new MyExample_ImagePanel1());
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.setSize(400, 400);
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
}