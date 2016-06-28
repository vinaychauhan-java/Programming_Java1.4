package com.java.vinay.swings;

import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyExample_JTable3 extends JPanel {

	public MyExample_JTable3() {

		Vector<String> columns = new Vector<String>(3);
		columns.add("Name");
		columns.add("City");

		Vector<Vector<String>> data = new Vector<Vector<String>>();
		Vector<String> row = new Vector<String>();
		row.add("Vinay");
		row.add("CHD");
		data.add(row);
		row = new Vector<String>();
		row.add("Vipin");
		row.add("KKR");
		data.add(row);

		JTable table = new JTable(data, columns);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);
		table.setVisible(true);
		table.validate();
		add(table);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("View Doctors");
		JScrollPane scrollPane = new JScrollPane(new MyExample_JTable3());
		frame.getContentPane().add(scrollPane);
		frame.setSize(300, 400);
		frame.setVisible(true);
		///frame.pack();
	}
}