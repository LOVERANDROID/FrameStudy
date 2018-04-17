package com.symbio.inspirus.weber.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable{
	private List<String> productlist = null;
	private static ProductList instance; 
	private ProductList(){
		
	}
	public static ProductList getInstance(){
		if (instance == null) {
			instance = new ProductList();
			instance.productlist = new ArrayList<>();
		}
		return instance;
		
	}
	
	/**
	 * 增加观察者接口
	 * @param observer 观察者
	 */
	public void addProductListObserver(Observer observer){
		this.addObserver(observer);
	}
	
	/**
	 * 增加产品
	 * @param newProduct 新产品
	 */
	public void addProduct(String newProduct){
		productlist.add(newProduct);
		System.out.println("新增产品：" + newProduct);
		this.setChanged();//设置被观察对象发生了变化
		this.notifyObservers(newProduct);//通知观察者，并传递产品
	}

}
