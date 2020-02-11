package br.com.volans.realsafe.driver.depository.structure;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import br.com.volans.realsafe.driver.base.structure.BasicStructure;

/**
 * Classe para armazenamento dos dados do status de uma transação de depósito.
 * 
 * @author Volans Informática Ltda.
 */

public class STTRANSACTIONSTATUS extends BasicStructure<STTRANSACTIONSTATUS> {
	
	/**
	 * Declaração das variáveis membro.
	 */

	public int nCashInTransaction;
	public int nTotalAccepted;
	public int nTotalRefused;
	public int nNumNoteNumbers;
	
	/**
	 * Construtor default da classe.
	 */
	
	public STTRANSACTIONSTATUS() {
		super(Structure.ALIGN_NONE);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 */
	
	public STTRANSACTIONSTATUS(Pointer pointer) {
		super(pointer, Structure.ALIGN_NONE);
	}
	
	/**
	 * Retorna a ordem da lista de campos
	 */
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"nCashInTransaction", 
			"nTotalAccepted", 
			"nTotalRefused", 
			"nNumNoteNumbers" 
		);
	}

}
