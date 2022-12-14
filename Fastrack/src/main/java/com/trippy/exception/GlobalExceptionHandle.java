package com.trippy.exception;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Conditional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandle {
	
	
	
	
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<MyErrorInfo> myIllegalArgumentException(IllegalArgumentException me) {
		
		MyErrorInfo err = new MyErrorInfo();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage("Validation Error");
		err.setDetails(me.getMessage());
		
		
		return new ResponseEntity<MyErrorInfo>(err,HttpStatus.BAD_REQUEST);
		
		
	}
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorInfo> myInvalidDataExpHandler(MethodArgumentNotValidException me) {
		
		MyErrorInfo err = new MyErrorInfo();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage("Validation Error");
		err.setDetails(me.getBindingResult().getFieldError().getDefaultMessage());
		
		
		return new ResponseEntity<MyErrorInfo>(err,HttpStatus.BAD_REQUEST);
		
		
	}



	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorInfo> myAnyExpHandler(Exception ie,WebRequest req){
		
		
		MyErrorInfo err = new MyErrorInfo();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorInfo>(err, HttpStatus.BAD_REQUEST);
		
	}

	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorInfo> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req)  {
			
	
		MyErrorInfo err=new MyErrorInfo(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
	
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
					
	}

	
	@ExceptionHandler(DriverException.class)
	public ResponseEntity<MyErrorInfo> myAnyExpHandler(DriverException ie,WebRequest req){
		
		
		MyErrorInfo err = new MyErrorInfo();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorInfo>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(CabException.class)
	public ResponseEntity<MyErrorInfo> myAnyExpHandler(CabException ie,WebRequest req){
		
		
		MyErrorInfo err = new MyErrorInfo();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorInfo>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(TripBookingException.class)
	public ResponseEntity<MyErrorInfo> myAnyExpHandler(TripBookingException ie,WebRequest req){
		
		
		MyErrorInfo err = new MyErrorInfo();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorInfo>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyErrorInfo> myAnyExpHandler(AdminException ie,WebRequest req){
		
		
		MyErrorInfo err = new MyErrorInfo();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorInfo>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<MyErrorInfo> myAnyExpHandler(CustomerException ie,WebRequest req){
		
		
		MyErrorInfo err = new MyErrorInfo();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorInfo>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<MyErrorInfo> myAnyExpHandler(LoginException ie,WebRequest req){
		
		
		MyErrorInfo err = new MyErrorInfo();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorInfo>(err, HttpStatus.BAD_REQUEST);
		
	}
}
