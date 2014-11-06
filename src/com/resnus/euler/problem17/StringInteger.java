package com.resnus.euler.problem17;

public enum StringInteger {
	ONE(1,"one"),
	TWO(2,"two"),
	THREE(3,"three"),
	FOUR(4,"four"),
	FIVE(5,"five"),
	SIX(6,"six"),
	SEVEN(7,"seven"),
	EIGHT(8,"eight"),
	NINE(9,"nine"),
	TEN(10,"ten"),
	ELEVEN(11,"eleven"),
	TWELVE(12,"twelve"),
	THIRTEEN(13,"thirteen"),
	FOURTEEN(14,"fourteen"),
	FIFTEEN(15,"fifteen"),
	SIXTEEN(16,"sixteen"),
	SEVENTEEN(17,"seventeen"),
	HUNDRED(100,"hundred"),
	THOUSAND(1000,"thousand");
	
	private StringInteger(int i, String name){
		this.name = name;
		this.i = i;
	}
	
	private final String name;
	private final int i;
	
	private int getIntegerValue(){
		return this.i;
	}
	
	private String getStringValue(){
		return this.name;
	}
	
	public static String getName(int i){
		for (StringInteger si : StringInteger.values()) {
			if (si.getIntegerValue() == i) {
				return si.getStringValue();
			}
	     }
		return "ERROR";
	}
}
