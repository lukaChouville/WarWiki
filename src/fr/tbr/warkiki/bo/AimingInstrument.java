package fr.tbr.warkiki.bo;

import java.util.List;

public class AimingInstrument {
	private String name;
	private List<Integer> range;
	private float zoom;
	
	// Builder
	public AimingInstrument(String pName) {
		this.name = pName;
	}
	public AimingInstrument(String pName,List<Integer>pRange) {
		this.name = pName;
		this.range = pRange;
	}
	public AimingInstrument(String pName,float pZoom) {
		this.name = pName;
		this.zoom = pZoom;
	}
	public AimingInstrument(String pName,List<Integer>pRange,float pZoom) {
		this.name = pName;
		this.range = pRange;
		this.zoom = pZoom;
	}
	// Accessor
	public void setName(String pName) {
		this.name = pName;
	}
	public String getName() {
		return this.name;
	}
	
	public void setRange(List<Integer>pRange) {
		this.range = pRange;
	}
	public List<Integer> getRange() {
		return this.range;
	}
	// Methode
	public String toString() {
		StringBuilder Sb = new StringBuilder("AimingInstrument [ Name ='").append(this.name);
		Sb.append("' Range ='").append(this.range);
		Sb.append("'Zoom ='").append(this.zoom);
		Sb.append("' ]");
		return Sb.toString();
	}
}
