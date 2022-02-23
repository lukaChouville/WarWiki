package fr.tbr.warkiki.bo;

public class Canon {
	
	private String name;
	private int lenght; 	// milimeter
	private int caliber; 	// milimeter

// Builder
	Canon(String pName,int pLenght,int pCaliber){
		this.name = pName;
		this.lenght = pLenght;
		this.caliber = pCaliber;
	}
// Accessor
	/* Name */
	public void setName(String pName) {
		this.name = pName;
	}
	public String getName() {
		return this.name;
	}
	/* Lenght */
	public void setLenght(int pLenght) {
		this.lenght = pLenght;
	}
	public int getLenght() {
		return this.lenght;
	}
	/* Caliber */
	public void setCaliber(int pCaliber) {
		this.caliber = pCaliber;
	}
	public int getCaliber() {
		return this.caliber;
	}
// Methode
	public String toString() {
		StringBuilder Sb = new StringBuilder("Canon [ name ='").append(this.name);
		Sb.append("' caliber ='").append(this.caliber);
		Sb.append("' Lenght ='").append(this.lenght);
		Sb.append("' ]");
		return Sb.toString();
	}
}
