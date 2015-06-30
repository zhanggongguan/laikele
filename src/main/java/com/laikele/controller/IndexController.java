package com.laikele.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.laikele.dao.entity.Brand;
import com.laikele.dao.entity.Category;
import com.laikele.service.IndexService;

@Controller
public class IndexController {

	@Autowired
	private IndexService indexService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String queryForIndex(ModelMap model) {
		this.setLeftMenu(model);
		return "index";
	}

	/*** 初始化左侧菜单 start ***/

	private void setLeftMenu(ModelMap model) {
		Map<String, Category> categoryMap = this.initCategoryMap();
		for (Entry<String, Category> entry : categoryMap.entrySet()) {
			Category category = entry.getValue();
			setBrandModel(model, category.getCategoryId(), entry.getKey());
		}
	}

	private void setBrandModel(ModelMap model, long categoryID,
			String categoryName) {
		List<Brand> brands = indexService.selectBrandByCategory(categoryID);
		model.addAttribute(categoryName, brands);
	}

	private Map<String, Category> initCategoryMap() {
		Map<String, Category> categoryMap = new HashMap<String, Category>();
		categoryMap.put("nvzhuang", indexService.selectCategory(1l));
		/*
		 * categoryMap.put("nanzhuang", indexService.selectCategory(2l));
		 * categoryMap.put("huazhuangpin", indexService.selectCategory(3l));
		 * categoryMap.put("xiemaoxiangbao", indexService.selectCategory(4l));
		 * categoryMap.put("yundonghuwai", indexService.selectCategory(5l));
		 * categoryMap.put("shenghuochaoshi", indexService.selectCategory(6l));
		 */
		return categoryMap;
	}
	/*** 初始化左侧菜单 end ***/
}
