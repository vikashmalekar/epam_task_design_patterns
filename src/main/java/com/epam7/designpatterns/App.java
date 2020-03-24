package com.epam7.designpatterns;

/**
 * Hello world!
 *
 */
public class App {
	   public static void main(String[] args) {
	      
		   System.out.println("#Creational Design Patterns= ");
		   System.out.println("1. Abstract Factory design pattern= \n");
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	      
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
	     
	      shape1.draw();
	      
	      Shape shape2 = shapeFactory.getShape("SQUARE");
	      
	      shape2.draw();
	      
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	      
	      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
	      
	      shape3.draw();
	      
	      Shape shape4 = shapeFactory1.getShape("SQUARE");
	      
	      shape4.draw();
	      System.out.println("\n Abstract Factory DP implemented successfully");
	      System.out.println();
	      System.out.println("2. Singleton Design Pattern= \n");
	      SingleObject object = SingleObject.getInstance();
	      System.out.println("\nSingleton DP implemented successfully");
	      //show the message
	      object.showMessage();
	      System.out.println();
	      System.out.println("#Structural Design Patterns= \n");
	      System.out.println("\n1. Adapter Design Pattern= ");
	      AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	      System.out.println("\n Adapter DP implemented successfully");
	      System.out.println();
	      
	      Circle redCircle = new Circle(100,100, 10, new RedCircle());
	      Circle greenCircle = new Circle(100,100, 10, new GreenCircle());
	      System.out.println();
	      System.out.println("2. Bridge Design Patterns= \n");
	      redCircle.draw();
	      greenCircle.draw();
	      System.out.println("\n Bridge DP implemented successfully");
	      
	      System.out.println();
	      System.out.println("#Behavioral Design Patterns= ");
	      System.out.println("1. Command Design Pattern= \n");
	      Stock abcStock = new Stock();

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);

	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder);
	      
	      broker.takeOrder(sellStockOrder);

	      broker.placeOrders();
	      System.out.println("\n Command DP implemented successfully");
	      System.out.println();
	      System.out.println("2. Iterator Design Pattern= \n");
	      NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	      System.out.println("\n Iterator Dp implemented Successfully");
	   }
	}