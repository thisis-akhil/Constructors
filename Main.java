package com.company;
class Product
{
	String itemno;
	String name;
	double price;
	short qty;

	//Constructors
	public Product(String itemNo)
	{
		itemno = itemNo;
	}
	public Product(String itemNo, String name)
	{
		itemno = itemNo;
		this.name = name;
	}
	public Product(String itemNo, String name, double price, short qty)
	{
		itemno = itemNo;
		this.name = name;
		setPrice(price);
		setQty(qty);
	}

	//getter Method
	public String getItemno()
	{
		return itemno;
	}
	public String getName(){return name;}
	public double getPrice(){return price;}
	public short getQty(){return qty;}

	//setter method
	public void setPrice(double p)
	{
	price = p;
	}
	public void setQty(short q)
	{
		qty = q;
	}
	public void details()
	{
		System.out.println("ItemNo: "+itemno+"\n"+ "Name: "+name+"\n"+ "Price: "+price+"\n"+ "Quantity in kgs: "+qty+"\n");
	}

}
public class Main
{
	public static void main(String args[])
	{
		Product pro = new Product("AA-9810", "Shackle Bolt");
		pro.setPrice(1000);
		pro.setQty((short) 150);
		pro.details();
	}

}
