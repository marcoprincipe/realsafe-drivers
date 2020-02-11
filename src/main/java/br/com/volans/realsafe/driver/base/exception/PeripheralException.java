package br.com.volans.realsafe.driver.base.exception;

/**
 * Classe de exceção genérica de periféricos.
 * 
 * @author Volans Informática Ltda
 */

public class PeripheralException extends RuntimeException {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = -4306535924020892325L;

	/**
	 * Construtor default da classe
	 */
	
	public PeripheralException() {
		super();
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param message - Mensagem de erro da exceção.
	 */
	
	public PeripheralException(String message) {
		super(message);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param cause - Causa raiz da exceção.
	 */
	
	public PeripheralException(Throwable cause) {
		super(cause);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param message - Mensagem de erro da exceção.
	 * @param cause - Causa raiz da exceção.
	 */

	public PeripheralException(String message, Throwable cause) {
		super(message, cause);
	}

}
