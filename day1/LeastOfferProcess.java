package com.zettamine.java.day1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class LeastOfferProcess{
	private String name;
	private int price;
	LeastOfferProcess(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	


@Override
	public String toString() {
		return "LeastOfferProcess [name=" + name + ", price=" + price + "]";
	}




static Scanner scan =new Scanner(System.in);



public static int disCal(int price,int discount)
{
	int price1=price;
	float disco=discount;
	int result=(int)((disco/100)*price);
	
	return result;
	
}

	public static void main(String[] args) {
		
     LeastOffer off;
		
		String name;
		int price;
		int dis;
		
	System.out.print("Enter the Number of Items : ");
	int n=	scan.nextInt();
	int i=0;
	
	List<LeastOffer> prodList=new ArrayList<>();
	
	while(i<n)
	{
		System.out.print("Enter the product naame :  ");
		name=scan.next();
		
		System.out.print("Enter the price :  ");
		price=scan.nextInt();
		
		System.out.print("Enter the discount : ");
		dis=scan.nextInt();
		
		prodList.add(new LeastOffer(name,price,dis));
		System.out.println();
		i++;
		
	}
	LeastOfferProcess LOP;
	
	List<LeastOfferProcess> proPric=new ArrayList<>();
	
			
	
	for (LeastOffer lp : prodList) 
	{
		String nm=lp.getName();
		int pric=lp.getPrice();
		int disc=lp.getDis();
		int res=disCal(pric,disc);
		proPric.add(new LeastOfferProcess(nm,res));
		
	}
	proPric.sort(new MyComp());
	
	    System.out.println("Items with Minimum Discount: ");
			for (LeastOfferProcess Lop : proPric) 
			{
			
				System.out.println(Lop.getName()+" ---> "+Lop.getPrice());
			}
	
			
	}
}

class MyComp implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
		LeastOfferProcess lop1=(LeastOfferProcess)o1;
		LeastOfferProcess lop2=(LeastOfferProcess)o2;
		int i1=lop1.getPrice();
		int i2=lop2.getPrice();
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return 1;
					
		return 0;
	}
	
}

