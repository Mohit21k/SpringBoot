package com.db.test;

import java.io.IOException;


import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.db.demo.model.ShopInfo;
import com.db.web.services.impl.InMemoryShopInfoServiceImpl;


// TODO: Auto-generated Javadoc
/**
 * The Class InMemoryShopInfoServiceTest.
 */
public class InMemoryShopInfoServiceTest {

	
	/**
	 * Adds the shop details Test Case.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public void addShopDetailsTC() throws IOException{
		InMemoryShopInfoServiceImpl infoServiceImpl = new InMemoryShopInfoServiceImpl();
		ShopInfo shopInfo = new ShopInfo();
		shopInfo.setShopName("Domino's");
		shopInfo.setShopAddress("MBP Mahape");
		shopInfo.setShopPostCode("400710");
		infoServiceImpl.addShopDetails(shopInfo);
		AssertJUnit.assertEquals("1", shopInfo.getShopId());
	}
	
	
	/**
	 * Gets the shop details Test Case.
	 *
	 * @return the shop details TC
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Test
	public void getShopDetailsTC() throws IOException{
		InMemoryShopInfoServiceImpl infoServiceImpl = new InMemoryShopInfoServiceImpl();
		ShopInfo shopInfo = new ShopInfo();
		
		shopInfo = infoServiceImpl.getShopDetails("19.1585", "72.9989");
		AssertJUnit.assertEquals("Domino's", shopInfo.getShopName());
		AssertJUnit.assertEquals("MBP Mahape", shopInfo.getShopAddress());
		AssertJUnit.assertEquals("400710", shopInfo.getShopPostCode());
	}
}
