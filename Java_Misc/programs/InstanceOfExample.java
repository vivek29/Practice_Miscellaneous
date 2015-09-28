package com.practice.vivek;

class Vehicle2 {

	String name;
	Vehicle2() {
		name = "Vehicle";
	}
}

class HeavyVehicle2 extends Vehicle2 {

	HeavyVehicle2() {
		name = "HeavyVehicle";
	}
}

class Truck extends HeavyVehicle2 {

	Truck() {
		name = "Truck";
	}
}

class LightVehicle extends Vehicle2 {

	LightVehicle() {
		name = "LightVehicle";
	}
}

public class InstanceOfExample {

	static boolean result;
	static HeavyVehicle2 hV = new HeavyVehicle2();
	static Truck T = new Truck();
	static HeavyVehicle2 hv2 = null;

	public static void main(String[] args) {
	
		result = hV instanceof HeavyVehicle2;
		System.out.print("hV is an HeavyVehicle: " + result + "\n");
		
		result = T instanceof HeavyVehicle2;
		System.out.print("T is an HeavyVehicle: " + result + "\n");
		
		result = hV instanceof Truck;
		System.out.print("hV is a Truck: " + result + "\n");
		
		result = hv2 instanceof HeavyVehicle2;
		System.out.print("hv2 is an HeavyVehicle: " + result + "\n");
		
		// hv2 does not yet reference an HeavyVehicle object, instanceof returns false.
		// Also we can’t use instanceof operator with siblings	
		
		hV = T; //Successful Cast form child to parent

		T = (Truck) hV; //Successful Explicit Cast form parent to child
	
	}
}
