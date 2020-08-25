package com.example.demoVMS.services;

/**
 * Service for handling units of measurement.
 * @author thoddi
 *
 */
public class UnitService {

	/**
	 * Converts degrees to radians.
	 * @param degrees An amount of degrees to convert.
	 * @return Radians.
	 */
	public static double degreesToRadians(double degrees) {
		return (degrees * (Math.PI/180));
	}
	
	/**
	 * Converts knots to meters per second.
	 * @param knots An amount of knots to convert.
	 * @return Meters per second.
	 */
	public static double knotsToMps(double knots) {
		// knots * 1852 = m/h
		// m/h / 3600 = m/s
		return (knots * 1852)/3600;
	}
}
