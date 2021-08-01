package javaproject2;
import javaproject2.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaproject.*;
import javaproject1.*;
public class Main {
	static Food f;
	static BeautyandCare b;
	static Health h;
	static Stationary s;
	static int k=0;
	public static void main(String args[])
	{
	int n;
	int j=0;
	double a[]=new double[50];
	ArrayList<Food> arf=new ArrayList<Food>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of categories");
	int p=sc.nextInt();
	for(int i=0;i<p;i++)
	{
		System.out.println("1.Food"); 
		System.out.println("2.Beauty and Care");
		System.out.println("3.Health and hygiene");
		System.out.println("4.Stationary");
	System.out.println("Choose the respective category from which u want to buy-> ");
	n=sc.nextInt();
    switch(n)
    {case 1:
    {
		f=new Food();
		 ArrayList<Cereals> l=f.getList();
		    for(Cereals c:l)
		    {
		    	/*try {
	        		FileOutputStream fot=new FileOutputStream("‪D:\\programs\\Cereals.txt");
	        		ObjectOutputStream ou=new ObjectOutputStream(fot);
	        		ou.writeObject(c);
	        		ou.close();
	        		fot.close();
	        		}
	        	catch(Exception e)
	        	{
	        		System.out.println("error");
	        	}*/
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }
		    ArrayList<Dairy> le=f.getList1();
		    j=k;
		    for(Dairy c:le)
		    {
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }
		    ArrayList<FruitsVeges> l2=f.getList2();
		    j=k;
		    for(FruitsVeges c:l2)
		    {
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }
		    ArrayList<Snacks> l3=f.getList3();
		    j=k;
		    for(Snacks c:l3)
		    {
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }
		    ArrayList<Spices> l4=f.getList4();
		    j=k;
		    for(Spices c:l4)
		    {
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }
	   
	 }break;
    case 2:
    {
    	b=new BeautyandCare();
    	 ArrayList<Creams> l6=b.getList();
		    j=k;
		    for(Creams c:l6)
		    {
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }
		    ArrayList<Lotions> l7=b.getList1();
		    j=k;
		    for(Lotions c:l7)
		    {
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }
		    ArrayList<Perfumes> l9=b.getList3();
		    j=k;
		    for(Perfumes c:l9)
		    {
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }
		    ArrayList<Makeup> l8=b.getList2();
		    j=k;
		    for(Makeup c:l8)
		    {
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }
		    ArrayList<Shampoo> l10=b.getList4();
		    j=k;
		    for(Shampoo c:l10)
		    {
		    	a[j]+=c.price;
		    	System.out.println(a[j]);
		    	j++;
		    	k++;
		    }

    }break;
    case 3:
    {
    h=new Health();
    ArrayList<Soaps> al1= h.getList1();
       for(Soaps soo:al1)
       {
        a[j]+=soo.price;
        System.out.println(a[j]);
        j++;
        k++;
       }
       ArrayList<Detergents> al2= h.getList();
       j=k;
       for(Detergents dett:al2)
       {
        a[j]+=dett.price;
        System.out.println(a[j]);
        j++;
        k++;
       }
    break;
    }


    case 4:
    {
    s=new Stationary();
    ArrayList<Books> lo= s.getList2();
    j=k;
       for(Books boo:lo)
       {
        a[j]+=boo.price;
        System.out.println(a[j]);
        j++;
        k++;
       }
       ArrayList<Pens> lo1= s.getList3();
       j=k;
       
       for(Pens pen:lo1)
       {
       System.out.println("iterator");
        a[j]+=pen.price;
        System.out.println(a[j]);
        j++;
        k++;
       }
       ArrayList<ChartPaper> lo2= s.getList4();
       j=k;
       for(ChartPaper co:lo2)
       {
        a[j]+=co.price;
        System.out.println(a[j]);
        j++;
        k++;
       }
       ArrayList<Colorpapers> lo3= s.getList5();
       j=k;
       for(Colorpapers cop:lo3)
       {
        a[j]+=cop.price;
        System.out.println(a[j]);
        j++;
        k++;
       }
    break;
    }
    }
    
   
	}
	 int s=0;
	    for(int u=0;u<k;u++)
	    {
	    	s+=a[u];
	    }
	    System.out.println("Total bill:"+s);
    
    int no;
	System.out.println("Estimated cash to be paid is->"+ s);
	System.out.println("Do u want to pay through Cash or Card");
	System.out.println("1. Cash on delivery 2. Payment through Card");
	no=sc.nextInt();
	switch(no)
	{
	   case 1:{
	  System.out.println(" U chose to pay  Cash on delivery");
	  System.out.println("Estimated cash to be paid is->"+ s);
	  break;
	   }
	   case 2:
	   {
	  System.out.println(" U chose to pay through Card");
	  String sr=sc.next();
	  Pattern pat=Pattern.compile("[0-9]{12}");
	  Matcher mat=pat.matcher(sr);
	  boolean found;
	  found=mat.matches();
	  if(found)
	  {
	  System.out.println("Transaction has been completed successfully");
	  
	  }
	  else {
	  System.out.println(" The entered card number is invalid,Pls enter valid card Number");
	  sr=sc.next();
	  Pattern pa=Pattern.compile("[0-9]{12}");
	  Matcher m=pa.matcher(sr);
	  boolean second;
	  second=m.matches();
	  if(found)
	  {
	  System.out.println("Transaction has been completed successfully");
	  }
	  }
	  break;
	   }
}}}
