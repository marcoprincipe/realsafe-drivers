package br.com.volans.realsafe.driver.printer;

import br.com.volans.realsafe.driver.printer.exception.PrinterException;
import br.com.volans.realsafe.driver.printer.structure.CFGPRT;

/**
 * Interface para implementação dos drivers de impressora.
 * 
 * 
 * @author Volans Informática Ltda
 */

public interface PrinterDriver {
	
	/**
	 * Abre a impressora para utilização.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int open() throws PrinterException;
	
	/**
	 * Efetua o corte do papel.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int cut() throws PrinterException;
	
	/**
	 * Retorna o status da impressora.
	 * 
	 * @return - Código do status da impressora. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int getStatus() throws PrinterException;
	
	/**
	 * Efetua a configuração da impressora.
	 * 
	 * @param configuration - Modo do caracter utilizado :
	 * 	
	 * 		0 - Caracter normal
	 *  
	 *  	Bit 0 - Caracter itálico 
	 *  	Bit 1 - Caracter expandido 
	 *  	Bit 2 - Caracter condensado 
	 *  	Bit 3 - Caracter sublinhado 
	 *  	Bit 4 - Caracter negrito 
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int config(int configuration) throws PrinterException;
	
	/**
	 * Efetua a impressão dos dados informados.
	 * 
	 * @param buffer - Dados a serem impressos.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int print(byte[] buffer) throws PrinterException;
	
	/**
	 * Efetua a o salto de linhas na impressão.
	 * 
	 * @param lines - Número de linhas a saltar.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int skipLines(int lines) throws PrinterException;
	
	/**
	 * Efetua a impressão de uma imagem BMP.
	 * 
	 * @param buffer - Nome do arquivo BMP a ser impresso.
	 * @param column - Coluna de início da impressão. Valor entre 0 e 480.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int printBmp(byte[] buffer, int column) throws PrinterException;
	
	/**
	 * Retorna a configuração da impressora.
	 * 
	 * @param pCfgPrt - Dados de configuração da impressora - ponteiro para Estrutura CFGPRT.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int getConfig(CFGPRT pCfgPrt) throws PrinterException;
	
	/**
	 * Efetua a finalização da impressora.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int close() throws PrinterException;
	
	/**
	 * Efetua a o reset da impressora.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws PrinterException - Exceção da impressora.
	 */
	
	int reset() throws PrinterException;

}