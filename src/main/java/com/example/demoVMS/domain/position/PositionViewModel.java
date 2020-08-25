package com.example.demoVMS.domain.position;

import java.util.Date;

import com.example.demoVMS.services.UnitService;

public class PositionViewModel implements Position {

	/**
	 * The date of the position.
	 */
	private Date date;
	
	/**
	 * The date when the endpoint received the position.
	 */
	private Date receivedDate;
	
	/**
	 * The position latitude in radians. 
	 */
	private double latitude;
	
	/**
	 * The position longitude in radians.
	 */
	private double longitude;
	
	/**
	 * The speed at that time in meters per second.
	 */
	private double speed;

	/**
	 * Creates an instance of PositionViewModel with the information from a PositionDTO.
	 * @param position Position information from client.
	 */
	public PositionViewModel(PositionDTO position) {
		this.date  = position.getDate();
		this.receivedDate = new Date();
		this.latitude = UnitService.degreesToRadians(position.getLatitude());
		this.longitude = UnitService.degreesToRadians(position.getLongitude());
		this.speed = UnitService.knotsToMps(position.getSpeed());
	}

	/**
	 * Gets the date of the position.
	 * @return The date.
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
	 * Gets the date of receiving the position.
	 * @return The date.
	 */
	public Date getReceivedDate() {
		return receivedDate;
	}

	/**
	 * Sets the date of receiving the position.
	 * @param receivedDate A new Date.
	 */
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	
	/**
	 * Gets the latitude of the position.
	 * @return The latitude in radians.
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude of the position.
	 * @param latitude A new latitude in radians.
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude of the position.
	 * @return The longitude in radians.
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude of the position.
	 * @param longitude A new longitude in radians.
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the speed at that time.
	 * @return The speed in meters per second..
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed at that time.
	 * @param speed A new speed in meters per second.
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
