package com.db.demo.services;

import java.io.IOException;
import java.util.List;

import com.db.demo.model.ShopInfo;




/**
 * The Interface ShopInfoService.
 */
public interface ShopInfoService {

	/**
	 * Gets the shop details.
	 *
	 * @return the shop details
	 */
	public List<ShopInfo> getShopDetails();
	
	/**
	 * Gets the shop info.
	 *
	 * @param id the id
	 * @return the shop info
	 */
	public ShopInfo getShopInfo(Integer id);
	
	/**
	 * Adds the shop details.
	 *
	 * @param shopInfo the shop info
	 * @return the shop info
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public ShopInfo addShopDetails(ShopInfo shopInfo) throws IOException;
	
	/**
	 * Gets the shop details.
	 *
	 * @param lat the lat
	 * @param lng the lng
	 * @return the shop details
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public ShopInfo getShopDetails(String lat,String lng) throws IOException;
}
