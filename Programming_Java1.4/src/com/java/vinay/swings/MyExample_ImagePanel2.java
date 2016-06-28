package com.java.vinay.swings;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyExample_ImagePanel2 extends JFrame
{

	public MyExample_ImagePanel2()
	{
		setSize(300, 300);
		setLocation(400, 300);
		BackgroundPanel bp = new BackgroundPanel();
		Button button = new Button("Button");
		bp.add(button);// to see something on top
		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
			System.out.println("Hurraahh!!");
			}
		});
		add(bp);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

	public static void main(String[] args)
	{
		new MyExample_ImagePanel2().setVisible(true);
	}
}

class BackgroundPanel extends JPanel
{

	Image img;

	public BackgroundPanel()
	{
		try
		{
			img = Toolkit.getDefaultToolkit().createImage("E:\\MyTestWorkSpace\\Programming_Java1.4\\src\\wallpaper.jpg");
		}
		catch (Exception e)
		{/*handled in paint()*/
		}
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		if (img != null)
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		else
			g.drawString("No Image", 100, 100);
	}
}