package com.java.vinay.swings;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;


public class MyExample_JTable1 extends JFrame
{

	public static void main(String[] args)
	{
		MyExample_JTable1 obj = new MyExample_JTable1();

		JPanel panel = new JPanel();
		obj.setLayout(new BorderLayout(20,20));
		String data[][] = {{"vinod","BCA","A"},	
		                   {"Raju","MCA","B"},
		                   {"Ranjan","MBA","C"},
		                   {"Rinku","BCA","D"}};
		String col[] = {"Name","Course","Grade"};
		JTable table = new JTable(data,col);
		panel.add(table,BorderLayout.CENTER);
		obj.add(panel);
		
		obj.setSize(300,300); // resize the window to be 300px wide and 200px tall
		obj.setTitle("My JTable1 Example"); // set the title of the window
		obj.setLocationRelativeTo(null); // will center the window on the screen
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE); // will close the window, if we click on the close button of the titlebar. By default nothing happens.
		obj.setVisible(true);
	}
}
