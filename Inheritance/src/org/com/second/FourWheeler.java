package org.com.second;

import org.com.Vehicle;
import javax.persistence.Entity;
@Entity
public class FourWheeler extends Vehicle {
	private String streeingWheel;

	public FourWheeler(int vehicleId, String vechicleName,String streeingWheel) {
		super(vehicleId, vechicleName);
		this.streeingWheel = streeingWheel;
	}

	public String getStreeingWheel() {
		return streeingWheel;
	}

	public void setStreeingWheel(String streeingWheel) {
		this.streeingWheel = streeingWheel;
	}

}
