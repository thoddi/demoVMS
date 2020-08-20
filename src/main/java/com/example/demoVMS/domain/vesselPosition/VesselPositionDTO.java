package com.example.demoVMS.domain.vesselPosition;

import com.example.demoVMS.domain.position.PositionDTO;
import com.example.demoVMS.domain.vessel.VesselDTO;

public class VesselPositionDTO {

	/**
	 * Information about the vessel.
	 */
	private VesselDTO vessel;
	
	/**
	 * Information about the vessel's position.
	 */
	private PositionDTO position;

	
	/**
	 * Gets the vessel information.
	 * @return The vessel object.
	 */
	public VesselDTO getVessel() {
		return vessel;
	}

	/**
	 * Sets the vessel information.
	 * @param vessel A new vessel.
	 */
	public void setVessel(VesselDTO vessel) {
		this.vessel = vessel;
	}

	/**
	 * gets the positional information.
	 * @return The position object.
	 */
	public PositionDTO getPosition() {
		return position;
	}

	/**
	 * Sets the positional information.
	 * @param position A new position.
	 */
	public void setPosition(PositionDTO position) {
		this.position = position;
	}
}
