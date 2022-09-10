package by.epam.homework.less13.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.homework.less13.bean.Flat;
import by.epam.homework.less13.bean.Building;

public class BuildingLogic {

	public List<Flat> byNumberOfRooms(Building building, int numberOfRooms) {
		List<Flat> flatsByNumberOfRooms = new ArrayList<Flat>();
		List<Flat> flats = building.getFlats();

		for (int i = 0; i < flats.size(); i++) {
			if (numberOfRooms == flats.get(i).getNumberOfRooms()) {
				flatsByNumberOfRooms.add(flats.get(i));
			}
		}
		return flatsByNumberOfRooms;
	}

	public List<Flat> byNumberOfRoomsAndFloor(Building building, int numberOfRooms, int fromFloor, int toFloor) {
		List<Flat> flatsByNumberOfRoomsAndFloor = new ArrayList<Flat>();
		List<Flat> flats = building.getFlats();

		for (int i = 0; i < flats.size(); i++) {
			if (numberOfRooms == flats.get(i).getNumberOfRooms() && fromFloor < flats.get(i).getFloor()
					&& toFloor > flats.get(i).getFloor()) {
				flatsByNumberOfRoomsAndFloor.add(flats.get(i));
			}
		}
		return flatsByNumberOfRoomsAndFloor;
	}

	public List<Flat> byArea(Building building, int area) {
		List<Flat> flatsByArea = new ArrayList<Flat>();
		List<Flat> flats = building.getFlats();

		for (int i = 0; i < flats.size(); i++) {
			if (area < flats.get(i).getArea()) {
				flatsByArea.add(flats.get(i));
			}
		}
		return flatsByArea;
	}
}
