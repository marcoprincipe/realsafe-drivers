package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;

/**
 * DTO para armazenamento dos dados da estrutura CFGCIM.
 * 
 * @author Volans informática Ltda.
 */

public class CFGCIMDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = -127673800167336553L;
	
	/**
	 * Declaração das variáveis membro.
	 */

	private Integer code;
	private String description;
	public int nInterf;
	public int nFornecedor;
	public int nFabricante;
	public int nMaxDoc;
	public String szFirmware;
	
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
	 * @return the nInterf
	 */
	public int getnInterf() {
		return nInterf;
	}
	
	/**
	 * @param nInterf the nInterf to set
	 */
	public void setnInterf(int nInterf) {
		this.nInterf = nInterf;
	}
	
	/**
	 * @return the nFornecedor
	 */
	public int getnFornecedor() {
		return nFornecedor;
	}
	
	/**
	 * @param nFornecedor the nFornecedor to set
	 */
	public void setnFornecedor(int nFornecedor) {
		this.nFornecedor = nFornecedor;
	}
	
	/**
	 * @return the nFabricante
	 */
	public int getnFabricante() {
		return nFabricante;
	}
	
	/**
	 * @param nFabricante the nFabricante to set
	 */
	public void setnFabricante(int nFabricante) {
		this.nFabricante = nFabricante;
	}
	
	/**
	 * @return the nMaxDoc
	 */
	public int getnMaxDoc() {
		return nMaxDoc;
	}
	
	/**
	 * @param nMaxDoc the nMaxDoc to set
	 */
	public void setnMaxDoc(int nMaxDoc) {
		this.nMaxDoc = nMaxDoc;
	}
	
	/**
	 * @return the szFirmware
	 */
	public String getSzFirmware() {
		return szFirmware;
	}

	/**
	 * @param szFirmware the szFirmware to set
	 */
	public void setSzFirmware(String szFirmware) {
		this.szFirmware = szFirmware;
	}

	
	
	
}
