package com.db.test;

import java.io.IOException;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.db.demo.model.GoogleResponseToJson;
import com.db.utils.SpringBootUtils;


/**
 * The Class SpringBootUtilsTest.
 */
public class SpringBootUtilsTest {

	/**
	 * Convert to lat long.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Test
	public void convertToLatLong() throws IOException {
		GoogleResponseToJson response = SpringBootUtils.convertToLatLong("MBP Mahape");

		AssertJUnit.assertEquals("19.1087863", (response.getResults())[0].getGeometry().getLocation().getLat());
		AssertJUnit.assertEquals("73.0201256", (response.getResults())[0].getGeometry().getLocation().getLng());
	}

	/**
	 * Cal distance.
	 */
	@Test
	public void calDistance() {
		//AssertJUnit.assertEquals("", SpringBootUtils.calDistance(fromLat, fromLon, toLat, toLon));
	}
}
