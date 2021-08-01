package javaproject2;

import java.util.*;
class Books{
int id;
String name;
int pages;
int quantity;
public double price;
Books(int id,String name,int pages,int quantity,double price)
{
this.id=id;
this.name=name;
this.pages=pages;
this.quantity=quantity;
this.price=price;
}
public String toString()
{
return id+" "+price+" "+quantity+" "+pages;
}
}
class Pens{
int id;
String name;
int quantity;
public double price;
Pens(int id,String name,int quantity,double price)
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
class ChartPaper{
int id;
String name;
int quantity;
public double price;
ChartPaper(int id,String name,int quantity,double price)
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
class Colorpapers{
int id;
String name;
int quantity;
public double price;
Colorpapers(int id,String name,int quantity,double price)
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
public class Stationary {
public ArrayList<Books> lo;
public ArrayList<Pens> lo1;
public ArrayList<ChartPaper> lo2;
public ArrayList<Colorpapers> lo3;
public static void printMap1(HashMap<Books,String> map)
{
Set<Books>keys=map.keySet();
for(Books boo:keys)
{
System.out.println(boo+"->"+map.get(boo));
}}
public  static void printingMap1(HashMap<Pens,String> map)
{Set<Pens>keys=map.keySet();
for(Pens pen:keys)
{
System.out.println(pen+"->"+map.get(pen));
}
}
public static void printMap2(HashMap<ChartPaper,String> map)
{
Set<ChartPaper>keys=map.keySet();
for(ChartPaper cpr:keys)
{
System.out.println(cpr+"->"+map.get(cpr));
}}
public static void printingMap2(HashMap<Colorpapers,String> map)
{Set<Colorpapers>keys=map.keySet();
for(Colorpapers cppp:keys)
{
System.out.println(cppp+"->"+map.get(cppp));
}
}
public Stationary()
{
lo=new ArrayList<Books>();
lo1=new ArrayList<Pens>(); 
lo2=new ArrayList<ChartPaper>();
lo3=new ArrayList<Colorpapers>(); 
int n,g,l;
System.out.println("enter category");
System.out.println("1.Books"); 
System.out.println("2.Pens");
System.out.println("3.ChartPaper");
System.out.println("4.Colorpapers & Glue sticks");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
switch(n)
{
case 1:{
Books b1=new Books(100,"Classmate1",172,30,65);
Books b2=new Books(101,"Navneet1",200,20,100);
Books b3=new Books(102,"Classmate2",500,10,140);
Books b4=new Books(103,"Classmate3",240,15,80);
Books b5=new Books(104,"Classmate4",100,35,45);
HashMap<Books,String> book=new HashMap<Books,String>();
book.put(b1,"Classmate1");
book.put(b2,"Navneet1");
book.put(b3,"Classmate2");
book.put(b4,"Classmate3");
book.put(b5,"Classmate4");
printMap1(book);
System.out.println("Enter name");
Set<Books>keys=book.keySet();
String j=sc.next();
for(Books key: keys)
{
if(key.name.compareTo(j)==0)
{
	System.out.println("enter quantity");
int h=sc.nextInt();
key.quantity-=h;
key.price*=h;
System.out.println("Value of "+key.price);
lo.add(key);
}
}
break;
}
case 2:
{
Pens p1=new Pens(105,"Octane",60,10);
Pens p2=new Pens(106,"LincOcean",30,5);
Pens p3=new Pens(107,"Doms",100,3);
Pens p4=new Pens(108,"Pinpoint",50,10);
Pens p5=new Pens(109,"Butterflow",45,30);
Pens p6=new Pens(110,"Rainbow",60,15);
Pens p7=new Pens(111,"Renoylds",70,10);
HashMap<Pens,String> pen=new HashMap<Pens,String>();
pen.put(p1,"Octane");
pen.put(p2,"LincOcean");
pen.put(p3,"Doms");
pen.put(p4,"Pinpoint");
pen.put(p5,"Butterflow");
pen.put(p6,"Rainbow");
pen.put(p7,"Renoylds");
printingMap1(pen);
System.out.println("Enter name");
Set<Pens>keys=pen.keySet();
String j=sc.next();
for(Pens key: keys)
{
if(key.name.compareTo(j)==0)
{
	System.out.println("enter quantity");
int h=sc.nextInt();
key.quantity-=h;
key.price*=h;
System.out.println("Value of "+key.price);
lo1.add(key);
}
}
break;
}
case 3:
{
ChartPaper cp1=new ChartPaper(112,"White",60,10);
ChartPaper cp2=new ChartPaper(113,"Black",60,10);
ChartPaper cp3=new ChartPaper(114,"Yellow",50,5);
ChartPaper cp4=new ChartPaper(115,"Pink",10,5);
ChartPaper cp5=new ChartPaper(116,"Green",20,5);
ChartPaper cp6=new ChartPaper(117,"Blue",10,5);
HashMap<ChartPaper,String> obj2=new HashMap<ChartPaper,String>();
obj2.put(cp1,"White");
obj2.put(cp2,"Black");
obj2.put(cp3,"Yellow");
obj2.put(cp4,"Pink");
obj2.put(cp5,"Green");
obj2.put(cp6,"Blue");
printMap2(obj2);
System.out.println("Enter name");
Set<ChartPaper>keys=obj2.keySet();
String j=sc.next();
for(ChartPaper key: keys)
{
if(key.name.compareTo(j)==0)
{
	System.out.println("enter quantity");
int h=sc.nextInt();
key.quantity-=h;
key.price*=h;
System.out.println("Value of "+key.price);
lo2.add(key);
}
}
break;
}
case 4:
{
Colorpapers cpp1=new Colorpapers(118,"Fevistick",25,20);
Colorpapers cpp2=new Colorpapers(119,"Fevicol",20,25);
Colorpapers cpp3=new Colorpapers(120,"Magictape",30,30);
Colorpapers cpp4=new Colorpapers(121,"PictureCharts",80,3);
Colorpapers cpp5=new Colorpapers(122,"Graphsheets",100,1);
Colorpapers cpp6=new Colorpapers(122,"A4sizesheets",1000,1);
HashMap<Colorpapers,String> cps=new HashMap<Colorpapers,String>();
cps.put(cpp1,"Fevistick");
cps.put(cpp2,"Fevicol");
cps.put(cpp3,"Magictape");
cps.put(cpp4,"PictureCharts");
cps.put(cpp5,"Graphsheets");
cps.put(cpp6,"A4sizesheets"); 
printingMap2(cps);
System.out.println("Enter name");
Set<Colorpapers>keys=cps.keySet();
String j=sc.next();
for(Colorpapers key: keys)
{
if(key.name.compareTo(j)==0)
{
	System.out.println("enter quantity");
int h=sc.nextInt();
key.quantity-=h;
key.price*=h;
System.out.println("Value of "+key.price);
lo3.add(key);
}
}
break;
}
}
}
public ArrayList<Books> getList2() {
// TODO Auto-generated method stub
return lo;
}
public ArrayList<Pens> getList3() {
// TODO Auto-generated method stub
return lo1;
}
public ArrayList<ChartPaper> getList4() {
// TODO Auto-generated method stub
return lo2;
}
public ArrayList<Colorpapers> getList5() {
// TODO Auto-generated method stub
return lo3;
}

}
