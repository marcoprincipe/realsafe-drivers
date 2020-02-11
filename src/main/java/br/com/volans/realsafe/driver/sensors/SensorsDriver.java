package br.com.volans.realsafe.driver.sensors;

import br.com.volans.realsafe.driver.sensors.exception.SensorsException;

/**
 * Interface para implementa��o dos drivers de sensores.
 * 
 * @author Volans Inform�tica Ltda.
 */

public interface SensorsDriver {
	
	/**
	 * Efetua a abertura do dispositivo para utiliza��o.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws SensorsException - Exce��o da placa de sensores.
	 */
	
	int open() throws SensorsException;
	
	/**
	 * Efetua o fechamento do dispositivo.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws SensorsException - Exce��o da placa de sensores.
	 */
	
	int close() throws SensorsException;
	
	/**
	 * Habilita os sensores.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws SensorsException - Exce��o da placa de sensores.
	 */
	
	int enableSensors() throws SensorsException;
	
	/**
	 * Desabilita os sensores.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws SensorsException - Exce��o da placa de sensores.
	 */
	
	int disableSensors() throws SensorsException;
	
	/**
	 * Inicializa os sensores.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws SensorsException - Exce��o da placa de sensores.
	 */
	
	int resetSensors() throws SensorsException;
	
	/**
	 * Recupera o status dos sensores.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws SensorsException - Exce��o da placa de sensores.
	 */
	
	int getSensors(byte[] sensors) throws SensorsException;
	
	/**
	 * Recupera o flag de altera��o dos sensores.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws SensorsException - Exce��o da placa de sensores.
	 */
	
	boolean sensorsChanged() throws SensorsException;
	
	/**
	 * Grava a m�scara do sensor informado.
	 * 
	 * @param sensor - Identificador do sensor.
	 * @param mask - M�scara a ser utilizada.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws SensorsException - Exce��o da placa de sensores.
	 */
	
	int writeMaskByte(int sensor, int mask) throws SensorsException;
	
	/**
	 * Recupera a m�scara do sensor informado.
	 * 
	 * @param sensor - Identificador do sensor.
	 * @param mask - M�scara configurada.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws SensorsException - Exce��o da placa de sensores.
	 */
	
	int readMaskByte(int sensor, int[] mask) throws SensorsException;

}
