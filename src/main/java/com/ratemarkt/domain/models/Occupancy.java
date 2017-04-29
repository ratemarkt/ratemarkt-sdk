package com.ratemarkt.domain.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.immutables.gson.Gson;
import org.immutables.value.Value;

@Gson.TypeAdapters
@Value.Immutable
public interface Occupancy {

	List<Occupant> getOccupants();

	Room getRoom();

	default Integer getNumberOfAdults() {
		int numberOfAdults = 0;
		for (Occupant occupant : getOccupants()) {
			if (occupant.getOccupantType() == OccupantType.ADULT) {
				numberOfAdults++;
			}
		}
		return numberOfAdults;
	}

	default List<Integer> getChildrenAges() {
		List<Integer> childrenAges = new ArrayList<Integer>();
		for (Occupant occupant : getOccupants()) {
			if (occupant.getOccupantType() == OccupantType.CHILD) {
				childrenAges.add(occupant.getAge());
			}
		}
		return childrenAges;
	}

	default String toPaxString() {
		String childrenAgesAsStr = getChildrenAges().stream().map(String::valueOf).collect(Collectors.joining(","));
		return String.format("%s,%s", getNumberOfAdults(), childrenAgesAsStr);
	}

}
