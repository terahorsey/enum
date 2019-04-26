package com.aca;

public enum BrowserType { Chrome("Google"), IE("Micorsoft"), Firefox();

	private String owner;
	
	// constructor
	private BrowserType(String owner) {
		this.owner = owner;
	}
	
	// constructor
	private BrowserType() {
		owner = "don't care";
	}

	public String getOwner() {
		return owner;
	}

	
	
}
