package com.java.vinay.applets;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MyExample_Applet1 extends Applet {

	public void paint(Graphics g) {
		setBackground(Color.CYAN); // background color
		g.setColor(Color.BLACK); // drawing color
		g.setFont(new Font("Times New Roman", Font.BOLD, 30)); // set font face, bold, size
		g.drawString("Hello, world", 20, 80); // start at baseline (20,80)
	}
}
