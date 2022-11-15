package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		/*
 		    Il programma dovrà chiedere all'utente il numero di chilometri che vuole percorrere e l'età del passeggero. 
 		    Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
 		    
			# il prezzo del biglietto è definito in base ai km (0.21 € al km)
			# va applicato uno sconto del 20% per i minorenni
			# va applicato uno sconto del 40% per gli over 65

			-------------------------------------
			
			BONUS1: i minori di 12 anni viaggiano gratis
			BONUS2: ogni km costa 1 centesimo piu' del precedente (es: 1km = 0.21E, 2km = 0.43, 3km = 0.66E, ecc)
		*/
		
	Scanner sc = new Scanner(System.in);
	
	// RACCOLGO DATI SU KM
	System.out.println("Quanti chilometri vuoi percorrere?");
	int customerKm = sc.nextInt();
	System.out.println("Vuoi percorrere " + customerKm + "km");
	
	// RACCOLGO DATI SU ETA'
	System.out.println("Quanti anni hai?");
	int customerAge = sc.nextInt();
	System.out.println("Hai " + customerAge + " anni");
	
	sc.close();
	
	double price = 0.21 * customerKm;
	
	// APPLICO EVENTUALI SCONTI
	if(customerAge < 12) {
		price = 0;
	}
	
	if (customerAge < 18) {
		double discount = price * 0.20;
		price = price - discount;
	}
	
	if (customerAge > 65) {
		double discount = price * 0.40;
		price = price - discount;
	}
	
	String finalPrice = String.format("%.02f", price);
	
	System.out.print("Il prezzo del biglietto è " + finalPrice + "€");

	}
}
