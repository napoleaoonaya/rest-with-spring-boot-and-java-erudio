package br.com.erudio.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.erudio.service.MathService;

@Repository
public class MathUtil {
	
	@Autowired
	private MathService mathService;
	

	public Double sumNumbers(String numberOne, String numberTwo) {
		
		Double doubleOne = mathService.convertToDouble(numberOne);
		Double doubleTwo = mathService.convertToDouble(numberTwo);
		return doubleOne + doubleTwo;

	}
	
	public Double subtractionNumbers(String numberOne, String numberTwo) {
		
		Double doubleOne = mathService.convertToDouble(numberOne);
		Double doubleTwo = mathService.convertToDouble(numberTwo);
		return doubleOne - doubleTwo;

	}
	
	public Double multiplicationNumbers(String numberOne, String numberTwo) {
		
		Double doubleOne = mathService.convertToDouble(numberOne);
		Double doubleTwo = mathService.convertToDouble(numberTwo);
		return doubleOne * doubleTwo;
	}

	public Double division(String numberOne, String numberTwo) {
		Double doubleOne = mathService.convertToDouble(numberOne);
		Double doubleTwo = mathService.convertToDouble(numberTwo);
		return doubleOne / doubleTwo;
	}
	
	public Double averageNumbers(String numberOne, String numberTwo) {
		
		Double doubleOne = mathService.convertToDouble(numberOne);
		Double doubleTwo = mathService.convertToDouble(numberTwo);
		return (doubleOne + doubleTwo)/2;

	}

	public Double squareRoote(String numberOne) {
		return mathService.convertToDouble(numberOne);
	}
}
