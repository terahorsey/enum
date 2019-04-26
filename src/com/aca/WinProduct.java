package com.aca;

public enum WinProduct { DISH(1), HSI(2), DirectTV(3);

	// creating an instance variable
	private int itemNumber;

	//created a constructor
	private WinProduct(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getItemNumber() {
		return itemNumber;
	}
	
	
}
