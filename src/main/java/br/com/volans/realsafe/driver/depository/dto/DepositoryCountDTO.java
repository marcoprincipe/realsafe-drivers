package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO para armazenamento dos dados da contagem de depositários.
 * 
 * @author Volans Informática Ltda.
 */

public class DepositoryCountDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = 3308870715876882700L;
	
	/**
	 * Declaração das variáveis membro.
	 */

	private Integer status;
	private List<BankNoteDTO> bankNotes;
	private BigDecimal amount;
	
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * @return the bankNotes
	 */
	public List<BankNoteDTO> getBankNotes() {
		
		if (bankNotes == null) {
			bankNotes = new ArrayList<BankNoteDTO>();
		}
		
		return bankNotes;
		
	}
	
	/**
	 * @param bankNotes the bankNotes to set
	 */
	public void setBankNotes(List<BankNoteDTO> bankNotes) {
		this.bankNotes = bankNotes;
	}
	
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("DepositoryCountDTO [status=");
		builder.append(status);
		builder.append(", bankNotes=");
		builder.append(bankNotes);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		
		return builder.toString();
		
	}
	
}
