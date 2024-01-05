package org.generation.italy.model;

import java.util.ArrayList;

public class Officina {
	
	ArrayList <Macchina> lavorazioniOfficina = new ArrayList<Macchina>();
	
	public boolean aggiungiLavoro (Macchina macchina)	{
		
		boolean esito=false;
		int i=lavorazioniOfficina.size();
		if (i!=10)	{
			lavorazioniOfficina.add(macchina);
			esito=true;
		}
		return esito;
	}
	
	public Iterable<Macchina> elencoLavorazioni ()	{
	
		return lavorazioniOfficina;
	}
}
