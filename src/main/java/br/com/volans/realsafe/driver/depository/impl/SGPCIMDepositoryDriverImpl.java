package br.com.volans.realsafe.driver.depository.impl;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.sun.jna.ptr.IntByReference;

import br.com.volans.realsafe.driver.depository.DepositoryDriver;
import br.com.volans.realsafe.driver.depository.dto.BankNoteDTO;
import br.com.volans.realsafe.driver.depository.dto.CFGCASHUNITSCIMDTO;
import br.com.volans.realsafe.driver.depository.dto.CFGCIMDTO;
import br.com.volans.realsafe.driver.depository.dto.DepositoryCountDTO;
import br.com.volans.realsafe.driver.depository.dto.DepositoryStatusDTO;
import br.com.volans.realsafe.driver.depository.dto.STEXCHANGEDTO;
import br.com.volans.realsafe.driver.depository.dto.TransactionStatusDTO;
import br.com.volans.realsafe.driver.depository.exception.DepositoryException;
import br.com.volans.realsafe.driver.depository.library.SGPCIMLibrary;
import br.com.volans.realsafe.driver.depository.structure.CFGCASHUNITSCIM;
import br.com.volans.realsafe.driver.depository.structure.CFGCIM;
import br.com.volans.realsafe.driver.depository.structure.STCASHUNITINFO;
import br.com.volans.realsafe.driver.depository.structure.STEXCHANGE;
import br.com.volans.realsafe.driver.depository.structure.STNOTENUMBER;
import br.com.volans.realsafe.driver.depository.structure.STSCIM;
import br.com.volans.realsafe.driver.depository.structure.STTRANSACTIONSTATUS;

/**
 * Implementa��o da interface para deposit�rios via SGP.
 * 
 * @author Volans Inform�tica Ltda
 */

@Component("SGPCIMDepositoryDriver")
public class SGPCIMDepositoryDriverImpl implements DepositoryDriver {
	
	/**
	 * Declara��o das constantes da classe.
	 */
	
	private static final int INITIAL_ARRAY_SIZE = 20;
	
	/**
	 * Efetua a abertura do deposit�rio para utiliza��o.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public int open() throws DepositoryException {
		
		int result = SGPCIMLibrary.INSTANCE.SGP_OpenCIM();
		
		return result;
		
	}
	
	/**
	 * Efetua a finaliza��o da impressora.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public int close() throws DepositoryException {
		
		int result = SGPCIMLibrary.INSTANCE.SGP_CloseCIM();
		
		return result;
		
	}
	
	/**
	 * Retorna o status do deposit�rio.
	 * 
	 * @return - DTO com o status do deposit�rio. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public DepositoryStatusDTO getStatus() throws DepositoryException {
		
		STSCIM pstStsCim = new STSCIM();
		STCASHUNITINFO pstCashUnitInfo = new STCASHUNITINFO();
		
		Integer code = SGPCIMLibrary.INSTANCE.SGP_StatusCIM(pstStsCim, pstCashUnitInfo);

		DepositoryStatusDTO result = new DepositoryStatusDTO();
		
		result.setCode(code);
		
		result.getStsCim().setnAcceptor(pstStsCim.nAcceptor);
		result.getStsCim().setnBankNoteReader(pstStsCim.nBankNoteReader);
		result.getStsCim().setnDevice(pstStsCim.nDevice);
		result.getStsCim().setnDevicePosition(pstStsCim.nDevicePosition);
		result.getStsCim().setnIntermediateStacker(pstStsCim.nIntermediateStacker);
		result.getStsCim().setnNumCashUnit(pstStsCim.nNumCashUnit);
		result.getStsCim().setnSafeDoor(pstStsCim.nSafeDoor);
		result.getStsCim().setnShutter(pstStsCim.nShutter);
		result.getStsCim().setnStackerItems(pstStsCim.nStackerItems);
		
		result.getStCashUnitInfo().setnCount(pstCashUnitInfo.nCount);
		result.getStCashUnitInfo().setnStatus(pstCashUnitInfo.nStatus);
		result.getStCashUnitInfo().setnType(pstCashUnitInfo.nType);
		result.getStCashUnitInfo().setnValues(pstCashUnitInfo.nValues);
		result.getStCashUnitInfo().setSzCurID(new String(pstCashUnitInfo.szCurID));
		result.getStCashUnitInfo().setSzUnitID(new String(pstCashUnitInfo.szUnitID));
		
		return result;
		
	}
	
	/**
	 * Efetua a o reset do deposit�rio.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public int reset() throws DepositoryException {
		
		int result = SGPCIMLibrary.INSTANCE.SGP_ResetCIM();
		
		return result;
		
	}
	
	/**
	 * Retorna a configura��o do deposit�rio.
	 * 
	 * @return - DTO com os dados da configura��o do deposit�rio. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public CFGCIMDTO getConfig() throws DepositoryException {
		
		CFGCIM pstCfgCim = new CFGCIM();
		
		int code = SGPCIMLibrary.INSTANCE.SGP_ReadConfigCIM(pstCfgCim);
		
		CFGCIMDTO result = new CFGCIMDTO();
		
		result.setCode(code);
		result.setnFabricante(pstCfgCim.nFabricante);
		result.setnFornecedor(pstCfgCim.nFornecedor);
		result.setnInterf(pstCfgCim.nInterf);
		result.setnMaxDoc(pstCfgCim.nMaxDoc);
		result.setSzFirmware(pstCfgCim.szFirmware);
		
		return result;
		
	}
	
	/**
	 * Inicia uma transa��o de dep�sito em dinheiro.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public int startDeposit() throws DepositoryException {
		
		int result = SGPCIMLibrary.INSTANCE.SGP_CashInStartCIM();
		
		return result;
		
	}
	
	/**
	 * Permite a entrada das notas no dispositivo.
	 * 
	 * @param timeout - Tempo m�ximo em milisegundos para aguardar pela entrada das notas.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public int deposit(int timeout) throws DepositoryException {
		
		int result = SGPCIMLibrary.INSTANCE.SGP_CashInCIM(timeout);
		
		return result;
		
	}
	
	/**
	 * Encerra uma transa��o de dep�sito em dinheiro.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public DepositoryCountDTO endDeposit() throws DepositoryException {
		
		IntByReference pnNumCashUnit = new IntByReference(); 
		
		STCASHUNITINFO pstCashUnitInfo[] = (STCASHUNITINFO[]) (new STCASHUNITINFO()).toArray(INITIAL_ARRAY_SIZE);
				
		int status = SGPCIMLibrary.INSTANCE.SGP_CashInEndCIM(pnNumCashUnit, pstCashUnitInfo[0]);
		
		int occurs = pnNumCashUnit.getValue();
		
		DepositoryCountDTO result = new DepositoryCountDTO();
		
		result.setStatus(status);
		result.setBankNotes(new ArrayList<BankNoteDTO>());
		result.setAmount(BigDecimal.ZERO);
		
		for (int index = 0; index < occurs; index++) {
			
			STCASHUNITINFO item = pstCashUnitInfo[index];
			
			System.out.println(String.format("nType    : %d", item.nType));
			System.out.println(String.format("szCurID  : %s", new String(item.szCurID)));
			System.out.println(String.format("szUnitID : %s", new String(item.szUnitID)));
			System.out.println(String.format("nCount   : %d", item.nCount));
			System.out.println(String.format("nValues  : %d", item.nValues));
			System.out.println(String.format("nStatus  : %d", item.nStatus));
			
			BankNoteDTO bankNoteDTO = new BankNoteDTO();
			
			bankNoteDTO.setQuantity(item.nCount);
			bankNoteDTO.setValue(new BigDecimal(item.nValues));
			bankNoteDTO.setTotal(new BigDecimal(item.nCount * item.nValues));
			
			result.setAmount(result.getAmount().add(bankNoteDTO.getTotal()));
			
			result.getBankNotes().add(bankNoteDTO);
			
		}
		
		return result;
		
	}
	
	/**
	 * Efetua o rollback de uma transa��o de dep�sito.
	 * 
	 * @param timeout - Tempo m�ximo em milisegundos para aguardar pela retirada das notas.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public int rollback(int timeout) throws DepositoryException {
		
		int result = SGPCIMLibrary.INSTANCE.SGP_CashInRollBackCIM(timeout);
		
		return result;
		
	}
	
	/**
	 * Retorna o status de uma transa��o do deposit�rio.
	 * 
	 * @param pstTransactionStatus - Ponteiro para a estrutura STTRANSACTIONSTATUS.
	 * @param pstNoteNumber - Ponteiro para a estrutura STNOTENUMBER.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public TransactionStatusDTO getTransactionStatus() throws DepositoryException {
		
		STTRANSACTIONSTATUS pstTransactionStatus = new STTRANSACTIONSTATUS();
		STNOTENUMBER pstNoteNumber = new STNOTENUMBER();
		
		int code = SGPCIMLibrary.INSTANCE.SGP_TransactionStatusCIM(pstTransactionStatus, pstNoteNumber);
		
		TransactionStatusDTO result = new TransactionStatusDTO();
		
		result.setCode(code);
		result.getStTransactionStatus().setnCashInTransaction(pstTransactionStatus.nCashInTransaction);
		result.getStTransactionStatus().setnNumNoteNumbers(pstTransactionStatus.nNumNoteNumbers);
		result.getStTransactionStatus().setnTotalAccepted(pstTransactionStatus.nTotalAccepted);
		result.getStTransactionStatus().setnTotalRefused(pstTransactionStatus.nTotalRefused);
		
		result.getStNoteNumber().setSzCurID(pstNoteNumber.szCurID);
		result.getStNoteNumber().setUlCount(pstNoteNumber.ulCount);
		result.getStNoteNumber().setUsNoteID(pstNoteNumber.usNoteID);
		
		return result;
		
	}
	
	/**
	 * Efetua o recolhimento de uma c�dula recusada e n�o retirada pelo cliente.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public int retract() throws DepositoryException {
		
		int result = SGPCIMLibrary.INSTANCE.SGP_RetractCashCIM();
		
		return result;
		
	}
	
	/**
	 * Efetua a configura��o dos cassetes do deposit�rio.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public CFGCASHUNITSCIMDTO configCashUnits() throws DepositoryException {

		CFGCASHUNITSCIM pstCfgCashUnitsCim = new CFGCASHUNITSCIM();
		
		int code = SGPCIMLibrary.INSTANCE.SGP_ConfigureCashUnitsCIM(pstCfgCashUnitsCim);
		
		CFGCASHUNITSCIMDTO result = new CFGCASHUNITSCIMDTO();
		
		result.setCode(code);
		result.setnCDMType(pstCfgCashUnitsCim.nCDMType);
		result.setnItemType(pstCfgCashUnitsCim.nItemType);
		result.setnNoteIDs(pstCfgCashUnitsCim.nNoteIDs);
		result.setnType(pstCfgCashUnitsCim.nType);
		result.setSzPositionName(pstCfgCashUnitsCim.szPositionName);
		
		return result;
		
	}
	
	/**
	 * Inicia o abastecimento / recolhimento do deposit�rio.
	 * 
	 * @param pstCfgCashUnitsCim - Ponteiro para a estrutura STEXCHANGE.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public STEXCHANGEDTO exchange() throws DepositoryException {
		
		STEXCHANGE pstExchange = new STEXCHANGE();
		
		int code = SGPCIMLibrary.INSTANCE.SGP_ExchangeCIM(pstExchange);
		
		STEXCHANGEDTO result = new STEXCHANGEDTO();
		
		result.setCode(code);
		result.setnCount(pstExchange.nCount);
		result.setnStatus(pstExchange.nStatus);
		
		return result;
		
	}
	
	/**
	 * Retorna para o cliente as notas recusadas.
	 * 
	 * @param timeout - Tempo m�ximo em milisegundos para aguardar pela retirada das notas.
	 * 
	 * @return - Resultado da opera��o. 
	 * 
	 * @throws DepositoryException - Exce��o do deposit�rio.
	 */
	
	@Override
	public int returnRefused(int timeout) throws DepositoryException {
		
		int result = SGPCIMLibrary.INSTANCE.SGP_PresentRefusedItemCIM(timeout);
		
		return result;
		
	}

}
