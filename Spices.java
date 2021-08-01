package javaproject;

public class Spices {
	public int id;
	public String name;
	public double quantity;
	public double price;
	public Spices(int id,String name,double quantity,double price)
	{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public String toString(){
        return "id: "+id+"  price: "+price;}
}
