package fr.tbr.warwiki.test;

import java.util.ArrayList;
import java.util.List;

import fr.tbr.warkiki.bo.AimingInstrument;
import fr.tbr.warkiki.bo.Magazine;
import fr.tbr.warkiki.bo.Weapon;

public class AppliTestBo {

	public static void main(String[] args) {

		// Weapon Test
		System.out.println("Weapon Test :");
		System.out.println(" ");
		
		Weapon weapon = new Weapon("Ari-08", (float) 7.65, "7.65x21mm Parabellum");
		weapon.setLenght(256);
		weapon.setCanonLenght(150);
		weapon.setWeightEmpty(1000);
		
		List<Integer>range = new ArrayList<>();
		range.add(100);
		range.add(200);
		AimingInstrument aimingInstrument;
		weapon.addAimingInstruments(aimingInstrument = new AimingInstrument("hausse" ,range ));
		
		
		System.out.println(weapon.toString());
		
		System.out.println(" ");
		System.out.println("   ------------------------------------------   ");
		System.out.println(" ");
		
		// Magazin Test
		System.out.println("Magazin Test :");
		System.out.println(" ");
		
		Magazine magazine = new Magazine(8,weapon);
		
		System.out.println(magazine.toString());
				
		System.out.println(" ");
		System.out.println("   ------------------------------------------   ");
		System.out.println(" ");
		
		// AimingInstrument Test
		System.out.println("AimingInstrument Test :");
		System.out.println(" ");
		
		
		
		System.out.println(weapon.getAimingInstruments().toString());
		
		System.out.println(" ");
		System.out.println("   ------------------------------------------   ");
		System.out.println(" ");
		
	}

}
