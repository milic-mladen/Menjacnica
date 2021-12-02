package model;

import java.util.ArrayList;

import main.Main;

public class KonverzijaValuta {
	private ArrayList<Valuta> listaValuta;

	public KonverzijaValuta() {
		super();
		this.listaValuta = new ArrayList<Valuta>();// kad napravimo objekatk u mainu napravice nam novu listu
	}

	// metoda za dodavanje valuta na listu
	public void dodajValutu(Valuta v) {
		if (v != null) {
			listaValuta.add(v);
		}
	}

	// uvecati stanje odredjenje valute u listi
	public void uvecajStanje(String naziv, double iznos) {
		if (iznos > 0) {
			for (Valuta valuta : listaValuta) {
				if (valuta.getNaziv().equals(naziv)) {
					valuta.setStanje(valuta.getStanje() + iznos);
				}
			}
		}
	}

	public void smanjiStanje(String naziv, double iznos) {
		if (iznos > 0) {
			for (Valuta valuta : listaValuta) {
				if (valuta.getNaziv().equals(naziv)) {
					if (valuta.getStanje() - iznos >= 0) {
						valuta.setStanje(valuta.getStanje() - iznos);
					}
				}
			}
		}
	}

	// provera da li imamo trazeni iznos u odrejdjenoj valuti na stanju ili ne
	public boolean proveriStanje(String naziv, double iznos) {
		boolean imaNaStanju = false;
		for (Valuta valuta : listaValuta) {
			if (valuta.getNaziv().equals(naziv)) {
				if (valuta.getStanje() >= iznos) {
					imaNaStanju = true;
				}
			}
		}
		return imaNaStanju;
	}

	public void prodajValutu(Valuta v, double iznos) {
		for (Valuta valuta : listaValuta) {
			if (valuta != null && valuta.equals(v)) {
				valuta.setStanje(valuta.getStanje() - iznos);
				Main.rsd += iznos*valuta.getProdajniKurs();
				System.out.println(valuta.getNaziv() + " prodato: " + iznos);
				System.out.println("Dinari uvecani za: " + iznos*valuta.getProdajniKurs());
			}
		}
	}
	public void kupiValutu(Valuta v, double iznos) {
		for (Valuta valuta : listaValuta) {
			if (valuta != null && valuta.equals(v)) {
				valuta.setStanje(valuta.getStanje() + iznos);
				Main.rsd -= iznos*valuta.getKupovniKurs();
				System.out.println(valuta.getNaziv() + " kupljeno: " + iznos);
				System.out.println("Dinari umanjeni za: " + iznos*valuta.getKupovniKurs());
			}
		}
	}
	@Override

	public String toString() {
		System.out.println("\n--------------------------------MENJACNICA------------------------------\n");
		for (Valuta valuta : listaValuta) {
			System.out.println(valuta);
	}
		return "Stanje dinara: "+main.Main.rsd+"\n";
	}
}