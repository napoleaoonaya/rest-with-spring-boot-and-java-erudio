package br.com.erudio.service.impl;

import org.springframework.stereotype.Service;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.service.MathService;

@Service
public class MathServiceImpl implements MathService {
	

	private Double doubleNumber;

	@Override
	public Boolean isNumeric(String strNumber) {
		if(strNumber == null || strNumber == "") {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		return strNumber.matches("[-+]?[0-9]*\\.?[0.9]+");
	}
	
	@Override
	public Double convertToDouble(String strNumber) {
		if(strNumber == null || strNumber == "") {	
			return 0D;
		}

		Double numberConverted = 0D;
		if(!isNumeric(strNumber)) {
			numberConverted = Double.valueOf(strNumber);
			return numberConverted;
		}else {
			numberConverted = Double.valueOf(strNumber);
			return numberConverted;
		}
	}
	
	@Override	
	public Double isZero(String dNumber) {	
		doubleNumber = Double.parseDouble(dNumber);
		if("Infinity".equals(doubleNumber.toString())) {
			throw new UnsupportedMathOperationException("Cannot divide a number by zero");
		}else if("NaN".equals(doubleNumber.toString())) {
			throw new UnsupportedMathOperationException("The division of zero by zero is undefined");
		}else {
			return doubleNumber;
		}
	}
<<<<<<< HEAD
=======
	
>>>>>>> 381ef992a6895ab31e55e19f6cf22efda43ae176
}
