package com.lwj.poi.service.impl;

import com.lwj.poi.entity.Poi;
import com.lwj.poi.mapper.PoiMapper;
import com.lwj.poi.service.PoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "poiServiceImpl")
public class PoiServiceImpl implements PoiService {
    @Autowired
    private PoiMapper poiMapper;
    @Override
    public List<Poi> select() {
        return poiMapper.select();
    }
}
