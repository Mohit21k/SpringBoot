package com.db.demo.services;

import java.io.IOException;
import java.util.List;

import com.db.demo.model.ShopInfo;



public interface ShopInfoService {

	public List<ShopInfo> getShopDetails();
	public ShopInfo getShopInfo(Integer id);
	public void addShopDetails(ShopInfo shopInfo) throws IOException;
	public ShopInfo getShopDetails(String lat,String lng) throws IOException;
}
