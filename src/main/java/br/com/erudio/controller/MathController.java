package br.com.erudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.service.impl.MathServiceImpl;
import br.com.erudio.util.MathUtil;

@RestController
public class MathController {
	
	@Autowired
	private MathServiceImpl serviceImpl;
	
	@Autowired
	private MathUtil mathUtil;
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double sum(	
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) {
		
		return mathUtil.sumNumbers(numberOne, numberTwo);
	}
	
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double subtraction(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) {
		
		return mathUtil.subtractionNumbers(numberOne, numberTwo);
		
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double multiplication(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) {
		
		return mathUtil.multiplicationNumbers(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double division(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) {
		
		var resultado = mathUtil.division(numberOne,numberTwo);
		
		return serviceImpl.isZero(resultado.toString());
	}
	
	@RequestMapping(value = "/average/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double average(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) {
		
		return mathUtil.averageNumbers(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/squareRoote/{numberOne}",
			method = RequestMethod.GET)
	public Double squareRoote(	
			@PathVariable(value = "numberOne") String numberOne) {
		
		return Math.sqrt(mathUtil.squareRoote(numberOne));
	}
<<<<<<< HEAD
=======

>>>>>>> 381ef992a6895ab31e55e19f6cf22efda43ae176
}
