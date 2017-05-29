package com.db.demo.model;

// TODO: Auto-generated Javadoc
/**
 * The Class ShopInfo.
 */
public class ShopInfo {

	/** The shop id. */
	private String shopId;

	/** The shop name. */
	private String shopName;

	/** The shop address. */
	private String shopAddress;

	/** The shop post code. */
	private String shopPostCode;

	/** The shop latitude. */
	private Double shopLatitude;

	/** The shop longitude. */
	private Double shopLongitude;

	/**
	 * Instantiates a new shop info.
	 *
	 * @param shopName
	 *            the shop name
	 * @param shopAddress
	 *            the shop address
	 * @param shopPostCode
	 *            the shop post code
	 * @param shopLatitude
	 *            the shop latitude
	 * @param shopLongitude
	 *            the shop longitude
	 */
	public ShopInfo(String shopName, String shopAddress, String shopPostCode, Double shopLatitude,
			Double shopLongitude) {
		super();
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopPostCode = shopPostCode;
		this.shopLatitude = shopLatitude;
		this.shopLongitude = shopLongitude;
	}
	
	

	/**
	 * 
	 */
	public ShopInfo() {
		super();
	}



	/**
	 * Gets the shop name.
	 *
	 * @return the shop name
	 */
	public String getShopName() {
		return shopName;
	}

	/**
	 * Sets the shop name.
	 *
	 * @param shopName
	 *            the new shop name
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	/**
	 * Gets the shop address.
	 *
	 * @return the shop address
	 */
	public String getShopAddress() {
		return shopAddress;
	}

	/**
	 * Sets the shop address.
	 *
	 * @param shopAddress
	 *            the new shop address
	 */
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	/**
	 * Gets the shop post code.
	 *
	 * @return the shop post code
	 */
	public String getShopPostCode() {
		return shopPostCode;
	}

	/**
	 * Sets the shop post code.
	 *
	 * @param shopPostCode
	 *            the new shop post code
	 */
	public void setShopPostCode(String shopPostCode) {
		this.shopPostCode = shopPostCode;
	}

	/**
	 * Gets the shop latitude.
	 *
	 * @return the shop latitude
	 */
	public Double getShopLatitude() {
		return shopLatitude;
	}

	/**
	 * Sets the shop latitude.
	 *
	 * @param shopLatitude
	 *            the new shop latitude
	 */
	public void setShopLatitude(Double shopLatitude) {
		this.shopLatitude = shopLatitude;
	}

	/**
	 * Gets the shop longitude.
	 *
	 * @return the shop longitude
	 */
	public Double getShopLongitude() {
		return shopLongitude;
	}

	/**
	 * Sets the shop longitude.
	 *
	 * @param shopLongitude
	 *            the new shop longitude
	 */
	public void setShopLongitude(Double shopLongitude) {
		this.shopLongitude = shopLongitude;
	}

	/**
	 * Gets the shop id.
	 *
	 * @return the shop id
	 */
	public String getShopId() {
		return shopId;
	}

	/**
	 * Sets the shop id.
	 *
	 * @param shopId
	 *            the new shop id
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
