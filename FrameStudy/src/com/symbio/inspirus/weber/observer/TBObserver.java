package com.symbio.inspirus.weber.observer;

import java.util.Observable;
import java.util.Observer;

public class TBObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		String newProduct = (String) arg;
		System.out.println("�����²�Ʒ["+ newProduct +"]���Ա�");
	}

}
