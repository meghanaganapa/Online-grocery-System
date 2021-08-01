package main;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

import javaproject.Cereals;
import javaproject.Snacks;

import javaproject2.MarqueePanel;



public class Food1 {
	static JPanel k1,k2,g1,g2,g21;
	JButton b1;
	static int k=0;
	JButton b3;
	public  ArrayList<Cereals> al1;

	static JButton bo;
	JButton bo1;
	JButton bo2;
	public ArrayList<Soaps> al;
	public ArrayList<Detergents> al2;
	public ArrayList<Snacks> al3;

		public double s=0;
	public static double g=0;
	class Soaps{
		int id;
		String name;
		int pages;
		int quantity;
		public double price;
		Soaps(int id,String name,int quantity,double price)
		{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		}
		public String toString()
		{
		return id+" "+price+" "+quantity;
		}
		}
		class Detergents{
		int id;
		String name;
		int quantity;
		public double price;
		Detergents(int id,String name,int quantity,double price)
		{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		}
		public String toString()
		{
		return id+" "+price+" "+quantity;
		}
		}
		
		public static void printMap(HashMap<Soaps,String> map)
		{
		Set<Soaps>keys=map.keySet();
		for(Soaps soa:keys)
		{
		System.out.println(soa+"->"+map.get(soa));
		}}
		public  static void printingMap(HashMap<Detergents,String> map)
		{Set<Detergents>keys=map.keySet();
		for(Detergents det:keys)
		{
		System.out.println(det+"->"+map.get(det));
		}
		}
	 public static void printMap1(HashMap<Cereals, String> map){
         
	        Set<Cereals> keys = map.keySet();
	        for(Cereals p:keys){
	            System.out.println(p+"==>"+map.get(p));
	        }}
	
	 public static void printMap3(HashMap<Snacks, String> map){
         
	        Set<Snacks> keys = map.keySet();
	        for(Snacks k:keys){
	            System.out.println(k+"==>"+map.get(k));
	        }}
	
	
	 public void f()
		{
			 String s = "1-Rice==>1750 \r\n "
		    	        + "2-Dhal==>100 \r\n "
		    	        + "3-Wheat==>80 \r\n"
		    	        + "4-Ragi==>70\r\n";
		    	        
		    	        MarqueePanel mp = new MarqueePanel(s,16);
		    	        mp.start();
		    	        k1.add(mp);
		}
	 public void f1()
		{
			 String s = "9-Kurkure==>10 \r\n"+
		       "10-Lays==>10 \r\n"+
		       "11-Cococola==>20 \r\n"+
		       "12-Chocolates==>20 \r\n"+
		       "13-Biscuits==>10 \r\n";
		    	        
		    	        MarqueePanel mp = new MarqueePanel(s,16);
		    	        mp.start();
		    	        k1.add(mp);
		}
	 public void f2()
		{
		 String s = "1-Pears==>65\r\n "
			        + "2-Dettol==>100\r\n "
			        + "3-Santoor==>140 \r\n"
			        + "4-Rexona==>80\r\n"+"5-Garniger==>45 \r\n";
			       
			        MarqueePanel mp = new MarqueePanel(s,16);
			         mp.start();
			        k2.add(mp);
		}
	 public void f3()
		{
		 String s = "1-SurfExcel==>10\r\n "
			        + "2-Rin==>5\r\n "
			        + "3-Harpic==>3 \r\n"
			        + "4-Prill==>10\r\n"+"5-Exo==>30 \r\n";
			       
			        MarqueePanel mp = new MarqueePanel(s,16);
			         mp.start();
		    	        k2.add(mp);
		}
	 
	  	    
	public Food1()
{
	int n;
	int j=0;
	double v8=0;
	double v1=0;
	double v2=0;
	double v3=0;
	double v4=0;
	double v5=0;
	double v6=0;
	double v7 = 0;
	double a[]=new double[10];
	al1=new ArrayList<Cereals>();
	al3=new ArrayList<Snacks>();
	
    k1=new JPanel(new GridLayout(5,1));
    k1.setBounds(1000,1000,5000,5000);
	JButton b3=new JButton("Snacks");  
    b3.setBounds(5000,5000,95,30);  
    k1.add(b3);  
    JButton b1=new JButton("Cereals");  
    b1.setBounds(200,200,95,30);  
    k1.add(b1);  
  
    JButton b6=new JButton("Submit1");
    b6.setBounds(300,300,95,30);
    JButton b7=new JButton("Submit2");
    b7.setBounds(400,400,95,30);
    JTextField v=new JTextField("");
    Graphics g=null ;
    Scanner sc=new Scanner(System.in);
    b1.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
    		Cereals c1=new Cereals(1,"Rice",25,1750);
 	       Cereals c2=new Cereals(2,"Dhal",25,100);
 	       Cereals c3=new Cereals(3,"Wheat",25,80);
 	       Cereals c4=new Cereals(4,"Ragi",25,70);
 	       HashMap<Cereals,String> t1=new HashMap<Cereals,String>();
 	       t1.put(c1,"Rice");
 	       t1.put(c2,"Dhal");
 	       t1.put(c3,"Wheat");
 	       t1.put(c4,"Ragi");
 	       printMap1(t1);
 	       
 	        g1=new JPanel(new FlowLayout(FlowLayout.CENTER));
 	         
 	    	      
 	    	       
 	       JLabel j1=new JLabel("Rice");
 	      JLabel j2=new JLabel("Wheat");
 	     JLabel j3=new JLabel("Ragi");
 	    JLabel j4=new JLabel("Dhal"); 	      
 	    JTextField tf1=new JTextField(10);
 	   JTextField tf2=new JTextField(10);
 	   JTextField tf3=new JTextField(10);
 	  JTextField tf4=new JTextField(10); 
 
 	  g1.add(j1);
  	 g1.add(tf1);
 	 g1.add(j2);
 	 g1.add(tf2);
 	 g1.add(j3);
 	 g1.add(tf3);
 	 g1.add(j4);
 	 g1.add(tf4);
 	   g1.add(b6);
 	   g1.add(v);
 	  g1.setBounds(500,500,1200,1200);  
      k1.add(g1);
      EventQueue.invokeLater(new Runnable() {

          @Override
          public void run() {
          	f(); 
          }
      });
      b6.addActionListener(new ActionListener() {

    		@Override
    		public void actionPerformed(ActionEvent e) {
    	      int h1=Integer.parseInt(tf1.getText());
    			int h2=Integer.parseInt(tf2.getText());
    			int h3=Integer.parseInt(tf3.getText());
    			int h4=Integer.parseInt(tf4.getText());
    		
 	       String j=sc.next();
 	       Set<Cereals> keys = t1.keySet();
 	       System.out.println("enter quantity");
 	        for(Cereals key: keys){
 	        	if(key.name.compareTo(j)==0)
 	        	{
 	        		if(h1>0)
	 	        	{
                   
	 	        		key.quantity-=h1;
	 	        		key.price*=h1;
	 	        		double v1=key.price;
	 	        		System.out.println(key.price);
	 	        		String str = String.valueOf(key.price); 
	 	                v.setText(str); 
	 	        	  System.out.println("Value of "+key+" is: "+t1.get(key));
	 	        		
	 	        		al1.add(key);
	 	        	}
 	        		else if(h2>0)
 	        		{

	 	        		key.quantity-=h2;
	 	        		key.price*=h2;
	 	        		double v2=key.price;
	 	        		System.out.println(key.price);
	 	        		String str = String.valueOf(key.price); 
	 	                v.setText(str); 
 	        		   System.out.println("Value of "+key+" is: "+t1.get(key));
	 	        		
	 	        		al1.add(key);
 	        		}
 	        		else if(h3>0)
 	        		{

	 	        		key.quantity-=h3;
	 	        		key.price*=h3;
	 	        		double v3=key.price;
	 	        		System.out.println(key.price);
	 	        		String str = String.valueOf(key.price); 
 	        		  v.setText(str);
 	        		 System.out.println("Value of "+key+" is: "+t1.get(key));
	 	        		
	 	        		al1.add(key);
 	        		}    
 	        		
 	        		else if(h4>0)
 	        		{

	 	        		key.quantity-=h4;
	 	        		key.price*=h4;
	 	        		double v4=key.price;
	 	        		System.out.println(key.price);
	 	        		String str = String.valueOf(key.price); 
	 	                v.setText(str);
	 	               System.out.println("Value of "+key+" is: "+t1.get(key));
	 	        		al1.add(key);
 	        		}
 	        
 	        	
 	        	}
 	        }
 	       JTextField q=new JTextField(5);
 	      String b=v.getText();
 	      q.setText(b);
 	      k1.add(q);
    	        }});
     }});  
    	   
  
   b3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		Snacks s1=new Snacks(9,"Kurkure",40,10);
	       Snacks s2=new Snacks(10,"Lays",40,10);
	       Snacks s3=new Snacks(11,"Cococola",20,20);
	       Snacks s4=new Snacks(12,"Chocolates",100,20);
	       Snacks s5=new Snacks(13,"Biscuits",30,10);
	       HashMap<Snacks,String> t3=new HashMap<Snacks,String>();
	       t3.put(s1,"Kurkure");
	       t3.put(s2,"Lays");
	       t3.put(s3,"Cococola");
	       t3.put(s4,"Chocolates");
	       t3.put(s5,"Biscuits");
	       printMap3(t3);
	       g2=new JPanel(new FlowLayout(FlowLayout.CENTER));
 	       JLabel j5=new JLabel("Kurkure");
 	      JLabel j6=new JLabel("Lays");
 	     JLabel j7=new JLabel("Cococola");
 	    JLabel j8=new JLabel("Chocolates"); 	    
 	    JLabel j9=new JLabel("Biscuits");
 	    JTextField tf5=new JTextField(10);
 	   JTextField tf6=new JTextField(10);
 	   JTextField tf7=new JTextField(10);
 	  JTextField tf8=new JTextField(10); 
 	  JTextField tf9=new JTextField(10);
 	
 	  g2.add(j5);
  	 g2.add(tf5);
 	 g2.add(j6);
 	 g2.add(tf6);
 	 g2.add(j7);
 	 g2.add(tf7);
 	 g2.add(j8);
 	 g2.add(tf8);
 	 g2.add(j9);
 	 g2.add(tf9);
 	   g2.add(b7);
 	   g2.add(v);
 	  g2.setBounds(500,500,1200,1200);  
      k1.add(g2);
      EventQueue.invokeLater(new Runnable() {

          @Override
          public void run() {
          	f1(); 
          }
      });
      b7.addActionListener(new ActionListener() {

    		@Override
    		public void actionPerformed(ActionEvent e) {
    	      int h1=Integer.parseInt(tf5.getText());
    	      int h2=Integer.parseInt(tf6.getText());
  			int h3=Integer.parseInt(tf7.getText());
  			int h4=Integer.parseInt(tf8.getText());
  		
 	       String j=sc.next();
 	       Set<Snacks> keys = t3.keySet();
 	       System.out.println("enter quantity");
 	        for(Snacks key: keys){
 	        	if(key.name.compareTo(j)==0)
 	        	{
 	        		if(h1>0)
	 	        	{

	 	        		key.quantity-=h1;
	 	        		key.price*=h1;
	 	        		double v5=key.price;
	 	        		System.out.println(key.price);
	 	        		String str = String.valueOf(key.price); 
	 	                v.setText(str);
	 	                System.out.println("");	
	 	        		System.out.println("Value of "+key+" is: "+t3.get(key));
	 	        		al3.add(key);
	 	        	
                   }
 	        		else if(h2>0)
 	        		{

	 	        		key.quantity-=h2;
	 	        		key.price*=h2;
	 	        		double v6=key.price;
	 	        		System.out.println(key.price);
	 	        		String str = String.valueOf(key.price); 
	 	                v.setText(str);
	 	                System.out.println("Value of "+key+" is: "+t3.get(key));
	 	        		al3.add(key);
	 	           
 	        		}
 	      
 	        		else if(h3>0)
 	        		{ 

	 	        		key.quantity-=h3;
	 	        		key.price*=h3;
	 	        		double v7=key.price;
	 	        		System.out.println(key.price);
	 	        		String str = String.valueOf(key.price); 
	 	                v.setText(str);
	 	                System.out.println("Value of "+key+" is: "+t3.get(key));
	 	        		al3.add(key);
	 	              
 	        		}
 	  
 	        		else if(h4>0)
 	        		{

	 	        		key.quantity-=h4;
	 	        		key.price*=h4;
	 	        	    double v8=key.price;
	 	        		System.out.println(key.price);
	 	        		String str = String.valueOf(key.price); 
	 	                v.setText(str);
	 	                System.out.println("Value of "+key+" is: "+t3.get(key));
	 	 	            al3.add(key);
	 
 	        		}}}
 	       JTextField q=new JTextField(5);
 	      String b=v.getText();
 	      q.setText(b);
 	      k1.add(q);
	}} );
      
   }});
   al=new ArrayList<Soaps>();
   al2=new ArrayList<Detergents>();
   k2=new JPanel(new GridLayout(2,1));
   JButton bo=new JButton("Soaps");
   bo.setBounds(5000,5000,95,30);
   k2.add(bo);
   JButton bo1=new JButton("Detrgents");
   bo1.setBounds(5000,5000,95,30);
   k2.add(bo1);
 
   JButton bo2=new JButton("Submit3");
   JButton bo3=new JButton("Submit4");
      
  
   bo.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e){ 

   Soaps s1=new Soaps(200,"Pears",30,65);
   Soaps s2=new Soaps(201,"Dettol",20,100);
   Soaps s3=new Soaps(202,"Santoor",10,140);
   Soaps s4=new Soaps(203,"Rexona",15,80);
   Soaps s5=new Soaps(204,"Garniger",35,45);
   HashMap<Soaps,String> soap=new HashMap<Soaps,String>();
   soap.put(s1,"Pears");
   soap.put(s2,"Dettol");
   soap.put(s3,"Santoor");
   soap.put(s4,"Rexona");
   soap.put(s5,"Garniger");
   printMap(soap);
   g21=new JPanel(new FlowLayout(FlowLayout.CENTER));

  
   //String j=sc.next();
   JLabel x1=new JLabel("Pears");
   JLabel x2=new JLabel("Dettol");
   JLabel x3=new JLabel("Santoor");
   JLabel x4=new JLabel("Rexona");
   JLabel x5=new JLabel("Garniger");
   JTextField ta1=new JTextField(10);
   JTextField ta2=new JTextField(10);
   JTextField ta3=new JTextField(10);
   JTextField ta4=new JTextField(10);
   JTextField ta5=new JTextField(10);
   JTextField v1=new JTextField(5);
   g21.add(x1);
   g21.add(ta1);
   g21.add(x2);
   g21.add(ta2);
   g21.add(x3);
   g21.add(ta3);
   g21.add(x4);
   g21.add(ta4);
   g21.add(x5);
   g21.add(ta5);
  
   g21.add(bo2);
   g21.add(v1);
   k2.add(g21);
   
   EventQueue.invokeLater(new Runnable() {

       @Override
       public void run() {
       	f2(); 
       }
   });
   bo2.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
   
   int fg1=Integer.parseInt(ta1.getText());
   int fg2=Integer.parseInt(ta2.getText());
   int fg3=Integer.parseInt(ta3.getText());
   int fg4=Integer.parseInt(ta4.getText());
   int fg5=Integer.parseInt(ta5.getText());
   String j=sc.next();
   
   Set<Soaps>keys=soap.keySet();
   System.out.println("Enter quantity");
   for(Soaps key: keys)
   {
   if(key.name.compareTo(j)==0)
   {
   if(fg1>0)
   {key.quantity-=fg1;
   key.price*=fg1;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v1.setText(str);
   System.out.println("Value of "+key.price);
   al.add(key);
   }
   else if(fg2>0)
   {key.quantity-=fg2;
   key.price*=fg2;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v1.setText(str);
   System.out.println("Value of "+key.price);
   al.add(key);
   }
   else if(fg3>0)
   {key.quantity-=fg3;
   key.price*=fg3;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v1.setText(str);
   System.out.println("Value of "+key.price);
   al.add(key);
   }
   else if(fg4>0)
   {key.quantity-=fg4;
   key.price*=fg4;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v1.setText(str);
   System.out.println("Value of "+key.price);
   al.add(key);
   }
   else if(fg5>0)
   {key.quantity-=fg5;
   key.price*=fg5;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v1.setText(str);
   System.out.println("Value of "+key.price);
   al.add(key);
   }
   }
   }
   }});
}});
   bo1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
   Detergents d1=new Detergents(205,"SurfExcel",60,10);
   Detergents d2=new Detergents(206,"Rin",30,5);
   Detergents d3=new Detergents(207,"Harpic",100,3);
   Detergents d4=new Detergents(208,"Prill",50,10);
   Detergents d5=new Detergents(209,"Exo",45,30);
   HashMap<Detergents,String> dom=new HashMap<Detergents,String>();
   dom.put(d1,"SurfExcel");
   dom.put(d2,"Rin");
   dom.put(d3,"Harpic");
   dom.put(d4,"Prill");
   dom.put(d5,"Exo");
   printingMap(dom);
   JPanel g3=new JPanel(new FlowLayout(FlowLayout.CENTER));
   JLabel x6=new JLabel("SurfExcel");
   JLabel x7=new JLabel("Rin");
   JLabel x8=new JLabel("Harpic");
   JLabel x9=new JLabel("Prill");
   JLabel x10=new JLabel("Exo");
   JTextField ta6=new JTextField(10);
   JTextField ta7=new JTextField(10);
   JTextField ta8=new JTextField(10);
   JTextField ta9=new JTextField(10);
   JTextField ta10=new JTextField(10);
   JTextField v2=new JTextField(5);
   g3.add(x6);
   g3.add(ta6);
   g3.add(x7);
   g3.add(ta7);
   g3.add(x8);
   g3.add(ta8);
   g3.add(x9);
   g3.add(ta9);
   g3.add(x10);
   g3.add(ta10);
   
   g3.add(bo3);
   g3.add(v2);
   k2.add(g3);
   g3.setBounds(500,500,1200,1200);
   EventQueue.invokeLater(new Runnable() {

       @Override
       public void run() {
       	f3(); 
       }
   });
   bo3.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {

   int l1=Integer.parseInt(ta6.getText());
   int l2=Integer.parseInt(ta7.getText());
   int l3=Integer.parseInt(ta8.getText());
   int l4=Integer.parseInt(ta9.getText());
   int l5=Integer.parseInt(ta10.getText());
   String j=sc.next();
   Set<Detergents>keys=dom.keySet();
   System.out.println("enter quantity");
   for(Detergents key: keys)
   {
   if(key.name.compareTo(j)==0)
   {
        if(l1>0)
   {key.quantity-=l1;
   key.price*=l1;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v2.setText(str);
   System.out.println("Value of "+key.price);
   al2.add(key);

   }
         if(l2>0)
   {key.quantity-=l2;
   key.price*=l2;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v2.setText(str);
   System.out.println("Value of "+key.price);
   al2.add(key);
   }
         if(l3>0)
   {key.quantity-=l3;
   key.price*=l3;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v2.setText(str);
   System.out.println("Value of "+key.price);
   al2.add(key);
   }
         if(l4>0)
   {key.quantity-=l4;
   key.price*=l4;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v2.setText(str);
   System.out.println("Value of "+key.price);
   al2.add(key);
   }
         if(l5>0)
   {key.quantity-=l5;
   key.price*=l5;
   System.out.println(key.price);
	String str = String.valueOf(key.price); 
    v.setText(str);
   System.out.println("Value of "+key.price);
   al2.add(key);
   }
   }
   }
   
   }});
   }});

  

}
	public ArrayList<Cereals> getList8() {
		// TODO Auto-generated method stub
		return al1;
	}
	
	public  ArrayList<Snacks> getList9() {
		// TODO Auto-generated method stub
		return al3;
	}
	
	public ArrayList<Detergents> getList() {
		// TODO Auto-generated method stub
		return al2;
		}
		public ArrayList<Soaps> getList1() {
		// TODO Auto-generated method stub
		return al;
		}
		

}


