package com.hussein.net.VegBurger;

import com.hussein.net.Burger.Burger;

public class VegBurger extends Burger{
	
	 @Override
	   public float price() {
	      return 25.0f;
	   }

	   @Override
	   public String name() {
	      return "Veg Burger";
	   }

}
