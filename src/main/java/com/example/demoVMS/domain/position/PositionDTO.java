package com.example.demoVMS.domain.position;

import java.util.Date;

/**
 * Incoming position information.
 * @author thoddi
 *
 */
public class PositionDTO implements Position {

	/**
	 * The date of the position.
	 */
	private Date date;
	
	/**
	 * The position latitude in degrees. 
	 */
	private double latitude;
	
	/**
	 * The position longitude in degrees.
	 */
	private double longitude;
	
	/**
	 * The speed at that time in knots.
	 */
	private double speed;


	/**
	 * Gets the date of the position.
	 * @return The date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the date of the position.
	 * @param date A new date.
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * Gets the latitude of the position.
	 * @return The latitude in degrees.
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude of the position.
	 * @param latitude A new latitude in degrees.
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude of the position.
	 * @return The longitude in degrees.
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude of the position.
	 * @param longitude A new longitude in degrees.
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the speed at that time.
	 * @return The speed in knots.
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed at the time of the position.
	 * @param speed in knots.
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
}