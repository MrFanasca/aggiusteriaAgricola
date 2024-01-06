package org.generation.italy;

import java.util.Scanner;

import org.generation.italy.model.Decespugliatori;
import org.generation.italy.model.Macchina;
import org.generation.italy.model.Motozappa;
import org.generation.italy.model.Officina;
import org.generation.italy.model.Tosaerba;

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
		
		String marca, tipologia, risposta;
		int nRuote;
		boolean accElettrica;
		
		Officina o = new Officina();
		Motozappa m;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Aggiungi la marca della macchina");
			marca=sc.nextLine();
			
			System.out.println("\nDi che tipologia fa parte la macchina da inserire? (D: decespugliatore/ M: motozappa/ T: tosaerba)");
			tipologia=sc.nextLine();

			switch (tipologia)	{
			
			case "M":
				System.out.println("\nInserire il numero di ruote");
				nRuote=Integer.parseInt(sc.nextLine());
				o.aggiungiLavoro(new Motozappa(marca, nRuote));
			break;
			
			case "T":
				System.out.println("\nInserire il numero di ruote");
				nRuote=Integer.parseInt(sc.nextLine());
				o.aggiungiLavoro(new Tosaerba(marca, nRuote));
			break;
			
			case "D":
				System.out.println("\nL'accenzione del mezzo è elettrica? (s/n)");
				risposta=sc.nextLine();
				
				if (risposta.equalsIgnoreCase("s"))	{
					
					accElettrica=true;
					o.aggiungiLavoro(new Decespugliatori(marca, accElettrica));
				}
				else if (risposta.equalsIgnoreCase("n"))	{
					
					accElettrica=false;
					o.aggiungiLavoro(new Decespugliatori(marca, accElettrica));
				}
				else 
					System.out.println("Risposta non valida");
			break;
			
			default:
				System.out.println("Opzione non valida");
			break;
			}
		
			System.out.println("Vuoi aggiungere altro? (s/n)");
			risposta=sc.nextLine();
			
		}	while(risposta.equals("s"));
		
		System.out.println("\n\nLista delle macchine in lavorazione");
		for (Macchina em: o.elencoLavorazioni())
			System.out.println(em.dettagli());
	}

}
