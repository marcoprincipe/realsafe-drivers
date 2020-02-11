package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;

/**
 * DTO para armazenamento dos dados da estrutura STEXCHANGE.
 * 
 * @author Volans informática Ltda.
 */

public class STEXCHANGEDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = -5748042827011967860L;
	
	/**
	 * Declaração das variáveis membro.
	 */

	private Integer code;
	private String description;
	public int nCount;
	public int nStatus;
	
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
	 * @return the nCount
	 */
	public int getnCount() {
		return nCount;
	}
	
	/**
	 * @param nCount the nCount to set
	 */
	public void setnCount(int nCount) {
		this.nCount = nCount;
	}
	
	/**
	 * @return the nStatus
	 */
	public int getnStatus() {
		return nStatus;
	}

	/**
	 * @param nStatus the nStatus to set
	 */
	public void setnStatus(int nStatus) {
		this.nStatus = nStatus;
	}
	
}
