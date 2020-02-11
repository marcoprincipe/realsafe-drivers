package br.com.volans.realsafe.driver.depository.structure;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import br.com.volans.realsafe.driver.base.structure.BasicStructure;

/**
 * Classe para armazenamento do dados do status do cassete depositário.
 * 
 * @author Volans Informática Ltda.
 */

public class STCASHUNITINFO extends BasicStructure<STCASHUNITINFO> {
	
	/**
	 * Declaração das variáveis membro.
	 */

	public int nType = 0;
	public byte szUnitID[] = new byte[6];
	public byte szCurID[] = new byte[4];
	public int nValues = 0;
	public int nCount = 0;
	public int nStatus = 0;

	/**
	 * Construtor default da classe.
	 */
	
	public STCASHUNITINFO() {
		super(Structure.ALIGN_NONE);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 */
	
	public STCASHUNITINFO(Pointer pointer) {
		super(pointer, Structure.ALIGN_NONE);
	}
	
	/**
	 * Retorna a ordem da lista de campos
	 */
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"nType", 
			"szUnitID", 
			"szCurID", 
			"nValues", 
			"nCount", 
			"nStatus" 
		);
	}

}
