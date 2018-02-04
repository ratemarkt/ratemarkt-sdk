package com.ratemarkt.models;

import java.util.ArrayList;
import java.util.List;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Pax {

	List<Integer> getChildrenAges();

	Integer getNumberOfAdults();

	default String toPaxString() {
		List<String> frags = new ArrayList<String>();
		frags.add(String.valueOf(getNumberOfAdults()));

		List<Integer> childrenAges = new ArrayList<Integer>(getChildrenAges());
		childrenAges.sort((a1, a2) -> a1.compareTo(a2));
		for (Integer age : childrenAges) {
			frags.add(String.valueOf(age));
		}
		return String.join(",", frags);
	}

	static Pax fromPaxString(String paxString) {
		String[] frags = paxString.split(",");
		Integer numberOfAdults = Integer.valueOf(frags[0]);
		List<Integer> childrenAges = new ArrayList<Integer>();
		for (int i = 1; i < frags.length; i++) {
			childrenAges.add(Integer.valueOf(frags[i]));
		}
		return new Pax() {

			@Override
			public List<Integer> getChildrenAges() {
				return childrenAges;
			}

			@Override
			public Integer getNumberOfAdults() {
				return numberOfAdults;
			}

		};

	}
}
