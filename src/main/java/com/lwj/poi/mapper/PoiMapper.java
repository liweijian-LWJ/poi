package com.lwj.poi.mapper;

import com.lwj.poi.entity.Poi;

import java.util.List;

public interface PoiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Poi record);

    int insertSelective(Poi record);

    Poi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Poi record);

    int updateByPrimaryKey(Poi record);

    List<Poi> select();
}