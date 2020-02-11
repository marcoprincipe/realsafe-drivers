package br.com.volans.realsafe.driver.depository.exception;

import br.com.volans.realsafe.driver.base.exception.PeripheralException;

/**
 * Classe de exceção de depositários.
 * 
 * @author Volans Informática Ltda.
 */

public class DepositoryException extends PeripheralException {

	/**
	 * Declaração da serial version.
	 */

	private static final long serialVersionUID = 5892297666499874110L;

	/**
	 * Construtor default da classe
	 */
	
	public DepositoryException() {
		super();
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param message - Mensagem de erro da exceção.
	 */
	
	public DepositoryException(String message) {
		super(message);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param cause - Causa raiz da exceção.
	 */
	
	public DepositoryException(Throwable cause) {
		super(cause);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param message - Mensagem de erro da exceção.
	 * @param cause - Causa raiz da exceção.
	 */

	public DepositoryException(String message, Throwable cause) {
		super(message, cause);
	}

}
