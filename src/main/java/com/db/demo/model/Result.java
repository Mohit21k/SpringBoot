package com.db.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

// TODO: Auto-generated Javadoc
/**
 * The Class Result.
 */
public class Result {

	/** The formatted address. */
	private String formatted_address;

	/** The partial match. */
	private boolean partial_match;

	/** The geometry. */
	private Geometry geometry;

	/** The address components. */
	@JsonIgnore
	private Object address_components;

	/** The types. */
	@JsonIgnore
	private Object types;
	
	/** The place id. */
	@JsonIgnore
	private Object place_id;

	/**
	 * Gets the formatted address.
	 *
	 * @return the formatted address
	 */
	public String getFormatted_address() {
		return formatted_address;
	}

	/**
	 * Sets the formatted address.
	 *
	 * @param formatted_address the new formatted address
	 */
	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	/**
	 * Checks if is partial match.
	 *
	 * @return true, if is partial match
	 */
	public boolean isPartial_match() {
		return partial_match;
	}

	/**
	 * Sets the partial match.
	 *
	 * @param partial_match the new partial match
	 */
	public void setPartial_match(boolean partial_match) {
		this.partial_match = partial_match;
	}

	/**
	 * Gets the geometry.
	 *
	 * @return the geometry
	 */
	public Geometry getGeometry() {
		return geometry;
	}

	/**
	 * Sets the geometry.
	 *
	 * @param geometry the new geometry
	 */
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	/**
	 * Gets the address components.
	 *
	 * @return the address components
	 */
	public Object getAddress_components() {
		return address_components;
	}

	/**
	 * Sets the address components.
	 *
	 * @param address_components the new address components
	 */
	public void setAddress_components(Object address_components) {
		this.address_components = address_components;
	}

	/**
	 * Gets the types.
	 *
	 * @return the types
	 */
	public Object getTypes() {
		return types;
	}

	/**
	 * Sets the types.
	 *
	 * @param types the new types
	 */
	public void setTypes(Object types) {
		this.types = types;
	}

	/**
	 * Gets the place id.
	 *
	 * @return the place id
	 */
	public Object getPlace_id() {
		return place_id;
	}

	/**
	 * Sets the place id.
	 *
	 * @param place_id the new place id
	 */
	public void setPlace_id(Object place_id) {
		this.place_id = place_id;
	}

	
}
