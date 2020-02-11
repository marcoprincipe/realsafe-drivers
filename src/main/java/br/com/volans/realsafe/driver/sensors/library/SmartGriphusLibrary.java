package br.com.volans.realsafe.driver.sensors.library;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * Integererface JNA para utilização da placa smartgriphus.
 * 
 * @author Volans Informática Ltda.
 */

public interface SmartGriphusLibrary extends Library {
	
	/**
	 * Declaração das variáveis membro
	 */
	
	SmartGriphusLibrary INSTANCE = (SmartGriphusLibrary) Native.load("SmartGriphus", SmartGriphusLibrary.class);
	
	/**
	 * Declaração dos métodos utilizados
	 */

	int SG_OpenDevice();
	int SG_CloseDevice();
	int SG_GetDeviceId(byte[] id);
	int SG_HardwareReset();
	int SG_UnloadServer();
	
	int SG_DisableSensors();
	int SG_EnableSensors();
	int SG_SetLed(int led, int state);
	int SG_ResetSensors();
	int SG_GetSensors(byte[] sensors);
	
	boolean SG_SensorsChanged();

	int SG_WriteMaskByte(int sensor, int mask);
	int SG_ReadMaskByte(int sensor, int[] mask);
	
	int SG_GetStatus(byte[] general, byte[] sensors, byte[] output);

}
