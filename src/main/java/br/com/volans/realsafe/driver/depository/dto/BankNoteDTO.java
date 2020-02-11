package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO para armazenamento dos dados de cédulas.
 * 
 * @author Volans Informática Ltda.
 */

public class BankNoteDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = -7243216257722666310L;
	
	/**
	 * Declaração das variáveis membro.
	 */

	private Integer quantity;
	private BigDecimal value;
	private BigDecimal total;
	
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * @return the value
	 */
	public BigDecimal getValue() {
		return value;
	}
	
	/**
	 * @param value the value to set
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		
		builder.append("BankNoteDTO [quantity=");
		builder.append(quantity);
		builder.append(", value=");
		builder.append(value);
		builder.append(", total=");
		builder.append(total);
		builder.append("]");
		
		return builder.toString();
		
	}
	
}
