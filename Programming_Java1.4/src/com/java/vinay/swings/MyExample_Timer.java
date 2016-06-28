package com.java.vinay.swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MyExample_Timer extends JFrame {
	public MyExample_Timer() {
		final JLabel timeLabel = new JLabel();
		add(timeLabel);

		final DateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		ActionListener timerListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				String time = timeFormat.format(date);
				timeLabel.setText(time);
			}
		};
		Timer timer = new Timer(1000, timerListener);
		// to make sure it doesn't wait one second at the start
		timer.setInitialDelay(0);
		timer.start();
	}

	public static void main(String[] args) throws Exception {
		JFrame frame = new MyExample_Timer();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}