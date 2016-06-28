package com.java.vinay.swings;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyExample_JCombo1
{

	JComboBox comboBox;
	JTextField txtField;

	public static void main(String[] args)
	{
		MyExample_JCombo1 object = new MyExample_JCombo1();
		JFrame frame = new JFrame("Creating a JComboBox Component");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(object.invokeComboBoxComponent(panel));
		frame.setSize(400, 400);
		frame.setVisible(true);

	}

	public JPanel invokeComboBoxComponent(JPanel panel)
	{
		String course[] =
		{"BCA", "MCA", "PPC", "CIC"};
		comboBox = new JComboBox(course);
		comboBox.setBackground(Color.GRAY);
		comboBox.setForeground(Color.YELLOW);
		txtField = new JTextField(10);
		panel.add(comboBox);
		panel.add(txtField);
		comboBox.addItemListener(new ItemListener()
		{

			public void itemStateChanged(ItemEvent ie)
			{
				String str = (String)comboBox.getSelectedItem();
				txtField.setText(str);
			}
		});
		return panel;
	}

}
