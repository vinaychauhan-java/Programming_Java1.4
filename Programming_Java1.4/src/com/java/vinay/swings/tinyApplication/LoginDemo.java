package com.java.vinay.swings.tinyApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HomePage extends JFrame
{
	HomePage(String userName)
	{
		//setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Welcome "+userName);
		setSize(300, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);	
		JLabel label = new JLabel("Welcome : " + userName);
		Container container = getContentPane();
		container.add(label);
	}
}

class Login extends JFrame implements ActionListener
{

	JLabel label1, label2;
	final JTextField text1, text2;

	Login()
	{
		label1 = new JLabel();
		label1.setText("Username : ");
		text1 = new JTextField(15);

		label2 = new JLabel("Password : ");
		text2 = new JPasswordField(15);

		JButton submitButton = new JButton("Login");
		submitButton.addActionListener(this);
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0; //Specify the row and column at the upper left of the component
		constraints.gridy = 1; //Specify the row and column at the upper left of the component
		panel.add(label1,constraints);

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 1;
		panel.add(text1,constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(label2,constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 2;
		panel.add(text2,constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridwidth = 0;  
		constraints.gridy = 3;
		panel.add(submitButton,constraints);
		
		container.add(panel, BorderLayout.CENTER);
		setTitle("Login Form");

	}

	public void actionPerformed(ActionEvent ae)
	{
		String value1 = text1.getText();
		String value2 = text2.getText();
		if (value1.equals("vipin") && value2.equals("vipin"))
		{
			HomePage page = new HomePage(value1);
			setVisible(false);	
		}
		else
		{
			System.out.println("enter the valid username and password");
			JOptionPane.showMessageDialog(this, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}

class LoginDemo
{
	public static void main(String arg[])
	{
		try
		{
			Login loginObject = new Login();
			loginObject.setSize(300, 300);
			loginObject.setResizable(false);
			loginObject.setLocationRelativeTo(null);
			loginObject.setVisible(true);
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}