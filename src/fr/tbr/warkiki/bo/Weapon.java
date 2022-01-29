package fr.tbr.warkiki.bo;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
	
	private String name;
	private float caliber; 			// millimeter
	private String ammoType;		// 9x19mm
	
	private int weightEmpty; 		// gram
	private int weight; 			// gram
	
	private int lenght; 			// millimeter
	private int canonLenght; 		// millimeter
	private List<Ammo> ammos = new ArrayList<Ammo>();
	
	private List<AimingInstrument> aimingInstruments = new ArrayList<AimingInstrument>();
	
	// Builder
	public Weapon(String pName,float pCaliber,String pAmmoType) {
		this.name=pName;
		this.caliber = pCaliber;
		this.ammoType = pAmmoType;
	}

	// Accessor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getCaliber() {
		return caliber;
	}
	public void setCaliber(float caliber) {
		this.caliber = caliber;
	}

	public String getAmmoType() {
		return ammoType;
	}
	public void setAmmoType(String ammoType) {
		this.ammoType = ammoType;
	}

	public int getWeightEmpty() {
		return weightEmpty;
	}
	public void setWeightEmpty(int weightEmpty) {
		this.weightEmpty = weightEmpty;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getCanonLenght() {
		return canonLenght;
	}
	public void setCanonLenght(int canonLenght) {
		this.canonLenght = canonLenght;
	}

	public List<Ammo> getAmmo() {
		return ammos;
	}
	public void setAmmo(List<Ammo> ammos) {
		this.ammos = ammos;
	}
	public void setAmmo(Ammo ammo) {
		this.ammos.add(ammo);
	}

	public List<AimingInstrument> getAimingInstruments() {
		return aimingInstruments;
	}
	public void setAimingInstruments(List<AimingInstrument> aimingInstruments) {
		this.aimingInstruments = aimingInstruments;
	}
	public void addAimingInstruments(AimingInstrument aimingInstrument) {
		this.aimingInstruments.add(aimingInstrument);
	}
	
	// Methode
	public String toString() {
		StringBuilder Sb = new StringBuilder("Weapon [ name ='").append(this.name);
		Sb.append("' caliber ='").append(this.caliber);
		Sb.append("' ammoType ='").append(this.ammoType);
		Sb.append("' weight ='").append(this.weight);
		Sb.append("' weightEmpty ='").append(this.weightEmpty);
		Sb.append("' lenght ='").append(this.lenght);
		Sb.append("' canonLenght ='").append(this.canonLenght);
		Sb.append("' ammos ='").append(this.ammos);
		Sb.append("' aimingInstruments ='").append(this.aimingInstruments);
		Sb.append("' ]");
		return Sb.toString();
	}
}
