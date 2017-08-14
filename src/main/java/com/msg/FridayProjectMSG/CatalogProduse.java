package com.msg.FridayProjectMSG;

import java.util.ArrayList;

public class CatalogProduse implements SortUtil {

	private ArrayList<Produs> electrocasnice = new ArrayList<>();
	private ArrayList<Produs> telefoaneMobile = new ArrayList<>();
	private ArrayList<Produs> calculatoare = new ArrayList<>();

	public void addElectrocasnice(Produs a) {
		electrocasnice.add(a);
	}

	public void addTelefoaneMobile(Produs a) {
		telefoaneMobile.add(a);
	}

	public void addCalculatoare(Produs a) {
		calculatoare.add(a);
	}

	public ArrayList<Produs> getElectrocasnice() {
		return electrocasnice;
	}

	public void setElectrocasnice(ArrayList<Produs> electrocasnice) {
		this.electrocasnice = electrocasnice;
	}

	public ArrayList<Produs> getTelefoaneMobile() {
		return telefoaneMobile;
	}

	public void setTelefoaneMobile(ArrayList<Produs> telefoaneMobile) {
		this.telefoaneMobile = telefoaneMobile;
	}

	public ArrayList<Produs> getCalculatoare() {
		return calculatoare;
	}

	public void setCalculatoare(ArrayList<Produs> calculatoare) {
		this.calculatoare = calculatoare;
	}

	public void printAll() {
		printElectrocasnice();
		printTelfoaneMobile();
		printCalculatoare();

	}

	private void printCalculatoare() {
		electrocasnice.forEach(SimpleClass.log::trace);
	}

	private void printTelfoaneMobile() {
		telefoaneMobile.forEach(SimpleClass.log::trace);

	}

	private void printElectrocasnice() {
		calculatoare.forEach(SimpleClass.log::trace);

	}

}
