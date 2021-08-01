package javaproject1;

import java.util.*;

import javaproject.Spices;

public class BeautyandCare {
	ArrayList<Creams> ac1;
	ArrayList<Lotions> ac2;
	ArrayList<Makeup> ac3;
	ArrayList<Perfumes> ac4;
	ArrayList<Shampoo> ac5;
	public static void printMaps1(HashMap<Creams,String> map)
	{
		Set<Creams> keys= map.keySet();
		for(Creams k : keys)
		{
			System.out.println(k+"==>"+map.get(k));
		}
	}
	public static void printMaps2(HashMap<Lotions,String> map)
	{
		Set<Lotions> keys= map.keySet();
		for(Lotions k : keys)
		{
			System.out.println(k+"==>"+map.get(k));
		}
	}
	public static void printMaps3(HashMap<Makeup,String> map)
	{
		Set<Makeup> keys= map.keySet();
		for(Makeup k : keys)
		{
			System.out.println(k+"==>"+map.get(k));
		}
	}
	public static void printMaps4(HashMap<Perfumes,String> map)
	{
		Set<Perfumes> keys= map.keySet();
		for(Perfumes k : keys)
		{
			System.out.println(k+"==>"+map.get(k));
		}
	}
	public static void printMaps5(HashMap<Shampoo,String> map)
	{
		Set<Shampoo> keys= map.keySet();
		for(Shampoo k : keys)
		{
			System.out.println(k+"==>"+map.get(k));
		}
	}
public BeautyandCare()
{
	ac1=new ArrayList<Creams>();
	ac2=new ArrayList<Lotions>();
	ac3=new ArrayList<Makeup>();
    ac4=new ArrayList<Perfumes>();
	ac5=new ArrayList<Shampoo>();
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of itemCategories");
	int d=s.nextInt();
	for(int i=0;i<d;i++)
	{
	System.out.println("Enter choice");
	System.out.println("1-Creams\r\n"+"2-Lotions\r\n"+"3-Makeup\r\n"+"4-Perfumes\r\n"+"5-Shampoo\r\n");
	
	int n=s.nextInt();
	switch(n)
	{
	case 1:{
		Creams c1=new Creams(201,"Olay",20,300);
		Creams c2=new Creams(202,"Revlon",20,400);
		Creams c3=new Creams(203,"Lakme",20,500);
		Creams c4=new Creams(204,"LorealParis",20,400);
		HashMap<Creams,String> hm1=new HashMap<Creams,String>();
		hm1.put(c1,"Olay");
		hm1.put(c2,"Revlon");
		hm1.put(c3,"Lakme");
		hm1.put(c4,"LorealParis");
		printMaps1(hm1);
		System.out.println("enter product name");
		String y=s.next();
		Set<Creams> keys=hm1.keySet();
		for(Creams key:keys)
		{
			if(key.name.compareTo(y)==0)
			{
				System.out.println("Enter Quantity");
				int h=s.nextInt();
				key.quantity-=h;
        		key.price*=h;
        		System.out.println("Value of "+key+" is: "+hm1.get(key));
        		ac1.add(key);
				
			}
		}
	}break;
	case 2:{Lotions l1=new Lotions(205,"Nivea",20,80);
	Lotions l2=new Lotions (206,"Vaseline",20,200);
	Lotions l3=new Lotions (207,"BodyShop",20,500);
	Lotions  l4=new Lotions (208,"TreeHut",20,400);
	HashMap<Lotions,String> hm2=new HashMap<Lotions ,String>();
	hm2.put(l1,"Nivea");
	hm2.put(l2,"Vaseline");
	hm2.put(l3,"BodyShop");
	hm2.put(l4,"TreeHut");
	printMaps2(hm2);
	System.out.println("enter product name");
	String y=s.next();
	Set<Lotions> keys=hm2.keySet();
	for(Lotions key:keys)
	{
		if(key.name.compareTo(y)==0)
		{
			System.out.println("Enter Quantity");
			int h=s.nextInt();
			key.quantity-=h;
    		key.price*=h;
    		System.out.println("Value of "+key+" is: "+hm2.get(key));
    		ac2.add(key);
			
		}
	}
	}break;
	case 3:{
		Makeup m1=new Makeup (209,"Lakme",20,400);
		Makeup  m2=new Makeup  (210,"Mabelline",20,200);
		Makeup  m3=new Makeup  (211,"Eyetex",20,100);
		Makeup   m4=new Makeup  (212,"Loreal",20,400);
		HashMap<Makeup ,String> hm3=new HashMap<Makeup  ,String>();
		hm3.put(m1,"Lakme");
		hm3.put(m2,"Mabelline");
		hm3.put(m3,"Eyetex");
		hm3.put(m4,"Loreal");
		printMaps3(hm3);
		System.out.println("enter product name");
		String y=s.next();
		Set<Makeup> keys=hm3.keySet();
		for(Makeup key:keys)
		{
			if(key.name.compareTo(y)==0)
			{
				System.out.println("Enter Quantity");
				int h=s.nextInt();
				key.quantity-=h;
	    		key.price*=h;
	    		System.out.println("Value of "+key+" is: "+hm3.get(key));
	    		ac3.add(key);
				
			}
		}
		}break;
	case 4:{
		Perfumes f1=new Perfumes(213,"Spinz",20,100);
		Perfumes f2=new Perfumes(214,"Nivea",20,200);
		Perfumes f3=new Perfumes(215,"Denver",20,100);
		Perfumes f4=new Perfumes(216,"temptations",20,400);
		HashMap<Perfumes,String> hm4=new HashMap<Perfumes,String>();
		hm4.put(f1,"Spinz");
		hm4.put(f2,"Nivea");
		hm4.put(f3,"Denver");
		hm4.put(f4,"Temptations");
		printMaps4(hm4);
		System.out.println("enter product name");
		String y=s.next();
		Set<Perfumes> keys=hm4.keySet();
		for(Perfumes key:keys)
		{
			if(key.name.compareTo(y)==0)
			{
				System.out.println("Enter Quantity");
				int h=s.nextInt();
				key.quantity-=h;
	    		key.price*=h;
	    		System.out.println("Value of "+key+" is: "+hm4.get(key));
	    		ac4.add(key);
				
			}
		}
	}break;
	case 5:
	{
		Shampoo s1=new Shampoo(217,"Lakme",20,400);
		Shampoo s2=new Shampoo(218,"Treseme",20,400);
		Shampoo s3=new Shampoo(219,"Pantene",20,200);
		Shampoo s4=new Shampoo(220,"Head&Shoulders",20,200);
		HashMap<Shampoo,String> hm5=new HashMap<Shampoo,String>();
		hm5.put(s1,"Lakme");
		hm5.put(s2,"Treseme");
		hm5.put(s3,"Pantene");
		hm5.put(s4,"Head&Shoulders");
		printMaps5(hm5);
		System.out.println("enter product name");
		String y=s.next();
		Set<Shampoo> keys=hm5.keySet();
		for(Shampoo key:keys)
		{
			if(key.name.compareTo(y)==0)
			{
				System.out.println("Enter Quantity");
				int h=s.nextInt();
				key.quantity-=h;
	    		key.price*=h;
	    		System.out.println("Value of "+key+" is: "+hm5.get(key));
	    		ac5.add(key);
				
			}
		}
	}break;
	}
}
	
}

public ArrayList<Creams> getList() {
	// TODO Auto-generated method stub
	return ac1;
}
public ArrayList<Lotions> getList1() {
	// TODO Auto-generated method stub
	return ac2;
}
public ArrayList<Makeup> getList2() {
	// TODO Auto-generated method stub
	return ac3;
}
public ArrayList<Perfumes> getList3() {
	// TODO Auto-generated method stub
	return ac4;
}
public ArrayList<Shampoo> getList4() {
	// TODO Auto-generated method stub
	return ac5;
}
	
}
