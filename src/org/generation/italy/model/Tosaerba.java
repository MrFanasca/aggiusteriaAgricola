package org.generation.italy.model;

public class Tosaerba extends Macchina {

	// ATTRIBUTI
	private int numeroRuote;
	
	// COSTRUTTORE	
	public Tosaerba(String marca, int numeroRuote) {
		super(marca);
		this.numeroRuote=numeroRuote;
	}

	@Override
	public String dettagli() {
		return "Tosaerba:\n"+
				"\tNumero ordine: "+ numeroOrdine +"\n"+
				"\tMarca: "+ marca+"\n"+
				"\tNumero ruote: " + numeroRuote;
		// "\tCosto totale: "+ costoTotale;
	}

}
