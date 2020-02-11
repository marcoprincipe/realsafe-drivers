package br.com.volans.realsafe.driver.depository.dto;

import java.io.Serializable;

/**
 * DTO para armazenamento dos dados da estrutura STSCIM.
 * 
 * @author Volans informática Ltda.
 */

public class STSCIMDTO implements Serializable {

	/**
	 * Declaração da serial version
	 */
	
	private static final long serialVersionUID = -4061090305052355980L;
	
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
	 * @return the nDevice
	 */
	public int getnDevice() {
		return nDevice;
	}
	
	/**
	 * @param nDevice the nDevice to set
	 */
	public void setnDevice(int nDevice) {
		this.nDevice = nDevice;
	}
	
	/**
	 * @return the nSafeDoor
	 */
	public int getnSafeDoor() {
		return nSafeDoor;
	}
	
	/**
	 * @param nSafeDoor the nSafeDoor to set
	 */
	public void setnSafeDoor(int nSafeDoor) {
		this.nSafeDoor = nSafeDoor;
	}
	
	/**
	 * @return the nAcceptor
	 */
	public int getnAcceptor() {
		return nAcceptor;
	}
	
	/**
	 * @param nAcceptor the nAcceptor to set
	 */
	public void setnAcceptor(int nAcceptor) {
		this.nAcceptor = nAcceptor;
	}
	
	/**
	 * @return the nIntermediateStacker
	 */
	public int getnIntermediateStacker() {
		return nIntermediateStacker;
	}
	
	/**
	 * @param nIntermediateStacker the nIntermediateStacker to set
	 */
	public void setnIntermediateStacker(int nIntermediateStacker) {
		this.nIntermediateStacker = nIntermediateStacker;
	}
	
	/**
	 * @return the nStackerItems
	 */
	public int getnStackerItems() {
		return nStackerItems;
	}
	
	/**
	 * @param nStackerItems the nStackerItems to set
	 */
	public void setnStackerItems(int nStackerItems) {
		this.nStackerItems = nStackerItems;
	}
	
	/**
	 * @return the nBankNoteReader
	 */
	public int getnBankNoteReader() {
		return nBankNoteReader;
	}
	
	/**
	 * @param nBankNoteReader the nBankNoteReader to set
	 */
	public void setnBankNoteReader(int nBankNoteReader) {
		this.nBankNoteReader = nBankNoteReader;
	}
	
	/**
	 * @return the nDevicePosition
	 */
	public int getnDevicePosition() {
		return nDevicePosition;
	}
	
	/**
	 * @param nDevicePosition the nDevicePosition to set
	 */
	public void setnDevicePosition(int nDevicePosition) {
		this.nDevicePosition = nDevicePosition;
	}
	
	/**
	 * @return the nShutter
	 */
	public int getnShutter() {
		return nShutter;
	}
	
	/**
	 * @param nShutter the nShutter to set
	 */
	public void setnShutter(int nShutter) {
		this.nShutter = nShutter;
	}
	
	/**
	 * @return the nNumCashUnit
	 */
	public int getnNumCashUnit() {
		return nNumCashUnit;
	}

	/**
	 * @param nNumCashUnit the nNumCashUnit to set
	 */
	public void setnNumCashUnit(int nNumCashUnit) {
		this.nNumCashUnit = nNumCashUnit;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		
		builder.append("STSCIMDTO [nDevice=");
		builder.append(nDevice);
		builder.append(", nSafeDoor=");
		builder.append(nSafeDoor);
		builder.append(", nAcceptor=");
		builder.append(nAcceptor);
		builder.append(", nIntermediateStacker=");
		builder.append(nIntermediateStacker);
		builder.append(", nStackerItems=");
		builder.append(nStackerItems);
		builder.append(", nBankNoteReader=");
		builder.append(nBankNoteReader);
		builder.append(", nDevicePosition=");
		builder.append(nDevicePosition);
		builder.append(", nShutter=");
		builder.append(nShutter);
		builder.append(", nNumCashUnit=");
		builder.append(nNumCashUnit);
		builder.append("]");
		
		return builder.toString();
		
	}
	
}
