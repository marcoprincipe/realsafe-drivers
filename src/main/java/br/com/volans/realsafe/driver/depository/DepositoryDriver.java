package br.com.volans.realsafe.driver.depository;

import br.com.volans.realsafe.driver.depository.dto.CFGCASHUNITSCIMDTO;
import br.com.volans.realsafe.driver.depository.dto.CFGCIMDTO;
import br.com.volans.realsafe.driver.depository.dto.DepositoryCountDTO;
import br.com.volans.realsafe.driver.depository.dto.DepositoryStatusDTO;
import br.com.volans.realsafe.driver.depository.dto.STEXCHANGEDTO;
import br.com.volans.realsafe.driver.depository.dto.TransactionStatusDTO;
import br.com.volans.realsafe.driver.depository.exception.DepositoryException;

/**
 * Interface para implementação dos drivers de depositários.
 * 
 * @author Volans Informática Ltda.
 */

public interface DepositoryDriver {
	
	/**
	 * Efetua a abertura do depositário para utilização.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	int open() throws DepositoryException;
	
	/**
	 * Efetua a finalização da impressora.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	int close() throws DepositoryException;
	
	/**
	 * Retorna o status do depositário.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	DepositoryStatusDTO getStatus() throws DepositoryException;
	
	/**
	 * Efetua a o reset do depositário.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	int reset() throws DepositoryException;
	
	/**
	 * Retorna a configuração do depositário.
	 * 
	 * @return - DTO com os dados da configuração do depositário. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	CFGCIMDTO getConfig() throws DepositoryException;
	
	/**
	 * Inicia uma transação de depósito em dinheiro.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	int startDeposit() throws DepositoryException;
	
	/**
	 * Permite a entrada das notas no dispositivo.
	 * 
	 * @param timeout - Tempo máximo em milisegundos para aguardar pela entrada das notas.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	int deposit(int timeout) throws DepositoryException;
	
	/**
	 * Encerra uma transação de depósito em dinheiro.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	DepositoryCountDTO endDeposit() throws DepositoryException;
	
	/**
	 * Efetua o rollback de uma transação de depósito.
	 * 
	 * @param timeout - Tempo máximo em milisegundos para aguardar pela retirada das notas.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	int rollback(int timeout) throws DepositoryException;
	
	/**
	 * Retorna o status de uma transação do depositário.
	 * 
	 * @return - Dados do status da transação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	TransactionStatusDTO getTransactionStatus() throws DepositoryException;
	
	/**
	 * Efetua o recolhimento de uma cédula recusada e não retirada pelo cliente.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	int retract() throws DepositoryException;
	
	/**
	 * Efetua a configuração dos cassetes do depositário.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	CFGCASHUNITSCIMDTO configCashUnits() throws DepositoryException;
	
	/**
	 * Inicia o abastecimento / recolhimento do depositário.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	STEXCHANGEDTO exchange() throws DepositoryException;
	
	/**
	 * Retorna para o cliente as notas recusadas.
	 * 
	 * @param timeout - Tempo máximo em milisegundos para aguardar pela retirada das notas.
	 * 
	 * @return - Resultado da operação. 
	 * 
	 * @throws DepositoryException - Exceção do depositário.
	 */
	
	int returnRefused(int timeout) throws DepositoryException;

}
