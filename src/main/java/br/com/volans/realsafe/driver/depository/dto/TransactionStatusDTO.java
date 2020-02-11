package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;

/**
 * DTO para armazenamento dos dados de status da transação.
 * 
 * @author Volans Informática Ltda.
 */

public class TransactionStatusDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = 5860639327102133922L;
	
	/**
	 * Declaração das variáveis membro.
	 */

	private Integer code;
	private String description;
	private STTRANSACTIONSTATUSDTO stTransactionStatus; // Dados da estrutura STTRANSACTIONSTATUS
	private STNOTENUMBERDTO stNoteNumber; // Dados da estrutura STNOTENUMBER
	
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return the stTransactionStatus
	 */
	public STTRANSACTIONSTATUSDTO getStTransactionStatus() {
		
		if (stTransactionStatus == null) {
			stTransactionStatus = new STTRANSACTIONSTATUSDTO();
		}
		
		return stTransactionStatus;
	}
	
	/**
	 * @param stTransactionStatus the stTransactionStatus to set
	 */
	public void setStTransactionStatus(STTRANSACTIONSTATUSDTO stTransactionStatus) {
		this.stTransactionStatus = stTransactionStatus;
	}
	
	/**
	 * @return the stNoteNumber
	 */
	public STNOTENUMBERDTO getStNoteNumber() {
		
		if (stNoteNumber == null) {
			stNoteNumber = new STNOTENUMBERDTO();
		}
		
		return stNoteNumber;
	}

	/**
	 * @param stNoteNumber the stNoteNumber to set
	 */
	public void setStNoteNumber(STNOTENUMBERDTO stNoteNumber) {
		this.stNoteNumber = stNoteNumber;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		
		builder.append("TransactionStatusDTO [code=");
		builder.append(code);
		builder.append(", description=");
		builder.append(description);
		builder.append(", stTransactionStatus=");
		builder.append(stTransactionStatus);
		builder.append(", stNoteNumber=");
		builder.append(stNoteNumber);
		builder.append("]");
		
		return builder.toString();
		
	}
	
}
