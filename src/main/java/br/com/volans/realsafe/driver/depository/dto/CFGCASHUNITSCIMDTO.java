package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;

/**
 * Classe para armazenamento dos dados das configurações dos cassetes.
 * 
 * @author Volans Informática Ltda.
 */

public class CFGCASHUNITSCIMDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = -2110298871683989681L;
	
	/**
	 * Declaração das variáveis membro.
	 */

	private Integer code;
	private String description;
	public String szPositionName;
	public int nType;
	public int nItemType;
	public int nCDMType;
	public int nNoteIDs;
	
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
	 * @return the szPositionName
	 */
	public String getSzPositionName() {
		return szPositionName;
	}
	
	/**
	 * @param szPositionName the szPositionName to set
	 */
	public void setSzPositionName(String szPositionName) {
		this.szPositionName = szPositionName;
	}
	
	/**
	 * @return the nType
	 */
	public int getnType() {
		return nType;
	}
	
	/**
	 * @param nType the nType to set
	 */
	public void setnType(int nType) {
		this.nType = nType;
	}
	
	/**
	 * @return the nItemType
	 */
	public int getnItemType() {
		return nItemType;
	}
	
	/**
	 * @param nItemType the nItemType to set
	 */
	public void setnItemType(int nItemType) {
		this.nItemType = nItemType;
	}
	
	/**
	 * @return the nCDMType
	 */
	public int getnCDMType() {
		return nCDMType;
	}
	
	/**
	 * @param nCDMType the nCDMType to set
	 */
	public void setnCDMType(int nCDMType) {
		this.nCDMType = nCDMType;
	}
	
	/**
	 * @return the nNoteIDs
	 */
	public int getnNoteIDs() {
		return nNoteIDs;
	}

	/**
	 * @param nNoteIDs the nNoteIDs to set
	 */
	public void setnNoteIDs(int nNoteIDs) {
		this.nNoteIDs = nNoteIDs;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		
		builder.append("CFGCASHUNITSCIMDTO [code=");
		builder.append(code);
		builder.append(", description=");
		builder.append(description);
		builder.append(", szPositionName=");
		builder.append(szPositionName);
		builder.append(", nType=");
		builder.append(nType);
		builder.append(", nItemType=");
		builder.append(nItemType);
		builder.append(", nCDMType=");
		builder.append(nCDMType);
		builder.append(", nNoteIDs=");
		builder.append(nNoteIDs);
		builder.append("]");
		
		return builder.toString();
		
	}
	
}
