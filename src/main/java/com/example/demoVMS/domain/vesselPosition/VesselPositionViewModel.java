package com.example.demoVMS.domain.vesselPosition;

import com.example.demoVMS.domain.position.PositionViewModel;
import com.example.demoVMS.domain.vessel.VesselViewModel;

public class VesselPositionViewModel {

	/**
	 * Information about the vessel.
	 */
	private VesselViewModel vessel;
	
	/**
	 * Information about the vessel's position.
	 */
	private PositionViewModel position;

	/**
	 * Creates an instance of VesselPositionViewModel from the information from a VesselPositionDTO.
	 * @param vesselPosition VesselPosition information from client.
	 */
	public VesselPositionViewModel(VesselPositionDTO vesselPosition) {
		this.vessel = new VesselViewModel(vesselPosition.getVessel());
		this.position = new PositionViewModel(vesselPosition.getPosition());
	}
	
	/**
	 * Gets the vessel information.
	 * @return The vessel object.
	 */
	public VesselViewModel getVessel() {
		return vessel;
	}

	/**
	 * Sets the vessel information.
	 * @param vessel A new vessel.
	 */
	public void setVessel(VesselViewModel vessel) {
		this.vessel = vessel;
	}

	/**
	 * gets the positional information.
	 * @return The position object.
	 */
	public PositionViewModel getPosition() {
		return position;
	}

	/**
	 * Sets the positional information.
	 * @param position A new position.
	 */
	public void setPosition(PositionViewModel position) {
		this.position = position;
	}	
}
