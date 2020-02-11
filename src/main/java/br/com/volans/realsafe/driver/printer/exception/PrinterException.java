package br.com.volans.realsafe.driver.printer.exception;

import br.com.volans.realsafe.driver.base.exception.PeripheralException;

/**
 * Classe de exceção de impressoras.
 * 
 * @author Volans Informática Ltda
 */

public class PrinterException extends PeripheralException {

	/**
	 * Declaração da serial version.
	 */
	
	private static final long serialVersionUID = -8637990553255056776L;

	/**
	 * Construtor default da classe
	 */
	
	public PrinterException() {
		super();
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param message - Mensagem de erro da exceção.
	 */
	
	public PrinterException(String message) {
		super(message);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param cause - Causa raiz da exceção.
	 */
	
	public PrinterException(Throwable cause) {
		super(cause);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param message - Mensagem de erro da exceção.
	 * @param cause - Causa raiz da exceção.
	 */

	public PrinterException(String message, Throwable cause) {
		super(message, cause);
	}

}
