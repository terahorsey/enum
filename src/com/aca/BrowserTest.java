package com.aca;

public class BrowserTest {

	public static void main(String[] args) {

		// creating an instance variable
		BrowserTest bt = new BrowserTest();	
		
		// calling demo method
		bt.demo();
		
		// calling displayEnum method  
		bt.displayEnum(BrowserType.Chrome);
	}

	public void demo() {
		
		// created loop to print brand names 
		for (BrowserType t : BrowserType.values()) {
			System.out.println("t: " + t);
		}
		
		// created loop to print brand name & owner of brand
		for (BrowserType t : BrowserType.values()) {
			System.out.println( t + " is owned by: " + t.getOwner());
		}
	}
	
	// created method to display info about enum
	private void displayEnum(BrowserType bt) {
		
		switch(bt) {
		case Chrome:
			System.out.println("Winner winner, chicken dinner!");
			break;
		case IE:
			System.out.println("This one stinks!");
			break;
		case Firefox:
			System.out.println("Can't help you!");
			break;
		}
	}
}

