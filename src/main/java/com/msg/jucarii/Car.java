package com.msg.jucarii;

public class Car implements vehicule, fourWheeler {

	@Override
	public void print() {

		vehicule.super.print();
		fourWheeler.super.print();
		vehicule.blowHorn();
		System.out.println("im a car ");
	}

}
