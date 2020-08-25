package com.example.demoVMS.domain.vessel;

/**
 * Vessel information to send to the client.
 * @author thoddi
 *
 */
public class VesselViewModel {

	/**
	 * The name of the vessel.
	 */
	private String name;
	
	/**
	 * A default constructor.
	 */
	public VesselViewModel() {
		
	}
	
	/**
	 * Creates an instance of VesselViewModel from the information from a VesselDTO.
	 * @param vessel Vessel information from client.
	 */
	public VesselViewModel(VesselDTO vessel) {
		this.name = vessel.getName();
	}
	
	/**
	 * Sets the name of the vessel.
	 * @param name The new name for the vessel.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the name of the vessel.
	 * @return The name of the vessel.
	 */
	public String getName() {
		return name;
	}
}
