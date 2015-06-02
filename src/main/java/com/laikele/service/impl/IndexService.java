package com.laikele.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.laikele.dao.entity.Brand;
import com.laikele.dao.entity.BrandExample;
import com.laikele.dao.entity.BusinessZone;
import com.laikele.dao.entity.Category;
import com.laikele.dao.entity.CategoryExample;
import com.laikele.dao.entity.Promotion;
import com.laikele.dao.entity.PromotionExample;
import com.laikele.dao.entity.PromotionExample.Criteria;
import com.laikele.dao.entity.PromotionItem;
import com.laikele.dao.entity.PromotionItemExample;
import com.laikele.dao.entity.Store;
import com.laikele.dao.entity.StoreExample;
import com.laikele.dao.entity.mapper.BrandMapper;
import com.laikele.dao.entity.mapper.BusinessZoneMapper;
import com.laikele.dao.entity.mapper.CategoryMapper;
import com.laikele.dao.entity.mapper.PromotionItemMapper;
import com.laikele.dao.entity.mapper.PromotionMapper;
import com.laikele.dao.entity.mapper.StoreMapper;
import com.laikele.service.IIndexService;

public class IndexService implements IIndexService {

	private static final byte COMMON_BYTE_ONE = 1;
	@Autowired
	private StoreMapper storeMapper;
	private BrandMapper brandMapper;
	private CategoryMapper categoryMapper;
	private PromotionMapper promotionMapper;
	private BusinessZoneMapper businessZoneMapper;
	private PromotionItemMapper promotionItemMapper;

	@Override
	public List<Category> selectCategory() {
		CategoryExample example = new CategoryExample();
		com.laikele.dao.entity.CategoryExample.Criteria criteria = example
				.createCriteria();
		criteria.andActiveEqualTo(COMMON_BYTE_ONE);
		return categoryMapper.selectByExample(example);
	}

	@Override
	public List<Brand> selectBrandByCategory(long categoryID) {
		BrandExample example = new BrandExample();
		com.laikele.dao.entity.BrandExample.Criteria criteria = example
				.createCriteria();
		criteria.andCategoryIdEqualTo(categoryID);
		return brandMapper.selectByExample(example);
	}

	@Override
	public List<Promotion> selectPromotionByZone(long zoneID) {
		PromotionExample example = new PromotionExample();
		com.laikele.dao.entity.PromotionExample.Criteria criteria = example
				.createCriteria();
		criteria.andZoneIdEqualTo(zoneID);

		return promotionMapper.selectByExample(example);
	}

	@Override
	public List<PromotionItem> selectPromotionItemByZone(long zoneID) {
		List<Promotion> promotions = this.selectPromotionByZone(zoneID);
		List<Long> promos = new ArrayList<Long>();
		for (Promotion promotion : promotions) {
			promos.add(promotion.getPromotionId());
		}
		PromotionItemExample example = new PromotionItemExample();
		com.laikele.dao.entity.PromotionItemExample.Criteria criteria = example
				.createCriteria();
		criteria.andPromotionIdIn(promos);
		return promotionItemMapper.selectByExample(example);
	}

	@Override
	public List<PromotionItem> selectPromotionItemByStore(long storeID) {
		List<Promotion> promotions = this.selectPromotionByStore(storeID);
		List<Long> promos = new ArrayList<Long>();
		for (Promotion promotion : promotions) {
			promos.add(promotion.getPromotionId());
		}
		PromotionItemExample example = new PromotionItemExample();
		com.laikele.dao.entity.PromotionItemExample.Criteria criteria = example
				.createCriteria();
		criteria.andPromotionIdIn(promos);
		return promotionItemMapper.selectByExample(example);
	}

	@Override
	public List<PromotionItem> selectPromotionItemByCity(long cityID) {
		List<BusinessZone> businessZones = this
				.selectBusinessZoneByCity(cityID);
		List<Long> zoneIDs = new ArrayList<Long>();
		for (BusinessZone zone : businessZones) {
			zoneIDs.add(zone.getZoneId());
		}

		PromotionExample pExample = new PromotionExample();
		Criteria pCriteria = pExample.createCriteria();
		pCriteria.andZoneIdIn(zoneIDs);
		List<Promotion> promotions = promotionMapper.selectByExample(pExample);
		List<Long> promos = new ArrayList<Long>();
		for (Promotion promotion : promotions) {
			promos.add(promotion.getPromotionId());
		}

		PromotionItemExample example = new PromotionItemExample();
		com.laikele.dao.entity.PromotionItemExample.Criteria criteria = example
				.createCriteria();
		criteria.andPromotionIdIn(promos);
		return promotionItemMapper.selectByExample(example);
	}

	@Override
	public List<PromotionItem> selectRollingPromotionItem(long zoneID) {
		PromotionExample pExample = new PromotionExample();
		Criteria pCriteria = pExample.createCriteria();
		pCriteria.andZoneIdEqualTo(zoneID);
		List<Promotion> promotions = promotionMapper.selectByExample(pExample);
		List<Long> promos = new ArrayList<Long>();
		for (Promotion promotion : promotions) {
			promos.add(promotion.getPromotionId());
		}

		PromotionItemExample example = new PromotionItemExample();
		com.laikele.dao.entity.PromotionItemExample.Criteria criteria = example
				.createCriteria();
		criteria.andPromotionIdIn(promos);
		return promotionItemMapper.selectByExample(example);
	}

	@Override
	public List<Store> selectAllValidStoreByCity(long cityID) {
		List<BusinessZone> businessZones = this
				.selectBusinessZoneByCity(cityID);
		List<Long> zoneIDs = new ArrayList<Long>();
		for (BusinessZone zone : businessZones) {
			zoneIDs.add(zone.getZoneId());
		}

		StoreExample example = new StoreExample();
		com.laikele.dao.entity.StoreExample.Criteria criteria = example
				.createCriteria();
		criteria.andZoneIdIn(zoneIDs);
		return storeMapper.selectByExample(example);
	}

	@Override
	public List<Store> selectAllValidStoreByZone(long zoneID) {
		StoreExample example = new StoreExample();
		com.laikele.dao.entity.StoreExample.Criteria criteria = example
				.createCriteria();
		criteria.andZoneIdEqualTo(zoneID);
		return storeMapper.selectByExample(example);
	}

	@Override
	public List<Brand> selectTopBrandByCity(long cityID, long categoryID) {
		List<Store> stores = this.selectAllValidStoreByCity(cityID);
		List<Long> brandIDs = new ArrayList<Long>();
		for (Store store : stores) {
			brandIDs.add(store.getBrandId());
		}

		BrandExample example = new BrandExample();
		com.laikele.dao.entity.BrandExample.Criteria criteria = example
				.createCriteria();
		criteria.andBrandIdIn(brandIDs);
		criteria.andCategoryIdEqualTo(categoryID);
		return brandMapper.selectByExample(example);
	}

	@Override
	public List<Brand> selectTopBrandByZone(long zoneID, long categoryID) {
		List<Store> stores = this.selectAllValidStoreByZone(zoneID);
		List<Long> brandIDs = new ArrayList<Long>();
		for (Store store : stores) {
			brandIDs.add(store.getBrandId());
		}

		BrandExample example = new BrandExample();
		com.laikele.dao.entity.BrandExample.Criteria criteria = example
				.createCriteria();
		criteria.andBrandIdIn(brandIDs);
		criteria.andCategoryIdEqualTo(categoryID);
		return brandMapper.selectByExample(example);
	}

	@Override
	public List<Store> selectTopOneStoreByCategoryCity(long cityID,
			long categoryID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Store> selectTopOneStoreByCategoryZone(long zoneID,
			long categoryID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PromotionItem> selectGroupPromotionItemByZone(long zoneID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PromotionItem> selectGroupPromotionItemByCity(long cityID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PromotionItem> selectPromotionItemByZone(long zongID, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PromotionItem> selectPromotionItemByCity(long cityID, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Promotion> selectPromotionByStore(long storeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BusinessZone> selectBusinessZoneByCity(long cityID) {
		// TODO Auto-generated method stub
		return null;
	}

}
