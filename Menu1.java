package main;
import main.*;
import javaproject.*;
import javaproject.Cereals;
import javaproject.Snacks;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javaproject.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
public class Menu1 extends Food1 implements ActionListener { 
    // menubar 
JLabel l1;
JButton b;
JPanel p,p1;
public void paint(Graphics g) {  
    g.setColor(Color.green);  
    g.fillRect(30, 30, 100, 100);
   
  }  



    // main class 
    public static void main(String args[]) 
    { 
        // create an object of the class 
        Menu1 m = new Menu1(); 
        
       
      CardLayout card=new CardLayout();  // create a frame 
     JFrame f = new JFrame("Menu demo"); 
     f.setLayout(card);
     JPanel p=new JPanel();
        p.setSize(1000,1000);
        // create a label 
      JLabel  l = new JLabel("Task"); 
       JLabel l1 = new JLabel("              "); 
        p.setLayout(card);
        
        // create a object of JTextField with 16 columns 
       JTextField t = new JTextField(16); 
  
        // create a new button
       JButton b=new JButton("Welcome");
       JButton  e = new JButton("Search"); 
       

        
        f.setLayout(new GridLayout(0,1));       
		try {
			Image i = ImageIO.read(new File("C:\\Users\\meghana ganapa\\OneDrive\\Desktop\\flower.jpg"));
			b.setIcon(new ImageIcon(i));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    
        
        b.setSize(20,20);
        p.add(b);
        p.add(l1);
        p.add(t);
        p.add(e);
       
       JPanel p1=new JPanel(card);
       p1.setBounds(100,100,5200,5200);  
   
        b.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        		 
        	            l1.setText("Welcome to Online Supermarket");
        	            p1.add(k1);
        	           
        	        }  
        	    });  
        
        JPanel jp=new JPanel();

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
    	JButton bo=new JButton("Submit");
    	jp.add(bo);
    	jp.add(label3);
    	         bo.addActionListener(new ActionListener()
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
    	         k1.add(jp);
    	        
        f.add(p);
        f.add(p1);
        JPanel d1=new JPanel(card);
        d1.add(k2);
        d1.setBounds(1000,1000,5000,5000);
        f.add(d1);
        // add label 
        f.add(l);  
        f.setSize(500, 500); 
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		
	} 
	   
 
   
}