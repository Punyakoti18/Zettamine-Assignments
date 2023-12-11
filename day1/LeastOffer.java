package com.zettamine.java.day1;

public class LeastOffer {
private String name;
private int price;
private int dis;
LeastOffer(String name,int price,int dis)
{
	this.name=name;
	this.price=price;
	this.dis=dis;
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
public int getDis() {
	return dis;
}
public void setDis(int dis) {
	this.dis = dis;
}
@Override
public String toString() {
	return "[" + name + "," + price + "," + dis + "]";
}

}
