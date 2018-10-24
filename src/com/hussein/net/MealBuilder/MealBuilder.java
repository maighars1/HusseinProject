package com.hussein.net.MealBuilder;

import com.hussein.net.ChickenBurger.ChickenBurger;
import com.hussein.net.Coke.Coke;
import com.hussein.net.Meals.Meal;
import com.hussein.net.Pepsi.Pepsi;
import com.hussein.net.VegBurger.VegBurger;

public class MealBuilder {
	
	
	 public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }

}
