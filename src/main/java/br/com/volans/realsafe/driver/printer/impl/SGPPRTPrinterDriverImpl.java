package br.com.volans.realsafe.driver.printer.impl;

import org.springframework.stereotype.Component;

import br.com.volans.realsafe.driver.printer.PrinterDriver;
import br.com.volans.realsafe.driver.printer.exception.PrinterException;
import br.com.volans.realsafe.driver.printer.library.SGPPRTLibrary;
import br.com.volans.realsafe.driver.printer.structure.CFGPRT;

/**
 * Implementa��o da interface para impressora via SGP.
 * 
 * @author Volans Inform�tica Ltda
 */

@Component("SGPPRTPrinterDriver")
public class SGPPRTPrinterDriverImpl implements PrinterDriver {
	
	/**
	 * Abre a impressora para utiliza��o.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	@Override
	public int open() throws PrinterException {
		
		int result = SGPPRTLibrary.INSTANCE.SGP_AbrePRT();
		
		return result;
		
	}
	
	/**
	 * Efetua o corte do papel.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	@Override
	public int cut() throws PrinterException {
		
		int result = SGPPRTLibrary.INSTANCE.SGP_PicotaPRT();
		
		return result;
		
	}
	
	/**
	 * Retorna o status da impressora.
	 * 
	 * @return - C�digo do status da impressora. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	@Override
	public int getStatus() throws PrinterException {
		
		int result = SGPPRTLibrary.INSTANCE.SGP_StatusPRT();
		
		return result;
		
	}
	
	/**
	 * Efetua a configura��o da impressora.
	 * 
	 * @param configuration - Modo do caracter utilizado :
	 * 	
	 * 		0 - Caracter normal
	 *  
	 *  	Bit 0 - Caracter it�lico 
	 *  	Bit 1 - Caracter expandido 
	 *  	Bit 2 - Caracter condensado 
	 *  	Bit 3 - Caracter sublinhado 
	 *  	Bit 4 - Caracter negrito 
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	@Override
	public int config(int configuration) throws PrinterException {
		
		int result = SGPPRTLibrary.INSTANCE.SGP_ProgramaPRT(configuration);
		
		return result;
		
	}
	
	/**
	 * Efetua a impress�o dos dados informados.
	 * 
	 * @param buffer - Dados a serem impressos.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	@Override
	public int print(byte[] buffer) throws PrinterException {

		int size = buffer.length;
		
		int result = SGPPRTLibrary.INSTANCE.SGP_ImprimePRT(buffer, size);
		
		return result;
		
	}
	
	/**
	 * Efetua a o salto de linhas na impress�o.
	 * 
	 * @param lines - N�mero de linhas a saltar.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	@Override
	public int skipLines(int lines) throws PrinterException {
		
		int result = SGPPRTLibrary.INSTANCE.SGP_SaltaLinhasPRT(lines);
		
		return result;
		
	}
	
	/**
	 * Efetua a impress�o de uma imagem BMP.
	 * 
	 * @param buffer - Nome do arquivo BMP a ser impresso.
	 * @param column - Coluna de in�cio da impress�o. Valor entre 0 e 480.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	@Override
	public int printBmp(byte[] buffer, int column) throws PrinterException {
		
		int result = SGPPRTLibrary.INSTANCE.SGP_ImprimeBmpPRT(buffer, column);
		
		return result;
		
	}
	
	/**
	 * Retorna a configura��o da impressora.
	 * 
	 * @param pCfgPrt - Dados de configura��o da impressora - ponteiro para Estrutura CFGPRT.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	@Override
	public int getConfig(CFGPRT pCfgPrt) throws PrinterException {
		
		int result = SGPPRTLibrary.INSTANCE.SGP_LeConfigPRT(pCfgPrt);
		
		return result;
		
	}
	
	/**
	 * Efetua a finaliza��o da impressora.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	@Override
	public int close() throws PrinterException {
		
		int result = SGPPRTLibrary.INSTANCE.SGP_FechaPRT();
		
		return result;
		
	}
	
	/**
	 * Efetua a o reset da impressora.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	@Override
	public int reset() throws PrinterException {
		
		int result = close();
		
		if (result != 0) {
			return result;
		}
		
		result = open();

		return result;
		
	}
}
