package br.com.volans.realsafe.driver.depository.exception;

import br.com.volans.realsafe.driver.base.exception.PeripheralException;

/**
 * Classe de exce��o de deposit�rios.
 * 
 * @author Volans Inform�tica Ltda.
 */

public class DepositoryException extends PeripheralException {

	/**
	 * Declara��o da serial version.
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
	 * @param message - Mensagem de erro da exce��o.
	 */
	
	public DepositoryException(String message) {
		super(message);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param cause - Causa raiz da exce��o.
	 */
	
	public DepositoryException(Throwable cause) {
		super(cause);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param message - Mensagem de erro da exce��o.
	 * @param cause - Causa raiz da exce��o.
	 */

	public DepositoryException(String message, Throwable cause) {
		super(message, cause);
	}

}
