package com.laikele.dao.entity.mapper;

import com.laikele.dao.entity.PromotionTipsExample;
import com.laikele.dao.entity.PromotionTipsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionTipsMapper {
    int countByExample(PromotionTipsExample example);

    int deleteByExample(PromotionTipsExample example);

    int deleteByPrimaryKey(PromotionTipsKey key);

    int insert(PromotionTipsKey record);

    int insertSelective(PromotionTipsKey record);

    List<PromotionTipsKey> selectByExample(PromotionTipsExample example);

    int updateByExampleSelective(@Param("record") PromotionTipsKey record, @Param("example") PromotionTipsExample example);

    int updateByExample(@Param("record") PromotionTipsKey record, @Param("example") PromotionTipsExample example);
}