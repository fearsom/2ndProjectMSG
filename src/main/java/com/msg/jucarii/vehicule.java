package com.msg.jucarii;

public interface vehicule {

	default void print() {

		System.out.println("i am a vehicule");
	}

	static void blowHorn() {

		System.out.println("horny");
	}

}
