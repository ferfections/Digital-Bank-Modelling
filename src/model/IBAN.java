package model;

import java.security.PublicKey;
import java.util.Locale.IsoCountryCode;

/**
 * La clase IBAN permite la identificación de una cuenta bancaria
 * International Bank Account Number
 * Codigo Internacional de Cuenta Bancaria
 * 
 * 24 dígitos en total.
 * 
 * 1 - Código del país (2 dígitos)
 * 2 - Dígitos de control del IBAN (2 dígitos)
 * 3 - Número de la cuenta bancaria (20 dígitos)
 * 		a - Código de la entidad bancaria (4 dígitos)
 * 		b - Código de la oficina (4 dígitos)
 * 		c - Dígitos de control (2 dígitos)
 * 		d - Numero de la cuenta (10 dígitos)
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
