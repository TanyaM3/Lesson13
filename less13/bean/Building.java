package by.epam.homework.less13.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Building implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Flat> flats;

	public Building() {
		flats = new ArrayList<Flat>();
	}

	public Building(List<Flat> flats) {
		this.flats = flats;
	}

	public List<Flat> getFlats() {
		return flats;
	}

	public void setFlats(List<Flat> flats) {
		this.flats = flats;
	}

	public void add(Flat flat) {
		flats.add(flat);
	}

	public void delete(Flat flat) {
		flats.remove(flat);
	}

	@Override
	public int hashCode() {
		return Objects.hash(flats);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building other = (Building) obj;
		return Objects.equals(flats, other.flats);
	}

	@Override
	public String toString() {
		return "Building [flats=" + flats + "]";
	}
}