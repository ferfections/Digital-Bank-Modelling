package model;

import java.security.PublicKey;
import java.util.Locale.IsoCountryCode;

/**
 * La clase IBAN permite la identificaci�n de una cuenta bancaria
 * International Bank Account Number
 * Codigo Internacional de Cuenta Bancaria
 * 
 * 24 d�gitos en total.
 * 
 * 1 - C�digo del pa�s (2 d�gitos)
 * 2 - D�gitos de control del IBAN (2 d�gitos)
 * 3 - N�mero de la cuenta bancaria (20 d�gitos)
 * 		a - C�digo de la entidad bancaria (4 d�gitos)
 * 		b - C�digo de la oficina (4 d�gitos)
 * 		c - D�gitos de control (2 d�gitos)
 * 		d - Numero de la cuenta (10 d�gitos)
 * 
 * */
public class IBAN {
	private CountryCode countryCode; // ISO 3166-1 alpha2-two letters
	private String bankCode;
	private String branchCode;
	private String accountNumber;
	
	public IBAN(String countryC, String bankC, String branchC, String accountN) {
		countryCode = countryC;
		bankCode = bankC;
		branchCode = branchC;
		accountNumber = accountN;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	
	public String getBankCode() {
		return bankCode;
	}
	
	public String getBranchCode() {
		return branchCode;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getIBAN() {
		return countryCode + bankCode + branchCode + accountNumber;
	}
	
	public String readableIBAN() {
		return 
	}
}
