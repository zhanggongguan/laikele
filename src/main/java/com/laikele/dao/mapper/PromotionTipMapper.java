package com.laikele.dao.mapper;

import com.laikele.dao.entity.PromotionTip;
import com.laikele.dao.entity.PromotionTipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromotionTipMapper {
    int countByExample(PromotionTipExample example);

    int deleteByExample(PromotionTipExample example);

    int deleteByPrimaryKey(Long tipId);

    int insert(PromotionTip record);

    int insertSelective(PromotionTip record);

    List<PromotionTip> selectByExample(PromotionTipExample example);

    PromotionTip selectByPrimaryKey(Long tipId);

    int updateByExampleSelective(@Param("record") PromotionTip record, @Param("example") PromotionTipExample example);

    int updateByExample(@Param("record") PromotionTip record, @Param("example") PromotionTipExample example);

    int updateByPrimaryKeySelective(PromotionTip record);

    int updateByPrimaryKey(PromotionTip record);
}