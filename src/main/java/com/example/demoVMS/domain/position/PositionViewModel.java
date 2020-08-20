package com.example.demoVMS.domain.position;

import java.util.Date;

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
	private Number latitude;
	
	/**
	 * The position longitude in radians.
	 */
	private Number longitude;
	
	/**
	 * The speed at that time in meters per second.
	 */
	private Number speed;


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
	 * @return The latitude.
	 */
	public Number getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude of the position.
	 * @param latitude A new latitude.
	 */
	public void setLatitude(Number latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude of the position.
	 * @return The longitude.
	 */
	public Number getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude of the position.
	 * @param longitude A new longitude.
	 */
	public void setLongitude(Number longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the speed at that time.
	 * @return The speed.
	 */
	public Number getSpeed() {
		return speed;
	}

	public void setSpeed(Number speed) {
		this.speed = speed;
	}
}
