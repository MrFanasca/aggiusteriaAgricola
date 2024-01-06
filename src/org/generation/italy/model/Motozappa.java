package org.generation.italy.model;

public class Motozappa extends Macchina {
	
	// ATTRIBUTI
	private int numeroRuote;
	
	// COSTRUTTORE
	public Motozappa(String marca, int numeroRuote) {
		super(marca);
		this.numeroRuote=numeroRuote;
	}

	@Override
	public String dettagli() {
		return "Motozappa:\n"+
				"\tNumero ordine: "+ numeroOrdine +"\n"+
				"\tMarca: "+ marca+"\n"+
				"\tNumero ruote: " + numeroRuote;
		// "\tCosto totale: "+ costoTotale;
	}

}
