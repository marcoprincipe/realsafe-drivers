package br.com.volans.realsafe.driver.printer.structure;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import br.com.volans.realsafe.driver.base.structure.BasicStructure;

/**
 * Classe para armazenamento do dados de configuração de impressoras.
 * 
 * @author Volans Informática Ltda.
 */

public class CFGPRT extends BasicStructure<CFGPRT> {
	
	/**
	 * Declaração das variáveis membro
	 */

	public int nGuilhotina;
	public int nPresenter;
	public int nInterf;
	public int nColunas;
	public int nModelo;
	public int nFabricante;
	public int	nSensorSaida;

	/**
	 * Construtor default da classe.
	 */
	
	public CFGPRT() {
		super(Structure.ALIGN_NONE);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 */
	
	public CFGPRT(Pointer pointer) {
		super(pointer, Structure.ALIGN_NONE);
	}
	
	/**
	 * Retorna a ordem da lista de campos
	 */
	
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"nGuilhotina", 
			"nPresenter", 
			"nInterf", 
			"nColunas", 
			"nModelo", 
			"nFabricante", 
			"nSensorSaida"
		);
	}
	
}
