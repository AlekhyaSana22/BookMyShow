package com.multiplex.exception;

public class UserAlreadyExistsException extends RuntimeException{
public UserAlreadyExistsException(String message) {
	super(message);
}
public UserAlreadyExistsException() {
	
}

}
