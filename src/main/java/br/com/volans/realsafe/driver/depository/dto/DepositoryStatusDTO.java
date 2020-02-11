package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;

/**
 * DTO para armazenamento dos dados de status de depositários.
 * 
 * @author Volans Informática Ltda.
 */

public class DepositoryStatusDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = 8385186893494253620L;
	
	/**
	 * Declaração das variáveis membro.
	 */

	private Integer code;
	private String description;
	private STSCIMDTO stsCim; // Dados da estrutura STSCIM
	private STCASHUNITINFODTO stCashUnitInfo; // Dados da estrutura STCASHUNITINFO
	
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
	 * @return the stsCim
	 */
	public STSCIMDTO getStsCim() {
		
		if (stsCim == null) {
			stsCim = new STSCIMDTO();
		}
		
		return stsCim;
		
	}
	
	/**
	 * @param stsCim the stsCim to set
	 */
	public void setStsCim(STSCIMDTO stsCim) {
		this.stsCim = stsCim;
	}
	
	/**
	 * @return the stCashUnitInfo
	 */
	public STCASHUNITINFODTO getStCashUnitInfo() {
		
		if (stCashUnitInfo == null) {
			stCashUnitInfo = new STCASHUNITINFODTO();
		}
		
		return stCashUnitInfo;
		
	}

	/**
	 * @param stCashUnitInfo the stCashUnitInfo to set
	 */
	public void setStCashUnitInfo(STCASHUNITINFODTO stCashUnitInfo) {
		this.stCashUnitInfo = stCashUnitInfo;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		
		builder.append("DepositoryStatusDTO [code=");
		builder.append(code);
		builder.append(", description=");
		builder.append(description);
		builder.append(", stsCim=");
		builder.append(stsCim);
		builder.append(", stCashUnitInfo=");
		builder.append(stCashUnitInfo);
		builder.append("]");
		
		return builder.toString();
		
	}
	
}
