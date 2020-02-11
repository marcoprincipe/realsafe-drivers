package br.com.volans.realsafe.driver.depository.structure;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import br.com.volans.realsafe.driver.base.structure.BasicStructure;

/**
 * Classe para armazenamento dos dados das notas de uma transação de depósito.
 * 
 * @author Volans Informática Ltda.
 */

public class STNOTENUMBER extends BasicStructure<STNOTENUMBER> {
	
	/**
	 * Declaração das variáveis membro.
	 */

    public int usNoteID;
    public int ulCount;
	public String szCurID;
	
	/**
	 * Construtor default da classe.
	 */
	
	public STNOTENUMBER() {
		super(Structure.ALIGN_NONE);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 */
	
	public STNOTENUMBER(Pointer pointer) {
		super(pointer, Structure.ALIGN_NONE);
	}
	
	/**
	 * Retorna a ordem da lista de campos
	 */
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"usNoteID", 
			"ulCount", 
			"szCurID" 
		);
	}

}
