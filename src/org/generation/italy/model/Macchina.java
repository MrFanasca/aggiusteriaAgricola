package org.generation.italy.model;

public class Macchina {

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
	
	public String dettagli ()	{
		return "Macchina:\n"+
				"\tNumero ordine: "+ numeroOrdine +"\n"+
				"\tMarca: "+ marca;
				// "\tCosto totale: "+ costoTotale;
	}
}
