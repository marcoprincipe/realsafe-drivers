package br.com.volans.realsafe.driver.depository;

import br.com.volans.realsafe.driver.depository.dto.CFGCASHUNITSCIMDTO;
import br.com.volans.realsafe.driver.depository.dto.CFGCIMDTO;
import br.com.volans.realsafe.driver.depository.dto.DepositoryCountDTO;
import br.com.volans.realsafe.driver.depository.dto.DepositoryStatusDTO;
import br.com.volans.realsafe.driver.depository.dto.STEXCHANGEDTO;
import br.com.volans.realsafe.driver.depository.dto.TransactionStatusDTO;
import br.com.volans.realsafe.driver.depository.exception.DepositoryException;

/**
 * Interface para implementa��o dos drivers de deposit�rios.
 * 
 * @author Volans Inform�tica Ltda.
 */

public interface DepositoryDriver {
	
	/**
	 * Efetua a abertura do deposit�rio para utiliza��o.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	int open() throws DepositoryException;
	
	/**
	 * Efetua a finaliza��o da impressora.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	int close() throws DepositoryException;
	
	/**
	 * Retorna o status do deposit�rio.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	DepositoryStatusDTO getStatus() throws DepositoryException;
	
	/**
	 * Efetua a o reset do deposit�rio.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	int reset() throws DepositoryException;
	
	/**
	 * Retorna a configura��o do deposit�rio.
	 * 
	 * @return - DTO com os dados da configura��o do deposit�rio. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	CFGCIMDTO getConfig() throws DepositoryException;
	
	/**
	 * Inicia uma transa��o de dep�sito em dinheiro.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	int startDeposit() throws DepositoryException;
	
	/**
	 * Permite a entrada das notas no dispositivo.
	 * 
	 * @param timeout - Tempo m�ximo em milisegundos para aguardar pela entrada das notas.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	int deposit(int timeout) throws DepositoryException;
	
	/**
	 * Encerra uma transa��o de dep�sito em dinheiro.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	DepositoryCountDTO endDeposit() throws DepositoryException;
	
	/**
	 * Efetua o rollback de uma transa��o de dep�sito.
	 * 
	 * @param timeout - Tempo m�ximo em milisegundos para aguardar pela retirada das notas.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	int rollback(int timeout) throws DepositoryException;
	
	/**
	 * Retorna o status de uma transa��o do deposit�rio.
	 * 
	 * @return - Dados do status da transa��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	TransactionStatusDTO getTransactionStatus() throws DepositoryException;
	
	/**
	 * Efetua o recolhimento de uma c�dula recusada e n�o retirada pelo cliente.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	int retract() throws DepositoryException;
	
	/**
	 * Efetua a configura��o dos cassetes do deposit�rio.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	CFGCASHUNITSCIMDTO configCashUnits() throws DepositoryException;
	
	/**
	 * Inicia o abastecimento / recolhimento do deposit�rio.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	STEXCHANGEDTO exchange() throws DepositoryException;
	
	/**
	 * Retorna para o cliente as notas recusadas.
	 * 
	 * @param timeout - Tempo m�ximo em milisegundos para aguardar pela retirada das notas.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	int returnRefused(int timeout) throws DepositoryException;

}
