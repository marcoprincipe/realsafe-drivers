package br.com.volans.realsafe.driver.depository.structure;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import br.com.volans.realsafe.driver.base.structure.BasicStructure;

/**
 * Classe para armazenamento do dados da configuração depositário.
 * 
 * @author Volans Informática Ltda.
 */

public class CFGCIM extends BasicStructure<CFGCIM> {
	
	/**
	 * Declaração das variáveis membro.
	 */

	public int nInterf;
	public int nFornecedor;
	public int nFabricante;
	public int nMaxDoc;
	public String szFirmware;
	
	/**
	 * Construtor default da classe.
	 */
	
	public CFGCIM() {
		super(Structure.ALIGN_NONE);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 */
	
	public CFGCIM(Pointer pointer) {
		super(pointer, Structure.ALIGN_NONE);
	}
	
	/**
	 * Retorna a ordem da lista de campos
	 */
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"nInterf", 
			"nFornecedor", 
			"nFabricante", 
			"nMaxDoc", 
			"szFirmware" 
		);
	}

}
