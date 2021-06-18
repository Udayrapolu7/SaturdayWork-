package com.sat.work;

public class AreaOfTriangle {
	public int h;
	public double b;
	public AreaOfTriangle (int h,double b)
	{
		this.h = h;
		this.b = b;
	}
	public double getArea()
	{
		return 0.5*b*h;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfTriangle a1 = new AreaOfTriangle(15,10.5);
		System.out.println("area of Traingle with height 15 and base 10.5 is :"+a1.getArea())	;
  
	}

}
