package com.laikele.dao.entity.mapper;

import com.laikele.dao.entity.Place;
import com.laikele.dao.entity.PlaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceMapper {
    int countByExample(PlaceExample example);

    int deleteByExample(PlaceExample example);

    int deleteByPrimaryKey(Long placeId);

    int insert(Place record);

    int insertSelective(Place record);

    List<Place> selectByExample(PlaceExample example);

    Place selectByPrimaryKey(Long placeId);

    int updateByExampleSelective(@Param("record") Place record, @Param("example") PlaceExample example);

    int updateByExample(@Param("record") Place record, @Param("example") PlaceExample example);

    int updateByPrimaryKeySelective(Place record);

    int updateByPrimaryKey(Place record);
}