package fr.tbr.warkiki.bo;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
	private int capacity;
	private List<Weapon> onWeapons = new ArrayList<Weapon>();
	
	// Builder
	public Magazine(int pCapacity,Weapon pWeapon) {
		this.capacity = pCapacity;
		this.onWeapons.add(pWeapon);
	}
	public Magazine(int pCapacity,List<Weapon> pWeapons) {
		this.capacity = pCapacity;
		this.onWeapons = pWeapons;
	}
	
	// Accessor
	public void setcapacity(int pcapacity) {
		this.capacity = pcapacity;
	}
	public int getcapacity() {
		return this.capacity;
	}
	
	public void setOnWeapons(List<Weapon> pWeapons) {
		this.onWeapons = pWeapons;
	}
	public void addOnWeapons(Weapon pWeapon) {
		this.onWeapons.add(pWeapon);
	}
	public List<Weapon> getOnWeapons() {
		return this.onWeapons;
	}
	
	// Methode
	public String toString() {
		StringBuilder Sb = new StringBuilder("Magazine [ capacity ='").append(this.capacity);
		Sb.append("' Range ='").append(this.onWeapons);
		Sb.append("' ]");
		return Sb.toString();
	}
}
