/**
 * 
 */
package com.db.web.services.impl;

import java.io.IOException;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;
import com.db.demo.model.GoogleResponseToJson;
import com.db.demo.model.ShopInfo;
import com.db.demo.services.ShopInfoService;
import com.db.utils.SpringBootUtils;



/**
 * The Class InMemoryShopInfoServiceImpl.
 *
 * @author Mohit
 */
@Service
public class InMemoryShopInfoServiceImpl implements ShopInfoService {

	/** The shop info by id. */
	private final HashMap<Integer, ShopInfo> shopInfoById = new HashMap<>();

	/** The seq. */
	private final InMemorySequence seq = new InMemorySequence();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.db.demo.services.ShopInfoService#getShopDetails()
	 */
	@Override
	public List<ShopInfo> getShopDetails() {
		ArrayList<ShopInfo> result = new ArrayList<>(shopInfoById.size());
		for (ShopInfo shopInfo : shopInfoById.values()) {
			result.add(shopInfo);
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.db.demo.services.ShopInfoService#getShopInfo(java.lang.Integer)
	 */
	@Override
	public ShopInfo getShopInfo(Integer id) {
		if (id == null)
			return null;
		return shopInfoById.get(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.db.demo.services.ShopInfoService#addShopDetails(com.db.demo.model.
	 * ShopInfo)
	 */
	@Override
	public ShopInfo addShopDetails(ShopInfo shopInfo) throws IOException {
		if (shopInfo == null)
			return shopInfo;				
		GoogleResponseToJson responseToJson = SpringBootUtils.convertToLatLong(shopInfo.getShopAddress());
		String latitude = (responseToJson.getResults())[0].getGeometry().getLocation().getLat();
		String longitude = (responseToJson.getResults())[0].getGeometry().getLocation().getLng();
		shopInfo.setShopLatitude(Double.parseDouble(latitude));
		shopInfo.setShopLongitude(Double.parseDouble(longitude));
		Integer newId = seq.increment();
		shopInfo.setShopId(Integer.toString(newId));
		shopInfoById.put(newId, shopInfo);		
		return shopInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.db.demo.services.ShopInfoService#getShopDetails(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public ShopInfo getShopDetails(String fromlat, String fromlng) throws IOException {
		Double prevDistance = 6371000.0;
		int index = 0;
		for (ShopInfo shopInfo : shopInfoById.values()) {
			Double distance = SpringBootUtils.calDistance(Double.parseDouble(fromlat), Double.parseDouble(fromlng),
					shopInfo.getShopLatitude(), shopInfo.getShopLongitude());
			if (distance < prevDistance) {
				prevDistance = distance;
				index = Integer.parseInt(shopInfo.getShopId());
			}
		}
		return shopInfoById.get(index);
	}

}
