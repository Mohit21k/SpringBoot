package com.db.demo.controller;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.db.demo.model.Location;
import com.db.demo.model.ShopInfo;
import com.db.demo.services.ShopInfoService;

// TODO: Auto-generated Javadoc
/**
 * The Class ShopServiceController.
 */
@RestController
@RequestMapping("/shopInfo")
public class ShopServiceController {

	/** The shop info service. */
	@Autowired
	private ShopInfoService shopInfoService;

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(ShopServiceController.class);

	/**
	 * Adds the shop details.
	 *
	 * @param shopInfo
	 *            the shop info
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@RequestMapping(value = "/addshopinfo", method = RequestMethod.POST, consumes = { "application/json" }, produces = {
			"application/json" })
	@ResponseStatus(HttpStatus.OK)
	public void addShopDetails(@RequestBody ShopInfo shopInfo) throws IOException {
		logger.info("[addShopDetails({})] started ...", shopInfo);
		shopInfoService.addShopDetails(shopInfo);
		logger.info("[addShopDetails({})] done.", (shopInfoService.getShopDetails()).toString());
	}

	/**
	 * Gets the hop details.
	 *
	 * @param location
	 *            the location
	 * @return the hop details
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@RequestMapping(value = "/nearestShopInfo", method = RequestMethod.POST, consumes = {
			"application/json" }, produces = { "application/json" })
	@ResponseStatus(HttpStatus.OK)
	public ShopInfo gethopDetails(@RequestBody Location location) throws IOException {
		logger.info("[getShopDetails({})] started ...", location);
		ShopInfo shopInfo = shopInfoService.getShopDetails(location.getLat(), location.getLng());
		logger.info("[getShopDetails({})] done.", location);
		return shopInfo;
	}
}
