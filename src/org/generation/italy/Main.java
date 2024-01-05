package org.generation.italy;

import java.util.Scanner;

import org.generation.italy.model.Macchina;
import org.generation.italy.model.Officina;

public class Main {

	public static void main(String[] args) {
		/*	All'aggiusteria agricola possono essere riparati tre tipi di apparecchiature: motozappe, decespugliatori, tosaerba. 
		 * 	Ciascuna di queste macchine, ha dei dati comuni.
		 * 	Un numero intero che costituisce il numero d'ordine della lavorazione, ogni volta che una macchina viene consegnata 
		 * 	all'aggiusteria acquisisce un nuovo numero d'ordine, anche se quella macchina è già stata lì in precedenza. Deve 
		 * 	essere specificata la marca dell'apparecchio. Ad ogni macchina deve essere associato il totale del costo di 
		 * 	riparazione. Per i tosaerba e le motozappe va specificato il numero di ruote della macchina.
		 * 	Per i decespugliatori bisogna specificare se l'accensione è elettronica oppure no.
		 * 	Costruire una opportuna gerarchia di classi, strutturando correttamente la base dei dati.
		 * 	Il massimo numero di macchine che possonono essere simultaneamente in lavorazione è 10 perché questi sono i posti in 
		 * 	officina. Ad ogni macchina riparata, deve essere associata una lista delle lavorazioni effettuate e del loro costo, 
		 * 	la cui somma costituisce il totale del costo della riparazione	*/
		
		String risposta;
		
		Officina o = new Officina();
		Macchina m;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Aggiungi la marca di una macchina");
			risposta=sc.nextLine();
		
			
			if(o.aggiungiLavoro(new Macchina(risposta)))
				System.out.println("elemento aggiunto");
		
			System.out.println("Vuoi aggiungere altro? (s/n)");
			risposta=sc.nextLine();
			
		}	while(risposta.equals("s"));
		
		System.out.println("\n\nLista delle macchine in lavorazione");
		for (Macchina em: o.elencoLavorazioni())
			System.out.println(em.dettagli());
	}

}
