package com.msg.FridayProjectMSG;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Methods {

	public void ordoneazaJ7(List<Produs> objC) {

		Collections.sort(objC, new Comparator<Produs>() {

			@Override
			public int compare(Produs o1, Produs o2) {
				return Double.compare(o1.getPretFaraTVA(), o2.getPretFaraTVA());
			}
		});

	}

	public static void sortUsingJava8(List<Produs> ProdusList) {
		Consumer<String> con = System.out::println;

		// // using transmitere referinta
		// ToDoubleFunction<? super Produs> keyExtractor = Produs::getPretFaraTVA;
		// ProdusList.sort(Comparator.comparingDouble(keyExtractor));

		Collections.sort(ProdusList, (s1, s2) -> Double.compare(s1.getPretFaraTVA(), s2.getPretFaraTVA()));

	}

}
