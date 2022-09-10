package by.epam.homework.less13.bean;

import java.io.Serializable;
import java.util.Objects;

public class Flat implements Serializable {
	private static final long serialVersionUID = 1L;

	private int flatNumber;
	private int area;
	private int floor;
	private int numberOfRooms;
	private String street;
	private String builtingType;
	private int serviceLife;

	public Flat() {

	}

	public Flat(int flatNumber, int area, int floor, int numberOfRooms, String street, String builtingType,
			int serviceLife) {
		this.flatNumber = flatNumber;
		this.area = area;
		this.floor = floor;
		this.numberOfRooms = numberOfRooms;
		this.street = street;
		this.builtingType = builtingType;
		this.serviceLife = serviceLife;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuiltingType() {
		return builtingType;
	}

	public void setBuiltingType(String builtingType) {
		this.builtingType = builtingType;
	}

	public int getServiceLife() {
		return serviceLife;
	}

	public void setServiceLife(int serviceLife) {
		this.serviceLife = serviceLife;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, builtingType, flatNumber, floor, numberOfRooms, serviceLife, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flat other = (Flat) obj;
		return area == other.area && Objects.equals(builtingType, other.builtingType) && flatNumber == other.flatNumber
				&& floor == other.floor && numberOfRooms == other.numberOfRooms && serviceLife == other.serviceLife
				&& Objects.equals(street, other.street);
	}

	@Override
	public String toString() {
		return "Flat [flatNumber=" + flatNumber + ", area=" + area + ", floor=" + floor + ", numberOfRooms="
				+ numberOfRooms + ", street=" + street + ", builtingType=" + builtingType + ", serviceLife="
				+ serviceLife + "]";
	}
}