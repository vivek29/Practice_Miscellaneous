package com.practice.vivek;

class VehicleA {

	// Instance fields
	
	int noOfTyres; // no of tyres
	private boolean accessories; // check if accessorees present or not
	protected String brand; // Brand of the car
	
	// Static fields
	private static int counter; // No of Vehicle objects created
	
	// Constructor
	
	VehicleA() {
		System.out.println("Constructor of the Super class called");
		noOfTyres = 5;
		accessories = true;
		brand = "X";
		counter++;
	}
	
	// Instance methods
	public void switchOn() {
		accessories = true;
	}
	
	public void switchOff() {
		accessories = false;
	}
	public boolean isPresent() {
		return accessories;
	}
	
	private void getBrand() {					// private method, so cann't be inherited
		System.out.println("Vehicle Brand: " + brand);
	}
	
	// Static methods
	public static void getNoOfVehicles() {
		System.out.println("Number of Vehicles: " + counter);
	}
}

class CarA extends VehicleA {

	private int carNo = 10;
	
	public void printCarInfo() {
		
		System.out.println("Car number: " + carNo);
	
		System.out.println("No of Tyres: " + noOfTyres); // Inherited.
		
		//  System.out.println("accessories: "    + accessories); // Not Inherited.
		
		System.out.println("accessories: " + isPresent()); // Inherited.
		
		//        System.out.println("Brand: "     + getBrand());  // Not Inherited.
		
		System.out.println("Brand: " + brand); // Inherited.
		
		//  System.out.println("Counter: "    + counter);     // Not Inherited.
		
		getNoOfVehicles(); // Inherited.
	
	}
}

public class VehicleDetails { // (3)

	public static void main(String[] args) {
		new CarA().printCarInfo();
	}
}
