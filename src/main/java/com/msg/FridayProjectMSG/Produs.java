package com.msg.FridayProjectMSG;

public class Produs {
	protected String ID;
	protected String nume;
	protected double pretFaraTVA;
	protected TipProdus tip;

	public Produs(String iD, String nume, double pretFaraTVA, TipProdus tip) {
		super();
		this.ID = iD;
		this.nume = nume;
		this.pretFaraTVA = pretFaraTVA;
		this.tip = tip;
	};

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public double getPretFaraTVA() {
		return pretFaraTVA;
	}

	public void setPretFaraTVA(double pretFaraTVA) {
		this.pretFaraTVA = pretFaraTVA;
	}

	@Override
	public String toString() {
		return "Produs [ID=" + ID + ", nume=" + nume + ", pretFaraTVA=" + pretFaraTVA + " tip produse  " + tip + "] \n";
	}

}
