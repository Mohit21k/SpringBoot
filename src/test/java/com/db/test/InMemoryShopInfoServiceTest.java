package com.db.test;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.db.demo.model.ShopInfo;
import com.db.web.services.impl.InMemoryShopInfoServiceImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class InMemoryShopInfoServiceTest.
 */
public class InMemoryShopInfoServiceTest {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(InMemoryShopInfoServiceTest.class);

	/**
	 * Adds the shop details Test Case.
	 */
	@Test
	public void addShopDetailsTC() {
		try {
			InMemoryShopInfoServiceImpl infoServiceImpl = new InMemoryShopInfoServiceImpl();
			ShopInfo shopInfo = new ShopInfo();
			shopInfo.setShopName("Domino's");
			shopInfo.setShopAddress("MBP Mahape");
			shopInfo.setShopPostCode("400710");
			infoServiceImpl.addShopDetails(shopInfo);
			AssertJUnit.assertEquals("1", shopInfo.getShopId());
		} catch (Exception e) {
			logger.error("Error Message =" + e.getMessage());
		}

	}

	/**
	 * Adds the shop details null value.
	 */
	@Test
	public void addShopDetailsNullValue() {
		try {
			InMemoryShopInfoServiceImpl infoServiceImpl = new InMemoryShopInfoServiceImpl();
			ShopInfo shopInfo = null;
			infoServiceImpl.addShopDetails(shopInfo);
			AssertJUnit.assertNull(shopInfo);
		} catch (Exception e) {
			logger.error("Error Message =" + e.getMessage());
		}
	}

	/**
	 * Gets the shop details Test Case.
	 *
	 * @return the shop details TC
	 */
	@Test
	public void getShopDetailsTC() {
		InMemoryShopInfoServiceImpl infoServiceImpl = new InMemoryShopInfoServiceImpl();
		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setShopName("Domino's");
		shopInfo.setShopAddress("MBP Mahape");
		shopInfo.setShopPostCode("400710");
		try {
			infoServiceImpl.addShopDetails(shopInfo);
			shopInfo = infoServiceImpl.getShopDetails("19.1585", "72.9989");
			AssertJUnit.assertEquals("Domino's", shopInfo.getShopName());
			AssertJUnit.assertEquals("MBP Mahape", shopInfo.getShopAddress());
			AssertJUnit.assertEquals("400710", shopInfo.getShopPostCode());
		} catch (Exception e) {
			logger.error("Error Message =" + e.getMessage());
		}
	}
}
