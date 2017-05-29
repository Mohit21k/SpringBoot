package com.db.web.services.impl;


/**
 * The Class InMemorySequence.
 */
public class InMemorySequence {
	
	/** The current value. */
	private Integer currentValue = new Integer(0);
	
	/**
	 * Increment.
	 *
	 * @return the integer
	 */
	public Integer increment() {
		synchronized(this) {
			currentValue = currentValue + 1;
			return currentValue;
		}
	}
}
