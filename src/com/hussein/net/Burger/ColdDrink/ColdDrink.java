package com.hussein.net.Burger.ColdDrink;

import com.hussein.net.Wrapper.Bottle;
import com.hussein.net.builderDesignPattern.Item;
import com.hussein.net.builderDesignPattern.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
