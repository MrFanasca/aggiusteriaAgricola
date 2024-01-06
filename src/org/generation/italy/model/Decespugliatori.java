package org.generation.italy.model;

public class Decespugliatori extends Macchina {
	
	// ATTRIBUTI
	boolean accElettronica;
	
	// COSTRUTTORE
	public Decespugliatori(String marca, boolean accElettronica) {
		super(marca);
		this.accElettronica=accElettronica;
	}

	@Override
	public String dettagli() 	{
		return "Decespugliatore:\n"+
				"\tNumero ordine: "+ numeroOrdine +"\n"+
				"\tMarca: "+ marca;
		// "\tCosto totale: "+ costoTotale;
	}

}
