package com.laikele.dao.entity.mapper;

import com.laikele.dao.entity.PromotionItem;
import com.laikele.dao.entity.PromotionItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionItemMapper {
    int countByExample(PromotionItemExample example);

    int deleteByExample(PromotionItemExample example);

    int deleteByPrimaryKey(Long promotionItemId);

    int insert(PromotionItem record);

    int insertSelective(PromotionItem record);

    List<PromotionItem> selectByExample(PromotionItemExample example);

    PromotionItem selectByPrimaryKey(Long promotionItemId);

    int updateByExampleSelective(@Param("record") PromotionItem record, @Param("example") PromotionItemExample example);

    int updateByExample(@Param("record") PromotionItem record, @Param("example") PromotionItemExample example);

    int updateByPrimaryKeySelective(PromotionItem record);

    int updateByPrimaryKey(PromotionItem record);
}