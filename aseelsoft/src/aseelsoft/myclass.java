package aseelsoft;

import java.util.ArrayList;

public class myclass {

	public	ArrayList books = new ArrayList();
	public int count=0;
	private int price=0;

	



public void addbook(int price, String name) {
	// TODO Auto-generated method stub
	
	if (books.contains(""+name+","+price)) {
		
		
	}
	else {
		books.add(""+name+","+price);
		this.count=count+1;
	this.price+=price;
	
	}
}

public int getcount()
{
	return this.count;
}

public int getprice()
{
	return this.price;
}






}
