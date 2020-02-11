package br.com.volans.realsafe.driver.depository.structure;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import br.com.volans.realsafe.driver.base.structure.BasicStructure;

/**
 * Classe para armazenamento do dados do status do depositário.
 * 
 * @author Volans Informática Ltda.
 */

public class STSCIM extends BasicStructure<STSCIM> {
	
	/**
	 * Declaração das variáveis membro.
	 */

	public int nDevice;
	public int nSafeDoor;
	public int nAcceptor;
	public int nIntermediateStacker;
	public int nStackerItems;
	public int nBankNoteReader;
	public int nDevicePosition;
	public int nShutter;
	public int nNumCashUnit;

	/**
	 * Construtor default da classe
	 */
	
	public STSCIM() {
		super(Structure.ALIGN_NONE);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 */
	
	public STSCIM(Pointer pointer) {
		super(pointer, Structure.ALIGN_NONE);
	}
	
	/**
	 * Retorna a ordem da lista de campos
	 */
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"nDevice", 
			"nSafeDoor", 
			"nAcceptor", 
			"nIntermediateStacker", 
			"nStackerItems", 
			"nBankNoteReader", 
			"nDevicePosition",
			"nShutter",
			"nNumCashUnit"
		);
	}

}
