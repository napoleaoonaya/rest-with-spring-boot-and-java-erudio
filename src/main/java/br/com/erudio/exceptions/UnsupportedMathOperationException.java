package br.com.erudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException{

	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
=======
	
>>>>>>> 381ef992a6895ab31e55e19f6cf22efda43ae176
	public UnsupportedMathOperationException(String messageException) {
		super(messageException);
	}
}
