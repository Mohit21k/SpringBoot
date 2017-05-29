package com.db.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import com.db.constants.SpringBootConstants;
import com.db.demo.model.GoogleResponseToJson;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * The Class SpringBootUtils.
 */
public class SpringBootUtils implements SpringBootConstants {

	/**
	 * Convert to lat long.
	 *
	 * @param fullAddress
	 *            the full address
	 * @return the google response to json
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static GoogleResponseToJson convertToLatLong(String fullAddress) throws IOException {

		URL url = new URL(URL + "?address=" + URLEncoder.encode(fullAddress, "UTF-8") + "&sensor=false");
		// Open the Connection
		URLConnection conn = url.openConnection();

		InputStream in = conn.getInputStream();
		ObjectMapper mapper = new ObjectMapper();
		GoogleResponseToJson response = mapper.readValue(in, GoogleResponseToJson.class);
		in.close();
		return response;

	}

	/**
	 * Distance.
	 *
	 * @param fromLat
	 *            the from lat
	 * @param fromLon
	 *            the from lon
	 * @param toLat
	 *            the to lat
	 * @param toLon
	 *            the to lon
	 * @return the double
	 */
	public static double calDistance(double fromLat, double fromLon, double toLat, double toLon) {
		double radius = 6371000; // approximate Earth radius in meters
		double latDiff = (toLat - fromLat);
		double lonDiff = toLon - fromLon;
		double angle = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(latDiff / 2), 2)
				+ Math.cos(fromLat) * Math.cos(toLat) * Math.pow(Math.sin(lonDiff / 2), 2)));
		return radius * angle;
	}
}
