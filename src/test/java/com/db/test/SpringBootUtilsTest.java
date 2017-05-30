package com.db.test;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.db.demo.model.GoogleResponseToJson;
import com.db.utils.SpringBootUtils;

/**
 * The Class SpringBootUtilsTest.
 */
public class SpringBootUtilsTest {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootUtilsTest.class);

	/**
	 * Convert to lat long.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Test
	public void convertToLatLong() {
		try {
			GoogleResponseToJson response = SpringBootUtils.convertToLatLong("MBP Mahape");

			AssertJUnit.assertEquals("19.1087863", (response.getResults())[0].getGeometry().getLocation().getLat());
			AssertJUnit.assertEquals("73.0201256", (response.getResults())[0].getGeometry().getLocation().getLng());
		} catch (Exception e) {
			logger.error("Error Message =" + e.getMessage());
		}

	}

	/**
	 * Cal distance.
	 */
	@Test
	public void calDistance() {
		AssertJUnit.assertEquals(5.960686764301944,
				SpringBootUtils.calDistance(19.1585, 72.9989, 19.1087863, 73.0201256));
	}
}
