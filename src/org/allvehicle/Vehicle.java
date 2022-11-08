//Question - 9 


package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	
	private void vehicleNecessary() {
		System.out.println("Vehicle is mandatory:");
	}
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
			v.vehicleNecessary();
			
		TwoWheeler t = new TwoWheeler();
			t.bike();
			t.cycle();
		
		ThreeWheeler h = new ThreeWheeler();
			h.auto();
		
		FourWheeler f = new FourWheeler();
		f.car();
}
}
