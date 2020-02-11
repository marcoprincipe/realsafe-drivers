package br.com.volans.realsafe.driver.depository.structure;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import br.com.volans.realsafe.driver.base.structure.BasicStructure;

/**
 * Classe para armazenamento dos dados de uma operação de abastecimento / recolhimento do módulo.
 * 
 * @author Volans Informática Ltda.
 */

public class STEXCHANGE extends BasicStructure<STEXCHANGE> {
	
	/**
	 * Declaração das variáveis membro.
	 */

	public int nCount;
	public int nStatus;
	
	/**
	 * Construtor default da classe
	 */
	
	public STEXCHANGE() {
		super(Structure.ALIGN_NONE);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 */
	
	public STEXCHANGE(Pointer pointer) {
		super(pointer, Structure.ALIGN_NONE);
	}
	
	/**
	 * Retorna a ordem da lista de campos
	 */
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"nCount", 
			"nStatus" 
		);
	}

}
