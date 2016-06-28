package com.java.vinay.swings;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MyExample_JTable2_InsertRow extends JFrame
{

	public static void main(String[] args)
	{
		MyExample_JTable2_InsertRow obj = new MyExample_JTable2_InsertRow();
		obj.setLayout(new BorderLayout(20,20));
		
		String data[][] = {{"Priya","100"},
		                   {"Vinay","200"},
		                   {"Swastik","300"}};
		String col[] = {"Name","E-Code"};
		DefaultTableModel tableModel = new DefaultTableModel(data,col);
		JTable table = new JTable(tableModel);
		JPanel panel = new JPanel();

		//Insert first position
		tableModel.insertRow(0,new Object[]{"Vipin","400"});
		//Insert 4 position
		tableModel.insertRow(3,new Object[]{"Sachin","500"});
		//Insert last position
		tableModel.insertRow(table.getRowCount(),new Object[]{"Haahaa","600"});
		//tableModel.removeRow(0);
		//tableModel.removeRow(table.getRowCount()-1);
		
		panel.add(table,BorderLayout.CENTER);
		obj.add(panel);
		obj.setSize(300,300); // resize the window to be 300px wide and 200px tall
		obj.setTitle("My JTable with DefaultTableModel Example"); // set the title of the window
		obj.setLocationRelativeTo(null); // will center the window on the screen
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE); // will close the window, if we click on the close button of the titlebar. By default nothing happens.
		obj.setVisible(true);
	}
}
