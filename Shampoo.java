package javaproject1;

public class Shampoo {
	int id;
	String name;
	double quantity;
	public double price;
	Shampoo(int id,String name,double quantity,double price)
	{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public String toString(){
        return "id: "+id+"  price: "+price;}
}
