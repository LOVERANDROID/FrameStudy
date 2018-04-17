package com.symbio.inspirus.weber.observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductList productList = ProductList.getInstance();
		TBObserver tbObserver = new TBObserver();
		JDObserver jdObserver = new JDObserver();
		productList.addObserver(jdObserver);
		productList.addObserver(tbObserver);
		productList.addProduct("ÐÂ²úÆ·1");
	}

}
