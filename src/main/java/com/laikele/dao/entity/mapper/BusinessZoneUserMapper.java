package com.laikele.dao.entity.mapper;

import com.laikele.dao.entity.BusinessZoneUserExample;
import com.laikele.dao.entity.BusinessZoneUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessZoneUserMapper {
    int countByExample(BusinessZoneUserExample example);

    int deleteByExample(BusinessZoneUserExample example);

    int deleteByPrimaryKey(BusinessZoneUserKey key);

    int insert(BusinessZoneUserKey record);

    int insertSelective(BusinessZoneUserKey record);

    List<BusinessZoneUserKey> selectByExample(BusinessZoneUserExample example);

    int updateByExampleSelective(@Param("record") BusinessZoneUserKey record, @Param("example") BusinessZoneUserExample example);

    int updateByExample(@Param("record") BusinessZoneUserKey record, @Param("example") BusinessZoneUserExample example);
}