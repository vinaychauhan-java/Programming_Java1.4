package com.java.vinay.applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MyExample_Applet2 extends Applet implements ActionListener {
	private TextField tfCount;
	private int countValue = 0;

	public void init() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		add(new Label("Counter"));
		tfCount = new TextField(10);
		tfCount.setEditable(false);
		tfCount.setText(countValue + "");
		add(tfCount);
		Button btnCount = new Button("Count");
		add(btnCount);
		btnCount.addActionListener(this);
		setBackground(Color.CYAN);
	}

	// Event handler: increase the count and show it in the text field
	public void actionPerformed(ActionEvent e) {
		countValue++;
		tfCount.setText(countValue + "");
	}
}
