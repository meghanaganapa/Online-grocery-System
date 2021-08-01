package javaproject2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
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
public class Health {
public ArrayList<Soaps> al1;
public ArrayList<Detergents> al2;
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
public Health()
{
al1=new ArrayList<Soaps>();
al2=new ArrayList<Detergents>();
   int n,s = 0;
Scanner sc=new Scanner(System.in);
System.out.println("enter category");
System.out.println("1-Soaps\r\n"+"2-Detergents");
n=sc.nextInt();
switch(n)
{
case 1:{
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
System.out.println("Enter name");
Set<Soaps>keys=soap.keySet();
String j=sc.next();
for(Soaps key: keys)
{
if(key.name.compareTo(j)==0)
{
System.out.println("enter quantity");
int h=sc.nextInt();
key.quantity-=h;
key.price*=h;
System.out.println("Value of "+key.price);
al1.add(key);
}
}
break;
}
case 2:
{
Detergents d1=new Detergents(205,"SurfExcel",60,10);
Detergents d2=new Detergents(206,"Rim",30,5);
Detergents d3=new Detergents(207,"Harpic",100,3);
Detergents d4=new Detergents(208,"Prill",50,10);
Detergents d5=new Detergents(209,"Exo",45,30);
HashMap<Detergents,String> dom=new HashMap<Detergents,String>();
dom.put(d1,"SurfExcel");
dom.put(d2,"Rim");
dom.put(d3,"Harpic");
dom.put(d4,"Prill");
dom.put(d5,"Exo");
printingMap(dom);
System.out.println("Enter name");
Set<Detergents>keys=dom.keySet();
String j=sc.next();
for(Detergents key: keys)
{
if(key.name.compareTo(j)==0)
{
System.out.println("enter quantity");
int h=sc.nextInt();
key.quantity-=h;
key.price*=h;
System.out.println("Value of "+key.price);
al2.add(key);
}
}
break;
}
}
}
public ArrayList<Detergents> getList() {
// TODO Auto-generated method stub
return al2;
}
public ArrayList<Soaps> getList1() {
// TODO Auto-generated method stub
return al1;
}

}

