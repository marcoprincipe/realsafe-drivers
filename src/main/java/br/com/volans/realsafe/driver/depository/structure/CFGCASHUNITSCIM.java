package br.com.volans.realsafe.driver.depository.structure;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import br.com.volans.realsafe.driver.base.structure.BasicStructure;

/**
 * Classe para armazenamento dos dados das configurações dos cassetes.
 * 
 * @author Volans Informática Ltda.
 */

public class CFGCASHUNITSCIM extends BasicStructure<CFGCASHUNITSCIM> {
	
	/**
	 * Declaração das variáveis membro.
	 */

	public String szPositionName;
	public int nType;
	public int nItemType;
	public int nCDMType;
	public int nNoteIDs;
	
	/**
	 * Construtor default da classe.
	 */
	
	public CFGCASHUNITSCIM() {
		super(Structure.ALIGN_NONE);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 */
	
	public CFGCASHUNITSCIM(Pointer pointer) {
		super(pointer, Structure.ALIGN_NONE);
	}
	
	/**
	 * Retorna a ordem da lista de campos
	 */
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"szPositionName", 
			"nType", 
			"nItemType", 
			"nCDMType", 
			"nNoteIDs" 
		);
	}

}
