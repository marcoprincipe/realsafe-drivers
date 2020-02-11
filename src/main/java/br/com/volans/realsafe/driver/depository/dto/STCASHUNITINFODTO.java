package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;

/**
 * DTO para armazenamento dos dados da estrutura STCASHUNITINNFO.
 * 
 * @author Volans informática Ltda.
 */

public class STCASHUNITINFODTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = 7891219231120740296L;
	
	/**
	 * Declaração das variáveis membro.
	 */

	public int nType;
	public String szUnitID;
	public String szCurID;
	public int nValues;
	public int nCount;
	public int nStatus;
	
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
	 * @return the szUnitID
	 */
	public String getSzUnitID() {
		return szUnitID;
	}
	
	/**
	 * @param szUnitID the szUnitID to set
	 */
	public void setSzUnitID(String szUnitID) {
		this.szUnitID = szUnitID;
	}
	
	/**
	 * @return the szCurID
	 */
	public String getSzCurID() {
		return szCurID;
	}
	
	/**
	 * @param szCurID the szCurID to set
	 */
	public void setSzCurID(String szCurID) {
		this.szCurID = szCurID;
	}
	
	/**
	 * @return the nValues
	 */
	public int getnValues() {
		return nValues;
	}
	
	/**
	 * @param nValues the nValues to set
	 */
	public void setnValues(int nValues) {
		this.nValues = nValues;
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
