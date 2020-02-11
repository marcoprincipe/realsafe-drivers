package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;

/**
 * Classe para armazenamento dos dados das notas de uma transação de depósito.
 * 
 * @author Volans Informática Ltda.
 */

public class STNOTENUMBERDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = -8171251686683657391L;
	
	/**
	 * Declaração das variáveis membro.
	 */

    public int usNoteID;
    public int ulCount;
	public String szCurID;
	
	/**
	 * @return the usNoteID
	 */
	public int getUsNoteID() {
		return usNoteID;
	}
	
	/**
	 * @param usNoteID the usNoteID to set
	 */
	public void setUsNoteID(int usNoteID) {
		this.usNoteID = usNoteID;
	}
	
	/**
	 * @return the ulCount
	 */
	public int getUlCount() {
		return ulCount;
	}
	
	/**
	 * @param ulCount the ulCount to set
	 */
	public void setUlCount(int ulCount) {
		this.ulCount = ulCount;
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

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		
		builder.append("STNOTENUMBERDTO [usNoteID=");
		builder.append(usNoteID);
		builder.append(", ulCount=");
		builder.append(ulCount);
		builder.append(", szCurID=");
		builder.append(szCurID);
		builder.append("]");
		
		return builder.toString();
		
	}
	
}
