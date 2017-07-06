package com.ratemarkt.models;

public enum BoardType {

	RO("Room Only"), BB("Bed And Breakfast"), HB("Half Board"), FB("Full Board"), AI("All Inclusive");

	String name;

	BoardType(String name) {
		this.name = name;
	}
}
