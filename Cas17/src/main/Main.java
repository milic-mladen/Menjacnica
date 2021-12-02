package main;

import model.KonverzijaValuta;
import model.Valuta;

public class Main {

	public static double rsd = 300000;

	public static void main(String[] args) {
		Valuta eur = new Valuta("EUR", 118, 117, 116, 5000);
		Valuta chf = new Valuta("CHF", 110, 107, 105, 3000);
		Valuta usd = new Valuta("USD", 102, 101, 100, 2000);

		KonverzijaValuta konverzija = new KonverzijaValuta();
		konverzija.dodajValutu(eur);
		konverzija.dodajValutu(chf);
		konverzija.dodajValutu(usd);
		
		System.out.println(konverzija);
		konverzija.uvecajStanje("EUR", 5000);
		System.out.println(konverzija);
		konverzija.smanjiStanje("CHF", 2000);
		System.out.println(konverzija);
		
		System.out.println(konverzija.proveriStanje("USD", 2000));
		// domaci
		konverzija.prodajValutu(eur, 200);
		System.out.println(konverzija);
		konverzija.kupiValutu(usd, 200);
		System.out.println(konverzija);

	}
}
