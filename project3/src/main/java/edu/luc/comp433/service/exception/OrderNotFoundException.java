/**
 * 
 */
package edu.luc.comp433.service.exception;

/**
 * @author Bruno Correa <brunogmc at gmail>
 *
 */
public class OrderNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderNotFoundException() {
		super();
	}
	
	public OrderNotFoundException(String message) {
		super(message);
	}
	
	public OrderNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

	/**
	 * @param orderId
	 */
	public OrderNotFoundException(Short orderId) {
		this("OrderRepresentation Id#: " + orderId);
	}
}

