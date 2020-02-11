package br.com.volans.realsafe.driver.base.structure;

import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * Classe base para extensãoo das demais estruturas.
 * 
 * @author Volans Informática Ltda.
 */

public abstract class BasicStructure<T> extends Structure {
	
	/**
	 * Construtor default da classe 
	 */
	
	public BasicStructure() {
		super();
	}

	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param alignType - Tipo de alinhamento de bytes a ser utilizado.
	 */
	
	public BasicStructure(int alignType) {
		super(alignType);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 */
	
	public BasicStructure(Pointer pointer) {
		super(pointer);
	}
	
	/**
	 * Construtor alternativo da classe.
	 * 
	 * @param pointer - Ponteiro para os dados da estrutura.
	 * @param alignType - Tipo de alinhamento de bytes a ser utilizado.
	 */
	
	public BasicStructure(Pointer pointer, int alignType) {
		super(pointer, alignType);
	}

	/**
	 * Retorna o array de elementos.
	 * 
	 * @param size - Tamanho do array a ser retornado
	 */
	
	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> T[] getArray(int size) {
		
		T[] array = (T[]) super.toArray(size);
		
		return array;
	
	}
	
	/**
	 * Retorna a ordem da lista de campos
	 */
	
	@Override
	protected List<String> getFieldOrder() {
		return null;
	}

}
