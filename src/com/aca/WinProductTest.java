package com.aca;

public class WinProductTest {

	public static void main(String[] args) {

//		WinProduct prod1 = WinProduct.DISH;
//		WinProduct prod2 = WinProduct.HSI;
//			
//		printEnum(prod1);
//		
//		printEnum(prod2);
//		
		
		for (WinProduct p : WinProduct.values()) {
			System.out.println("WinProduct values: " + p.toString()); 		// you don't have to use "toString"
		}
		
		String s = "HSI";
		WinProduct w2;
		try {
			w2 = WinProduct.valueOf(s);
		} catch (Exception e) {
			w2 = WinProduct.HSI;
		}
		System.out.println("WinProduct w2: " + w2);
		
	}
	
	public static void printEnum(WinProduct winProduct) {
		System.out.println("winProduct: " + winProduct.getItemNumber());
	}

}
