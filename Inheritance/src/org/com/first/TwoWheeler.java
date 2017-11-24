package org.com.first;

import javax.persistence.Entity;

import org.com.Vehicle;
@Entity
public class TwoWheeler extends Vehicle {
	private String streeingHandle;

	public TwoWheeler(int vehicleId, String vechicleName, String streeingHandle) {
		super(vehicleId, vechicleName);
		this.streeingHandle = streeingHandle;
	}

	public String getStreeingHandle() {
		return streeingHandle;
	}

	public void setStreeingHandle(String streeingHandle) {
		streeingHandle = streeingHandle;
	}

}
