package br.com.volans.realsafe.driver.depository.library;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;

import br.com.volans.realsafe.driver.depository.structure.CFGCASHUNITSCIM;
import br.com.volans.realsafe.driver.depository.structure.CFGCIM;
import br.com.volans.realsafe.driver.depository.structure.STCASHUNITINFO;
import br.com.volans.realsafe.driver.depository.structure.STEXCHANGE;
import br.com.volans.realsafe.driver.depository.structure.STNOTENUMBER;
import br.com.volans.realsafe.driver.depository.structure.STSCIM;
import br.com.volans.realsafe.driver.depository.structure.STTRANSACTIONSTATUS;

/**
 * Interface JNA para utilização de um depositário via SGP.
 * 
 * @author Volans Informática Ltda.
 */

public interface SGPCIMLibrary extends Library {
	
	/**
	 * DeclaraÃ§Ã£o das variÃ¡veis membro
	 */
	
	SGPCIMLibrary INSTANCE = (SGPCIMLibrary) Native.load("SGPCIM", SGPCIMLibrary.class);
	
	/**
	 * Declaração dos métodos utilizados
	 */
	
    int SGP_OpenCIM();
    int SGP_CloseCIM();
    int SGP_StatusCIM(STSCIM pstStsCim, STCASHUNITINFO pstCashUnitInfo);
    int SGP_ResetCIM();
    int SGP_ReadConfigCIM(CFGCIM pstCfgCim);
    int SGP_CashInStartCIM();
    int SGP_CashInCIM(int nTimeout);
    int SGP_CashInEndCIM(IntByReference pnNumCashUnit, STCASHUNITINFO pstCashUnitInfo);
    int SGP_CashInRollBackCIM(int nTimeout);
    int SGP_TransactionStatusCIM(STTRANSACTIONSTATUS pstTransactionStatus,STNOTENUMBER pstNoteNumber);
    int SGP_RetractCashCIM();
    int SGP_ConfigureCashUnitsCIM(CFGCASHUNITSCIM pstCfgCashUnitsCim);
    int SGP_ExchangeCIM(STEXCHANGE pstExchange);
	int SGP_PresentRefusedItemCIM(int nTimeout);
	
}
