package com.hussein.net.Burger;

import com.hussein.net.Wrapper.Wrapper;
import com.hussein.net.builderDesignPattern.Item;
import com.hussein.net.builderDesignPattern.Packing;

public abstract class Burger implements Item {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 0;
	}

}
