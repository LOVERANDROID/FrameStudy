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
	 * ���ӹ۲��߽ӿ�
	 * @param observer �۲���
	 */
	public void addProductListObserver(Observer observer){
		this.addObserver(observer);
	}
	
	/**
	 * ���Ӳ�Ʒ
	 * @param newProduct �²�Ʒ
	 */
	public void addProduct(String newProduct){
		productlist.add(newProduct);
		System.out.println("������Ʒ��" + newProduct);
		this.setChanged();//���ñ��۲�������˱仯
		this.notifyObservers(newProduct);//֪ͨ�۲��ߣ������ݲ�Ʒ
	}

}
