package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class Payment  extends JFrame implements ActionListener{
	//static JPasswordField p;
	static TextField t;
	JPanel jp;
	Payment()
	{
	
	jp=new JPanel();
	jp.setBounds(30,30,12,12);
	
	
	
	TextField tfa=new TextField(10);
	JLabel label1=new JLabel("Enter card number:");
	//label1.setLocation(300,30);
	JLabel label2=new JLabel(" Enter Password");
	//label2.setLocation(100,200);
	TextField tfa1=new TextField(10);
	JLabel label3=new JLabel("Pay now");
	JLabel label4=new JLabel("Transaction has been completed successfully");
	JLabel label5=new JLabel(" The entered card number is invalid,Pls enter valid card Number");
	jp.add(label1);
	jp.add(tfa);
	jp.add(label2);
	jp.add(tfa1);
	JButton b1=new JButton("Submit");
	jp.add(b1);
	jp.add(label3);
	         b1.addActionListener(new ActionListener()
	        {public void actionPerformed(ActionEvent e) {
	            
	        label3.setText(" U chose to pay through Card");
	        Pattern pat=Pattern.compile("[0-9]{12}");
	        String str1=tfa.getText();
	        Matcher mat=pat.matcher(str1);
	        boolean found;
	        found=mat.matches();
	        if(found)
	        {
	         jp.add(label4);
	        }
	        else {
	       jp.add(label5);
	        str1=tfa.getText();
	        Pattern p=Pattern.compile("[0-9]{12}");
	        Matcher m=p.matcher(str1);
	        boolean second;
	        second=m.matches();
	        if(found)
	        {
	        jp.add(label4);
	        }
	        }
	        }});


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}}