package model;

import java.util.ArrayList;

public class BankAccount {
	private static int nextID = 1;
	private ArrayList<Client> titulares; // max 4
	private ArrayList<Client> autorizados; // max 4
	private double saldo;
	private int IDcuenta; // número de cuenta generado
	
	// Constructores
	
	/**
	 * Constructor sobrecargado
	 * 
	 * Constructyor de una cuenta de un solo titular indicando
	 * @param titular 
	 * @param saldo
	 * */
	public BankAccount(Client titular, double saldo) {
		titulares = new ArrayList<>();
		titulares.add(titular);
		this.saldo = saldo;
		IDcuenta = nextID;
		nextID++;
	}
	
	public BankAccount(ArrayList<Client> titulares, double saldo) {
		titulares = new ArrayList<>();
		
		for(int i = 0; i < titulares.size(); i++) {
			this.titulares.add(titulares.get(i));
		}
		this.saldo = saldo;
		
		IDcuenta = nextID;
		nextID++;
	}
	
	public BankAccount(Client titular) {
		titulares = new ArrayList<>();
		titulares.add(titular);
		saldo = 0;
		
		IDcuenta = nextID;
		nextID++;
	}
	
	public BankAccount(ArrayList<Client> titulares) {
		titulares = new ArrayList<>();
		
		for(int i = 0; i < titulares.size(); i++) {
			this.titulares.add(titulares.get(i));
		}
		this.saldo = 0;
		
		IDcuenta = nextID;
		nextID++;
	}
}
