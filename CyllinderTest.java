package com.company;
class Cyllinder
{
	//Properties
  private double radius;
	private double height;


  //Constructors
  public Cyllinder(double r, double h)
	{
		setRadius(r);
		setHeight(h);
	}
	public Cyllinder ()
	{
		radius = 1;
		height = 1;
	}
	public Cyllinder(int s)
	{
		setRadius(s);
		height = radius;
  }

 
  //Getter and Setter Methods
	public double getRadius()
	{
		return radius;
	}
	public double getHeight()
	{
		return height;
	}
	public void setRadius(double r)
	{
		if(r>0)
		{
			radius = r;
		}
		else
		{
			radius = 0;
		}
	}
	public void setHeight(double h)
	{
		if(h>0)
		height = h;
		else height = 0;
	}
	public double area()
	{
		return 2*Math.PI*radius*radius;
	}
	public double volume()
	{
		return Math.PI*radius*radius*height;
	}

}

//Main Method
public class CyllinderTest
{
	public static void main(String args[])
	{
		Cyllinder c = new Cyllinder(10);
		System.out.println("Area: "+c.area());
		System.out.println("Volume: "+ c.volume());
	}

}
