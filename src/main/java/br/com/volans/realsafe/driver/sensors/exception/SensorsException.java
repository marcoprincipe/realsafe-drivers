package br.com.volans.realsafe.driver.sensors.exception;

import br.com.volans.realsafe.driver.base.exception.PeripheralException;

/**
 * Classe de exceção de placas de sensores.
 * 
 * @author Volans Informática Ltda.
 */

public class SensorsException extends PeripheralException {

	/**
	 * Declaração da serial version.
	 */

	private static final long serialVersionUID = 1486339501079406143L;

	/**
	 * Construtor default da classe
	 */
	
	public SensorsException() {
		super();
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param message - Mensagem de erro da exceção.
	 */
	
	public SensorsException(String message) {
		super(message);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param cause - Causa raiz da exceção.
	 */
	
	public SensorsException(Throwable cause) {
		super(cause);
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param message - Mensagem de erro da exceção.
	 * @param cause - Causa raiz da exceção.
	 */

	public SensorsException(String message, Throwable cause) {
		super(message, cause);
	}


}
