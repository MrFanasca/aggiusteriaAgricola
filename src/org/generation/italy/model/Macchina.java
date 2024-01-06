package org.generation.italy.model;

public abstract class Macchina {

	// ATTRIBUTI
	private static int nextNumeroOrdine=0;
	protected int numeroOrdine;
	protected String marca;
	protected Float costoTotale;
	
	// COSTRUTTORE
	public Macchina(String marca) {
		
		this.marca = marca;
		nextNumeroOrdine++;
		this.numeroOrdine=nextNumeroOrdine;
	}
	
	public abstract String dettagli ();
}
