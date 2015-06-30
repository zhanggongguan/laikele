package com.laikele.service;

import java.util.List;

import com.laikele.dao.entity.Brand;
import com.laikele.dao.entity.BusinessZone;
import com.laikele.dao.entity.Category;
import com.laikele.dao.entity.Promotion;
import com.laikele.dao.entity.PromotionItem;
import com.laikele.dao.entity.Store;

public interface IIndexService {
	// 获取左侧顶级菜单内容
	public List<Category> selectCategory();

	public Category selectCategory(long categoryID);

	// 依据类目ID，获取相关品牌内容
	public List<Brand> selectBrandByCategory(long categoryID);

	public List<Promotion> selectPromotionByZone(long zoneID);

	public List<Promotion> selectPromotionByStore(long storeID);

	// 依据商圈获取推广列表 用于滚动图片下端位置
	public List<PromotionItem> selectPromotionItemByZone(long zoneID);

	// 依据城市ID获取推广列表 用于滚动图片下端位置
	public List<PromotionItem> selectPromotionItemByStore(long storeID);

	// 依据城市ID获取滚动图片推广列表，用于图片滚动
	public List<PromotionItem> selectPromotionItemByCity(long cityID);

	// 依据商圈ID获取滚动图片推广列表，用于滚动图片
	public List<PromotionItem> selectRollingPromotionItem(long zoneID);

	public List<Store> selectAllValidStoreByCity(long cityID);

	public List<Store> selectAllValidStoreByZone(long zoneID);

	public List<Brand> selectTopBrandByCity(long cityID, long categoryID);

	public List<Brand> selectTopBrandByZone(long zoneID, long vategoryID);

	// 主区域四个类目查询块
	public List<Store> selectTopOneStoreByCategoryCity(long cityID,
			long categoryID);

	public List<Store> selectTopOneStoreByCategoryZone(long zoneID,
			long categoryID);

	// 获取团购信息
	public List<PromotionItem> selectGroupPromotionItemByZone(long zoneID);

	public List<PromotionItem> selectGroupPromotionItemByCity(long cityID);

	public List<PromotionItem> selectPromotionItemByZone(long zongID, long type);

	public List<PromotionItem> selectPromotionItemByCity(long cityID, long type);

	public List<BusinessZone> selectBusinessZoneByCity(long cityID);
}
