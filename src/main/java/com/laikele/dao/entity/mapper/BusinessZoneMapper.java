package com.laikele.dao.entity.mapper;

import com.laikele.dao.entity.BusinessZone;
import com.laikele.dao.entity.BusinessZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessZoneMapper {
    int countByExample(BusinessZoneExample example);

    int deleteByExample(BusinessZoneExample example);

    int deleteByPrimaryKey(Long zoneId);

    int insert(BusinessZone record);

    int insertSelective(BusinessZone record);

    List<BusinessZone> selectByExample(BusinessZoneExample example);

    BusinessZone selectByPrimaryKey(Long zoneId);

    int updateByExampleSelective(@Param("record") BusinessZone record, @Param("example") BusinessZoneExample example);

    int updateByExample(@Param("record") BusinessZone record, @Param("example") BusinessZoneExample example);

    int updateByPrimaryKeySelective(BusinessZone record);

    int updateByPrimaryKey(BusinessZone record);
}