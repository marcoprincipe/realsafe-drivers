package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;

/**
 * DTO para armazenamento dos dados de status de depositários.
 * 
 * @author Volans Informática Ltda.
 */

public class STTRANSACTIONSTATUSDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = -6972341046230479117L;
	
	/**
	 * Declaração das variáveis membro.
	 */

	public int nCashInTransaction;
	public int nTotalAccepted;
	public int nTotalRefused;
	public int nNumNoteNumbers;
	
	/**
	 * @return the nCashInTransaction
	 */
	public int getnCashInTransaction() {
		return nCashInTransaction;
	}
	
	/**
	 * @param nCashInTransaction the nCashInTransaction to set
	 */
	public void setnCashInTransaction(int nCashInTransaction) {
		this.nCashInTransaction = nCashInTransaction;
	}
	
	/**
	 * @return the nTotalAccepted
	 */
	public int getnTotalAccepted() {
		return nTotalAccepted;
	}
	
	/**
	 * @param nTotalAccepted the nTotalAccepted to set
	 */
	public void setnTotalAccepted(int nTotalAccepted) {
		this.nTotalAccepted = nTotalAccepted;
	}
	
	/**
	 * @return the nTotalRefused
	 */
	public int getnTotalRefused() {
		return nTotalRefused;
	}
	
	/**
	 * @param nTotalRefused the nTotalRefused to set
	 */
	public void setnTotalRefused(int nTotalRefused) {
		this.nTotalRefused = nTotalRefused;
	}
	
	/**
	 * @return the nNumNoteNumbers
	 */
	public int getnNumNoteNumbers() {
		return nNumNoteNumbers;
	}

	/**
	 * @param nNumNoteNumbers the nNumNoteNumbers to set
	 */
	public void setnNumNoteNumbers(int nNumNoteNumbers) {
		this.nNumNoteNumbers = nNumNoteNumbers;
	}
	
	


}
