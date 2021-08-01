package javaproject;

import java.io.*;
import java.util.*;



public class Food implements Serializable{
	public ArrayList<Cereals> al1;
	public ArrayList<Dairy> al2;
	public ArrayList<Snacks> al3;
	public ArrayList<FruitsVeges> al4;
	public ArrayList<Spices> al5;
	public double s=0,g=0;
	 public static void printMap1(HashMap<Cereals, String> map){
         
	        Set<Cereals> keys = map.keySet();
	        for(Cereals p:keys){
	            System.out.println(p+"==>"+map.get(p));
	        }}
	 public static void printMap5(HashMap<Spices, String> map){
         
	        Set<Spices> keys = map.keySet();
	        for(Spices k:keys){
	            System.out.println(k+"==>"+map.get(k));
	        }}
	 public static void printMap4(HashMap<FruitsVeges, String> map){
         
	        Set<FruitsVeges> keys = map.keySet();
	        for(FruitsVeges k:keys){
	            System.out.println(k+"==>"+map.get(k));
	        }}
	 public static void printMap3(HashMap<Snacks, String> map){
         
	        Set<Snacks> keys = map.keySet();
	        for(Snacks k:keys){
	            System.out.println(k+"==>"+map.get(k));
	        }}
	 public static void printMap2(HashMap<Dairy, String> map){
         
	        Set<Dairy> keys = map.keySet();
	        for(Dairy k:keys){
	            System.out.println(k+"==>"+map.get(k));
	        }}
	 
	public Food()
{
	int n;
	al1=new ArrayList<Cereals>();
	al2=new ArrayList<Dairy>();
	al3=new ArrayList<Snacks>();
	al4=new ArrayList<FruitsVeges>();
	al5=new ArrayList<Spices>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of itemCategories");
	int x=sc.nextInt();
	for(int i=0;i<x;i++)
	{
	System.out.println("1-cereals\r\n"+"3-snacks\r\n" + 
			"2-dairy products\r\n"+
	        "4-fruits and veges\r\n"+"5-spices\r\n"
			);
	System.out.println("enter choice");
	n=sc.nextInt();
	
	switch(n)
	{
	case 1:
		{Cereals c1=new Cereals(1,"Rice",25,1750);
	       Cereals c2=new Cereals(2,"Dhal",25,100);
	       Cereals c3=new Cereals(3,"Wheat",25,80);
	       Cereals c4=new Cereals(4,"Ragi",25,70);
	       HashMap<Cereals,String> t1=new HashMap<Cereals,String>();
	       t1.put(c1,"Rice");
	       t1.put(c2,"Dhal");
	       t1.put(c3,"Wheat");
	       t1.put(c4,"Ragi");
	       printMap1(t1);
	      
	       String j=sc.next();
	       Set<Cereals> keys = t1.keySet();
	       System.out.println("enter quantity");
	        for(Cereals key: keys){
	        	if(key.name.compareTo(j)==0)
	        	{
	        		int h=sc.nextInt();
	        		key.quantity-=h;
	        		key.price*=h;
	        		System.out.println("Value of "+key+" is: "+t1.get(key));
	        		System.out.println("adding");
	        		al1.add(key);
	        	}
	        }
	       break;}
	case 2:{Dairy d1=new Dairy(5,"Milk",50,23);
	       Dairy d2=new Dairy(6,"Paneer",30,80);
	       Dairy d3=new Dairy(7,"Cheese",20,90);
       	   Dairy d4=new Dairy(8,"Butter",20,100);
       	HashMap<Dairy,String> t2=new HashMap<Dairy,String>();
	       t2.put(d1,"Milk");
	       t2.put(d2,"Paneer");
	       t2.put(d3,"Cheese");
	       t2.put(d4,"Butter");
	       printMap2(t2);
	       System.out.println("enter product name");
	       String j=sc.next();
	       Set<Dairy> keys = t2.keySet();
	       System.out.println("enter quantity");
	        for(Dairy key: keys){
	        	if(key.name.compareTo(j)==0)
	        	{
	        		int h=sc.nextInt();
	        		key.quantity-=h;
	        		key.price*=h;
	        		System.out.println("Value of "+key+" is: "+t2.get(key));	
	        		al2.add(key);
	        	}
	        }
       	   break;}
	case 3:{Snacks s1=new Snacks(9,"Kurkure",40,10);
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
	       System.out.println("enter product name");
	       String j=sc.next();
	       Set<Snacks> keys = t3.keySet();
	       System.out.println("enter quantity");
	        for(Snacks key: keys){
	        	if(key.name.compareTo(j)==0)
	        	{
	        		int h=sc.nextInt();
	        		key.quantity-=h;
	        		key.price*=h;
	        		System.out.println("Value of "+key+" is: "+t3.get(key));
	        		al3.add(key);
	        	}
	        }
	       break;}
	case 4:{FruitsVeges f1=new FruitsVeges(14,"Oranges",40,5);
           FruitsVeges f2=new FruitsVeges(15,"Ladysfinger",40,20);
	       FruitsVeges f3=new FruitsVeges(16,"Apples",40,10);
	       FruitsVeges f4=new FruitsVeges(17,"Tomatoes",50,40);
	       FruitsVeges f5=new FruitsVeges(18,"Onions",40,40);
	       FruitsVeges f6=new FruitsVeges(19,"Brinjal",40,30);
	       HashMap<FruitsVeges,String> t4=new HashMap<FruitsVeges,String>();
	       t4.put(f1,"Oranges");
	       t4.put(f2,"Ladysfinger");
	       t4.put(f3,"Apples");
	       t4.put(f4,"Tomatoes");
	       t4.put(f5,"Onions");
	       t4.put(f6,"Brinjal");
	       printMap4(t4);
	       System.out.println("enter product name");
	       String j=sc.next();
	       Set<FruitsVeges> keys = t4.keySet();
	       System.out.println("enter quantity");
	        for(FruitsVeges key: keys){
	        	if(key.name.compareTo(j)==0)
	        	{
	        		int h=sc.nextInt();
	        		key.quantity-=h;
	        		key.price*=h;
	        		System.out.println("Value of "+key+" is: "+t4.get(key));
	        		al4.add(key);
	        	}
	        }
	        break;}

	case 5:{Spices p1=new Spices(20,"Tumeric",20,10);
	       Spices p2=new Spices(20,"Chillipowder",30,30);
	       Spices p3=new Spices(20,"Masala",40,10);
	       Spices p4=new Spices(20,"Cloves",20,10);
	       Spices p5=new Spices(20,"Jeera",20,10);
	       Spices p6=new Spices(20,"Daniya",20,10);
	       HashMap<Spices,String> t5=new HashMap<Spices,String>();
	       t5.put(p1,"Tumeric");
	       t5.put(p2,"Chillipowder");
	       t5.put(p3,"Masala");
	       t5.put(p4,"Cloves");
	       t5.put(p5,"Jeera");
	       t5.put(p6,"Daniya");
	       printMap5(t5);
	       System.out.println("enter product name");
	       String j=sc.next();
	       Set<Spices> keys = t5.keySet();
	       System.out.println("enter quantity");
	        for(Spices key: keys){
	        	if(key.name.compareTo(j)==0)
	        	{
	        		int h=sc.nextInt();
	        		key.quantity-=h;
	        		key.price*=h;
	        		System.out.println("Value of "+key+" is: "+t5.get(key));
	        		al5.add(key);
	        		
	        	}
	        }
	       break;       }}
		
	}
}
	public ArrayList<Cereals> getList() {
		// TODO Auto-generated method stub
		return al1;
	}
	public ArrayList<Dairy> getList1() {
		// TODO Auto-generated method stub
		return al2;
	}
	public ArrayList<FruitsVeges> getList2() {
		// TODO Auto-generated method stub
		return al4;
	}
	public ArrayList<Snacks> getList3() {
		// TODO Auto-generated method stub
		return al3;
	}
	public ArrayList<Spices> getList4() {
		// TODO Auto-generated method stub
		return al5;
	}
	

}

