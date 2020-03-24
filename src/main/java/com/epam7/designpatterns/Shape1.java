package com.epam7.designpatterns;

public abstract class Shape1 {
	   protected DrawAPI drawAPI;
	   
	   protected Shape1(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();	
	}
