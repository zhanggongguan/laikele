package com.laikele.dao.entity.mapper;

import com.laikele.dao.entity.PromotionEffect;
import com.laikele.dao.entity.PromotionEffectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionEffectMapper {
    int countByExample(PromotionEffectExample example);

    int deleteByExample(PromotionEffectExample example);

    int deleteByPrimaryKey(Long promotionEffectId);

    int insert(PromotionEffect record);

    int insertSelective(PromotionEffect record);

    List<PromotionEffect> selectByExample(PromotionEffectExample example);

    PromotionEffect selectByPrimaryKey(Long promotionEffectId);

    int updateByExampleSelective(@Param("record") PromotionEffect record, @Param("example") PromotionEffectExample example);

    int updateByExample(@Param("record") PromotionEffect record, @Param("example") PromotionEffectExample example);

    int updateByPrimaryKeySelective(PromotionEffect record);

    int updateByPrimaryKey(PromotionEffect record);
}