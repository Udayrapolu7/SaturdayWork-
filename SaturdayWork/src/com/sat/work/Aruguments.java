package com.sat.work;

public class Aruguments {
	public void add(int i,int j)
	{
		int sum = i+j;
		System.out.println("the sum of two numbers "+i+" and "+j+" is :"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aruguments ar = new Aruguments();
		ar.add(12, 12);
		ar.add(24, 120);
		ar.add(50,50);

	}

}
