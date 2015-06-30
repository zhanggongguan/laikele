package com.laikele.dao.mapper;

import com.laikele.dao.entity.CommodityPromotionItem;
import com.laikele.dao.entity.CommodityPromotionItemExample;
import com.laikele.dao.entity.CommodityPromotionItemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityPromotionItemMapper {
    int countByExample(CommodityPromotionItemExample example);

    int deleteByExample(CommodityPromotionItemExample example);

    int deleteByPrimaryKey(CommodityPromotionItemKey key);

    int insert(CommodityPromotionItem record);

    int insertSelective(CommodityPromotionItem record);

    List<CommodityPromotionItem> selectByExample(CommodityPromotionItemExample example);

    CommodityPromotionItem selectByPrimaryKey(CommodityPromotionItemKey key);

    int updateByExampleSelective(@Param("record") CommodityPromotionItem record, @Param("example") CommodityPromotionItemExample example);

    int updateByExample(@Param("record") CommodityPromotionItem record, @Param("example") CommodityPromotionItemExample example);

    int updateByPrimaryKeySelective(CommodityPromotionItem record);

    int updateByPrimaryKey(CommodityPromotionItem record);
}