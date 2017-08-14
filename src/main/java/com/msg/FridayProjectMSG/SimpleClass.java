package com.msg.FridayProjectMSG;

import java.util.function.ToDoubleBiFunction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.msg.FridayProjectMSG.Calculator.calculate;

public class SimpleClass implements ShowStuff {

	public static final Logger log = LogManager.getLogger();

	public static void main(String[] args) {
		Produs objProdus = null;
		CatalogProduse catProduse = new CatalogProduse();
		addToCatalog(catProduse);
		Methods objMetode = new Methods();
		Calculator objCalculate = new Calculator();

		// objMetode.ordoneazaJ7(catProduse.getCalculatoare());
		// objMetode.ordoneazaJ7(catProduse.getElectrocasnice());
		// objMetode.ordoneazaJ7(catProduse.getTelefoaneMobile());

		// objMetode.sortUsingJava8(catProduse.getCalculatoare());

		calculate RON = (a, b) -> a + a * b;
		System.out.println(objCalculate.operate(catProduse.getElectrocasnice().get(0).getPretFaraTVA(), 0.19, RON));

		calculate EURO = (a, b) -> a * 4.56 + a * 4.56 * b;

		ToDoubleBiFunction<Double, Double> i = (a, b) -> a + a * b;

		System.out.println(i.applyAsDouble(catProduse.getElectrocasnice().get(0).getPretFaraTVA(), 0.19));

		// catProduse.printAll();

		Sorter a = new Sorter();
		a.sortMethodUsingInterface(catProduse.getCalculatoare());

		ShowStuff.showIdandName("A", "intel");
	}

	public static void addToCatalog(CatalogProduse catalog) {

		catalog.addCalculatoare(new Produs("A", "intel", 100.2, TipProdus.Calculator));
		catalog.addCalculatoare(new Produs("B", "ibm", 1002.44, TipProdus.Calculator));
		catalog.addCalculatoare(new Produs("C", "apple", 133, TipProdus.Calculator));

		catalog.addElectrocasnice(new Produs("D", "zanussi", 444, TipProdus.Electrocasnic));
		catalog.addElectrocasnice(new Produs("E", "cora", 422.4, TipProdus.Electrocasnic));
		catalog.addElectrocasnice(new Produs("F", "mirana", 331.2, TipProdus.Electrocasnic));

		catalog.addTelefoaneMobile(new Produs("G", "nokia", 555, TipProdus.TelefonMobil));
		catalog.addTelefoaneMobile(new Produs("H", "samsung", 666.2, TipProdus.TelefonMobil));
		catalog.addTelefoaneMobile(new Produs("I", "siemens", 1030.2, TipProdus.TelefonMobil));

	}

}
