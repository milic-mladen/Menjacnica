package model;

public class Valuta {
	private String naziv;
	private double prodajniKurs, srednjiKurs, kupovniKurs, stanje;

	public Valuta(String naziv, double prodajniKurs, double srednjiKurs, double kupovniKurs, double stanje) {
		super();
		this.naziv = naziv;
		this.prodajniKurs = prodajniKurs;
		this.srednjiKurs = srednjiKurs;
		this.kupovniKurs = kupovniKurs;
		this.stanje = stanje;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}

	public double getStanje() {
		return stanje;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Valuta) {
			if (((Valuta) obj).getNaziv() == naziv) {
				return true;
			}
		}
		return false;
	}

	public void setStanje(double stanje) {
		this.stanje = stanje;
	}

	@Override
	public String toString() {
		return "Valuta: " + naziv + ", prodajni kurs:" + prodajniKurs + ", srednji kurs:" + srednjiKurs
				+ ", kupovni kurs:" + kupovniKurs + ", stanje:" + stanje;
	}

}
