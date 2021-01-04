package com.tplp3.reviews.exception;

public class IdNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9083134170621563624L;
	
	public IdNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IdNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public IdNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public IdNotFound(String tableName,Long ID) {
		super("ID "+ID.toString()+" Not found on Table "+tableName);
		// TODO Auto-generated constructor stub
	}
	public IdNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
