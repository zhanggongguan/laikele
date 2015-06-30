package com.laikele.dao.mapper;

import com.laikele.dao.entity.Promotion;
import com.laikele.dao.entity.PromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionMapper {
    int countByExample(PromotionExample example);

    int deleteByExample(PromotionExample example);

    int deleteByPrimaryKey(Long promotionId);

    int insert(Promotion record);

    int insertSelective(Promotion record);

    List<Promotion> selectByExample(PromotionExample example);

    Promotion selectByPrimaryKey(Long promotionId);

    int updateByExampleSelective(@Param("record") Promotion record, @Param("example") PromotionExample example);

    int updateByExample(@Param("record") Promotion record, @Param("example") PromotionExample example);

    int updateByPrimaryKeySelective(Promotion record);

    int updateByPrimaryKey(Promotion record);
}