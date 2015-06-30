package com.laikele.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laikele.dao.entity.Brand;
import com.laikele.dao.entity.BrandExample;
import com.laikele.dao.entity.BusinessZone;
import com.laikele.dao.entity.BusinessZoneExample;
import com.laikele.dao.entity.Category;
import com.laikele.dao.entity.CategoryExample;
import com.laikele.dao.entity.Promotion;
import com.laikele.dao.entity.PromotionExample;
import com.laikele.dao.entity.PromotionExample.Criteria;
import com.laikele.dao.entity.PromotionItem;
import com.laikele.dao.entity.PromotionItemExample;
import com.laikele.dao.entity.Store;
import com.laikele.dao.entity.StoreExample;
import com.laikele.dao.mapper.BrandMapper;
import com.laikele.dao.mapper.BusinessZoneMapper;
import com.laikele.dao.mapper.CategoryMapper;
import com.laikele.dao.mapper.PromotionItemMapper;
import com.laikele.dao.mapper.PromotionMapper;
import com.laikele.dao.mapper.StoreMapper;

@Service("indexService")
public class IndexService {

	private static final byte COMMON_BYTE_ONE = 1;

	@Autowired
	private StoreMapper storeMapper;

	@Autowired
	private BrandMapper brandMapper;

	@Autowired
	private CategoryMapper categoryMapper;

	@Autowired
	private PromotionMapper promotionMapper;

	@Autowired
	private BusinessZoneMapper businessZoneMapper;

	@Autowired
	private PromotionItemMapper promotionItemMapper;

	public List<Category> selectCategory() {
		CategoryExample example = new CategoryExample();
		com.laikele.dao.entity.CategoryExample.Criteria criteria = example
				.createCriteria();
		criteria.andActiveEqualTo(COMMON_BYTE_ONE);
		return categoryMapper.selectByExample(example);
	}

	public Category selectCategory(long categoryID) {
		System.out.println("---" + categoryID);
		return categoryMapper.selectByPrimaryKey(categoryID);
	}

	public List<Brand> selectBrandByCategory(long categoryID) {
		BrandExample example = new BrandExample();
		com.laikele.dao.entity.BrandExample.Criteria criteria = example
				.createCriteria();
		criteria.andCategoryIdEqualTo(categoryID);
		return brandMapper.selectByExample(example);
	}

	public List<Promotion> selectPromotionByZone(long zoneID) {
		PromotionExample example = new PromotionExample();
		com.laikele.dao.entity.PromotionExample.Criteria criteria = example
				.createCriteria();
		criteria.andZoneIdEqualTo(zoneID);

		return promotionMapper.selectByExample(example);
	}

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

	public List<Store> selectAllValidStoreByZone(long zoneID) {
		StoreExample example = new StoreExample();
		com.laikele.dao.entity.StoreExample.Criteria criteria = example
				.createCriteria();
		criteria.andZoneIdEqualTo(zoneID);
		return storeMapper.selectByExample(example);
	}

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

	public List<Store> selectTopOneStoreByCategoryCity(long cityID,
			long categoryID) {
		List<BusinessZone> zones = this.selectBusinessZoneByCity(cityID);
		List<Long> zoneIDs = new ArrayList<Long>();
		for (BusinessZone zone : zones) {
			zoneIDs.add(zone.getZoneId());
		}
		List<Brand> brands = this.selectBrandByCategory(categoryID);
		List<Long> brandIDs = new ArrayList<Long>();
		for (Brand brand : brands) {
			brandIDs.add(brand.getBrandId());
		}

		StoreExample example = new StoreExample();
		com.laikele.dao.entity.StoreExample.Criteria criteria = example
				.createCriteria();
		criteria.andZoneIdIn(zoneIDs);
		criteria.andBrandIdIn(brandIDs);
		return storeMapper.selectByExample(example);
	}

	public List<Store> selectTopOneStoreByCategoryZone(long zoneID,
			long categoryID) {
		List<Brand> brands = this.selectBrandByCategory(categoryID);
		List<Long> brandIDs = new ArrayList<Long>();
		for (Brand brand : brands) {
			brandIDs.add(brand.getBrandId());
		}

		StoreExample example = new StoreExample();
		com.laikele.dao.entity.StoreExample.Criteria criteria = example
				.createCriteria();
		criteria.andZoneIdEqualTo(zoneID);
		criteria.andBrandIdIn(brandIDs);
		return storeMapper.selectByExample(example);
	}

	public List<PromotionItem> selectGroupPromotionItemByZone(long zoneID) {
		PromotionExample pExample = new PromotionExample();
		Criteria pCriteria = pExample.createCriteria();
		pCriteria.andZoneIdEqualTo(zoneID);
		List<Promotion> promos = promotionMapper.selectByExample(pExample);
		List<Long> promoIDs = new ArrayList<Long>();
		for (Promotion promo : promos) {
			promoIDs.add(promo.getPromotionId());
		}

		PromotionItemExample example = new PromotionItemExample();
		com.laikele.dao.entity.PromotionItemExample.Criteria criteria = example
				.createCriteria();
		criteria.andPromotionIdIn(promoIDs);
		return promotionItemMapper.selectByExample(example);
	}

	public List<PromotionItem> selectGroupPromotionItemByCity(long cityID) {
		List<BusinessZone> zones = this.selectBusinessZoneByCity(cityID);
		List<Long> zoneIDs = new ArrayList<Long>();
		for (BusinessZone zone : zones) {
			zoneIDs.add(zone.getZoneId());
		}
		PromotionExample pExample = new PromotionExample();
		Criteria pCriteria = pExample.createCriteria();
		pCriteria.andZoneIdIn(zoneIDs);
		List<Promotion> promos = promotionMapper.selectByExample(pExample);
		List<Long> promoIDs = new ArrayList<Long>();
		for (Promotion promo : promos) {
			promoIDs.add(promo.getPromotionId());
		}

		PromotionItemExample example = new PromotionItemExample();
		com.laikele.dao.entity.PromotionItemExample.Criteria criteria = example
				.createCriteria();
		criteria.andPromotionIdIn(promoIDs);
		return promotionItemMapper.selectByExample(example);
	}

	public List<PromotionItem> selectPromotionItemByZone(long zoneID, long type) {
		PromotionExample pExample = new PromotionExample();
		Criteria pCriteria = pExample.createCriteria();
		pCriteria.andZoneIdEqualTo(zoneID);
		List<Promotion> promos = promotionMapper.selectByExample(pExample);
		List<Long> promoIDs = new ArrayList<Long>();
		for (Promotion promo : promos) {
			promoIDs.add(promo.getPromotionId());
		}

		PromotionItemExample example = new PromotionItemExample();
		com.laikele.dao.entity.PromotionItemExample.Criteria criteria = example
				.createCriteria();
		criteria.andPromotionIdIn(promoIDs);
		criteria.andPromotionTypeIdEqualTo(type);
		return promotionItemMapper.selectByExample(example);
	}

	public List<PromotionItem> selectPromotionItemByCity(long cityID, long type) {
		List<BusinessZone> zones = this.selectBusinessZoneByCity(cityID);
		List<Long> zoneIDs = new ArrayList<Long>();
		for (BusinessZone zone : zones) {
			zoneIDs.add(zone.getZoneId());
		}
		PromotionExample pExample = new PromotionExample();
		Criteria pCriteria = pExample.createCriteria();
		pCriteria.andZoneIdIn(zoneIDs);
		List<Promotion> promos = promotionMapper.selectByExample(pExample);
		List<Long> promoIDs = new ArrayList<Long>();
		for (Promotion promo : promos) {
			promoIDs.add(promo.getPromotionId());
		}

		PromotionItemExample example = new PromotionItemExample();
		com.laikele.dao.entity.PromotionItemExample.Criteria criteria = example
				.createCriteria();
		criteria.andPromotionIdIn(promoIDs);
		criteria.andPromotionTypeIdEqualTo(type);
		return promotionItemMapper.selectByExample(example);
	}

	public List<Promotion> selectPromotionByStore(long storeID) {
		PromotionExample example = new PromotionExample();
		Criteria criteria = example.createCriteria();
		criteria.andStoreIdEqualTo(storeID);

		return promotionMapper.selectByExample(example);
	}

	public List<BusinessZone> selectBusinessZoneByCity(long cityID) {
		BusinessZoneExample example = new BusinessZoneExample();
		com.laikele.dao.entity.BusinessZoneExample.Criteria criteria = example
				.createCriteria();
		criteria.andCityIdEqualTo(cityID);
		return businessZoneMapper.selectByExample(example);
	}

}
