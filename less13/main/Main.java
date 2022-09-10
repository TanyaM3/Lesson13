package by.epam.homework.less13.main;

import java.util.List;

import by.epam.homework.less13.bean.Flat;
import by.epam.homework.less13.bean.Building;
import by.epam.homework.less13.logic.BuildingLogic;
import by.epam.homework.less13.view.BuildingConsoleOutput;

public class Main {

	public static void main(String[] args) {

		BuildingLogic logic = new BuildingLogic();
		BuildingConsoleOutput output = new BuildingConsoleOutput();

		Building building = new Building();

		building.add(new Flat(15, 75, 2, 3, "Gaya 20", "Apartment", 70));
		building.add(new Flat(27, 100, 3, 4, "Gaya 20", "Apartment", 70));
		building.add(new Flat(35, 80, 4, 3, "Gaya 20", "Apartment", 70));
		building.add(new Flat(78, 95, 8, 4, "Gaya 20", "Apartment", 70));

		List<Flat> flats = logic.byNumberOfRooms(building, 4);
		output.print("Flats with 4 rooms: ", flats);
	}
}