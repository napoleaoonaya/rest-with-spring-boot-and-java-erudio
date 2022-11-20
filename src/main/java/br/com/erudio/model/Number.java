package br.com.erudio.model;

public class Number {
	
	private String numberOne;
	private String numberTwo;
	
	
	public Number() {
	
	}

	public Number(String numberOne, String numberTwo) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
	}

	public String getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(String numberOne) {
		this.numberOne = numberOne;
	}

	public String getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(String numberTwo) {
		this.numberTwo = numberTwo;
	}

}
