package com.example.demoVMS.domain.position;

import java.util.Date;

public interface Position {

	/**
	 * The date of the position.
	 */
	Date date = new Date();
	
	/**
	 * The latitude of the position.
	 */
	Number latitude = 0;
	
	/**
	 * The longitude of the position.
	 */
	Number longitude = 0;
	
	/**
	 * The speed at the time of the position.
	 */
	Number speed = 0;
}
