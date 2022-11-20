package br.com.erudio.service;

import org.springframework.stereotype.Repository;

@Repository
public interface MathService {	
	Double isZero(String dNumber);	
	Boolean isNumeric(String strNumber);
	Double convertToDouble(String strNumber);
}
