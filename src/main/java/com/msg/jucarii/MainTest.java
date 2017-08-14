package com.msg.jucarii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class MainTest {
	public static void main(String[] args) {

		List<String> listOfStrings = new ArrayList<>();
		List<Integer> listOfIntegers = new ArrayList<>();

		listOfIntegers.add(2);
		listOfIntegers.add(23);
		listOfIntegers.add(2222);
		listOfIntegers.add(0);

		listOfStrings.add("pere");
		listOfStrings.add("ana");
		listOfStrings.add("are");
		listOfStrings.add("mere");

		// sortUsingJava7(listOfStrings);
		// System.out.println(listOfStrings);

		// MathOperation math = (a, b) -> a - b;
		// System.out.println(math.operation(3, 4));

		// greetingMessage greetService = message -> System.out.println(message);
		// greetService.sayHello("ana are mere");

		// listOfStrings.forEach(System.out::println);

		// System.out.println(eval(listOfStrings, n -> true));
		// System.out.println(eval(listOfIntegers, n -> n > 3));
		// System.out.println(message.sayHello("mere"));

		// sortUsingJava8(listOfStrings);
		// System.out.println(listOfStrings);

		vehicule objVehicule = new Car();
		objVehicule.print();

	}

	private static void sortUsingJava7(List<String> stringList) {

		Collections.sort(stringList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

	}

	private static void sortUsingJava8(List<String> stringList) {

		Collections.sort(stringList, (s1, s2) -> s1.compareTo(s2));

	}

	interface MathOperation {
		int operation(int a, int b);

	}

	private int operate(int a, int b, MathOperation mathOP) {
		return mathOP.operation(a, b);

	}

	interface greetingMessage {

		void sayHello(String message);

	}

	public static <T> List<T> eval(List<T> listaS, Predicate<T> pred) {
		List<T> genericList = new ArrayList<>();
		for (T n : listaS)
			if (pred.test(n))
				genericList.add(n);

		return genericList;
	}

}
