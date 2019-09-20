package in.cdac.ecgcltd.smile.erp.pebpolicy.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TestExceptionHandler {

	/*
	 * @ExceptionHandler(value=DataAccessException.class) public String
	 * dataAccessException() { System.out.println("error occured"); return
	 * "notfound"; }
	 */
}
