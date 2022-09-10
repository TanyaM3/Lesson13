package by.epam.homework.less13.view;

import by.epam.homework.less13.bean.Flat;

import java.util.List;

import by.epam.homework.less13.bean.Building;

public class BuildingConsoleOutput {
	public void print(String title, Building building) {
		System.out.println(title);
		List<Flat> flats = building.getFlats();
		for(int i = 0; i < flats.size(); i++) {
			System.out.println("Flat № " + flats.get(i).getFlatNumber() + ", floor " + flats.get(i).getFloor() + ", number of rooms " + flats.get(i).getNumberOfRooms() + ", area " + flats.get(i).getArea());
		}
	}

	public void print(String title, List<Flat> flats) {
		System.out.println(title);
		for(int i = 0; i < flats.size(); i++) {
			System.out.println("Flat № " + flats.get(i).getFlatNumber() + ", floor " + flats.get(i).getFloor() + ", number of rooms " + flats.get(i).getNumberOfRooms() + ", area " + flats.get(i).getArea());
		}
	}
}