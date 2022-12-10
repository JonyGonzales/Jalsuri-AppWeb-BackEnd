package com.gestion.Jalsuri_BackEnd.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value=HttpStatus.NOT_FOUND) 
public class ResouceNotFoudException extends RuntimeException{

	private static final long serialVersionID = 1L;
	
	public ResouceNotFoudException(String mensaje) {
		super(mensaje);
	}
}
