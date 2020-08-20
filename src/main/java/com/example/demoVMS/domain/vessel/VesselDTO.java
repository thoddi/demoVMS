package com.example.demoVMS.domain.vessel;

/**
 * Incoming vessel information.
 * @author thoddi
 *
 */
public class VesselDTO extends VesselViewModel {

	/**
	 * The country of the vessel
	 */
	private String country;
	
	/**
	 * Sets the country of the vessel. 
	 * @param country The name of the country.
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * Gets the country of the vessel.
	 * @return The name of the country.
	 */
	public String getCountry() {
		return country;
	}
}
