package javaproject1;

public class Lotions {
	int id;
	String name;
	double quantity;
	public double price;
	Lotions(int id,String name,double quantity,double price)
	{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	public String toString(){
        return "id: "+id+"  price: "+price;}
}
