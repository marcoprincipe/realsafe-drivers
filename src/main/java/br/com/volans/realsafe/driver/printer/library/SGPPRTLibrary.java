package br.com.volans.realsafe.driver.printer.library;

import com.sun.jna.Library;
import com.sun.jna.Native;

import br.com.volans.realsafe.driver.printer.structure.CFGPRT;

/**
 * Integererface JNA para utiliza��o de impressoras via SGP.
 * 
 * @author Volans Inform�tica Ltda.
 */

public interface SGPPRTLibrary extends Library {
	
	/**
	 * Declara��o das vari�veis membro
	 */
	
	SGPPRTLibrary INSTANCE = (SGPPRTLibrary) Native.load("SGPPRT", SGPPRTLibrary.class);
	
	/**
	 * Declara��o dos m�todos utilizados
	 */

	int SGP_AbrePRT();
	int SGP_PicotaPRT();
	int SGP_StatusPRT();
	int SGP_ProgramaPRT(int nCfg);
	int SGP_ImprimePRT(byte[] pszBuffer, int nTamBuffer);
	int SGP_SaltaLinhasPRT(int nLinhas);
	int SGP_ImprimeBmpPRT(byte[] pszBuffer, int nPosicao);
	int SGP_LeConfigPRT(CFGPRT pstCfgPRT);
	int SGP_FechaPRT();
	
}
