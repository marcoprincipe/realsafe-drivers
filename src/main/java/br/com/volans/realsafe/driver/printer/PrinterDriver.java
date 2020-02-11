package br.com.volans.realsafe.driver.printer;

import br.com.volans.realsafe.driver.printer.exception.PrinterException;
import br.com.volans.realsafe.driver.printer.structure.CFGPRT;

/**
 * Interface para implementa��o dos drivers de impressora.
 * 
 * 
 * @author Volans Inform�tica Ltda
 */

public interface PrinterDriver {
	
	/**
	 * Abre a impressora para utiliza��o.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	int open() throws PrinterException;
	
	/**
	 * Efetua o corte do papel.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	int cut() throws PrinterException;
	
	/**
	 * Retorna o status da impressora.
	 * 
	 * @return - C�digo do status da impressora. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	int getStatus() throws PrinterException;
	
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
	
	int config(int configuration) throws PrinterException;
	
	/**
	 * Efetua a impress�o dos dados informados.
	 * 
	 * @param buffer - Dados a serem impressos.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	int print(byte[] buffer) throws PrinterException;
	
	/**
	 * Efetua a o salto de linhas na impress�o.
	 * 
	 * @param lines - N�mero de linhas a saltar.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	int skipLines(int lines) throws PrinterException;
	
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
	
	int printBmp(byte[] buffer, int column) throws PrinterException;
	
	/**
	 * Retorna a configura��o da impressora.
	 * 
	 * @param pCfgPrt - Dados de configura��o da impressora - ponteiro para Estrutura CFGPRT.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	int getConfig(CFGPRT pCfgPrt) throws PrinterException;
	
	/**
	 * Efetua a finaliza��o da impressora.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	int close() throws PrinterException;
	
	/**
	 * Efetua a o reset da impressora.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws PrinterException - Exce��o da impressora.
	 */
	
	int reset() throws PrinterException;

}