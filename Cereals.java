package javaproject;

public class Cereals {
	public int id;
	public String name;
	public double quantity;
	public double price;
	public Cereals(int id,String name,double quantity,double price)
	{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
	public String toString(){
        return "id: "+id+"  price: "+price;
}
	}