package br.com.volans.realsafe.driver.sensors.impl;

import org.springframework.stereotype.Component;

import br.com.volans.realsafe.driver.sensors.SensorsDriver;
import br.com.volans.realsafe.driver.sensors.exception.SensorsException;
import br.com.volans.realsafe.driver.sensors.library.SmartGriphusLibrary;

/**
 * Implementação da interface da placa de sensores smartgriphus.
 * 
 * @author Volans Informática Ltda
 */

@Component("SmartGriphusSensorsDriver")
public class SmartGriphusSensorsDriverImpl implements SensorsDriver {
	
	/**
	 * Efetua a abertura do dispositivo para utilização.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws SensorsException - Exceção da placa de sensores.
	 */
	
	@Override
	public int open() throws SensorsException {

		int result = SmartGriphusLibrary.INSTANCE.SG_OpenDevice();
		
		return result;
		
	}
	
	/**
	 * Efetua o fechamento do dispositivo.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws SensorsException - Exceção da placa de sensores.
	 */
	
	@Override
	public int close() throws SensorsException {

		int result = SmartGriphusLibrary.INSTANCE.SG_CloseDevice();
		
		return result;
		
	}
	
	/**
	 * Habilita os sensores.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws SensorsException - Exceção da placa de sensores.
	 */
	
	@Override
	public int enableSensors() throws SensorsException {

		int result = SmartGriphusLibrary.INSTANCE.SG_EnableSensors();
		
		return result;
		
	}
	
	/**
	 * Desabilita os sensores.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws SensorsException - Exceção da placa de sensores.
	 */
	
	@Override
	public int disableSensors() throws SensorsException {

		int result = SmartGriphusLibrary.INSTANCE.SG_DisableSensors();
		
		return result;
		
	}
	
	/**
	 * Inicializa os sensores.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws SensorsException - Exceção da placa de sensores.
	 */
	
	@Override
	public int resetSensors() throws SensorsException {

		int result = SmartGriphusLibrary.INSTANCE.SG_ResetSensors();
		
		return result;
		
	}
	
	/**
	 * Recupera o status dos sensores.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws SensorsException - Exceção da placa de sensores.
	 */
	
	@Override
	public int getSensors(byte[] sensors) throws SensorsException {

		int result = SmartGriphusLibrary.INSTANCE.SG_GetSensors(sensors);
		
		return result;
		
	}
	
	/**
	 * Recupera o flag de alteração dos sensores.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws SensorsException - Exceção da placa de sensores.
	 */
	
	@Override
	public boolean sensorsChanged() throws SensorsException {

		boolean result = SmartGriphusLibrary.INSTANCE.SG_SensorsChanged();
		
		return result;
		
	}
	
	/**
	 * Grava a máscara do sensor informado.
	 * 
	 * @param sensor - Identificador do sensor.
	 * @param mask - Máscara a ser utilizada.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws SensorsException - Exceção da placa de sensores.
	 */
	
	@Override
	public int writeMaskByte(int sensor, int mask) throws SensorsException {

		int result = SmartGriphusLibrary.INSTANCE.SG_WriteMaskByte(sensor, mask);
		
		return result;
		
	}
	
	/**
	 * Recupera a máscara do sensor informado.
	 * 
	 * @param sensor - Identificador do sensor.
	 * @param mask - Máscara configurada.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws SensorsException - Exceção da placa de sensores.
	 */
	
	@Override
	public int readMaskByte(int sensor, int[] mask) throws SensorsException {

		int result = SmartGriphusLibrary.INSTANCE.SG_ReadMaskByte(sensor, mask);
		
		return result;
		
	}
	
	

}
