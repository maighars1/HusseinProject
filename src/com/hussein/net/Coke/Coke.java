package com.hussein.net.Coke;

import com.hussein.net.Burger.ColdDrink.ColdDrink;

public class Coke extends ColdDrink {
	
	
	@Override
	   public float price() {
	      return 30.0f;
	   }

	   @Override
	   public String name() {
	      return "Coke";
	   }

}
