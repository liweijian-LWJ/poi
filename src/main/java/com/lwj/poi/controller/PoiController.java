package com.lwj.poi.controller;

import com.lwj.poi.entity.Poi;
import com.lwj.poi.service.PoiService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/poi")
public class PoiController {

    @Autowired
    @Qualifier(value = "poiServiceImpl")
    PoiService poiServiceImpl;

    @ApiOperation(value = "导出")
    @RequestMapping(value = "/export", method = RequestMethod.GET)
    @ResponseBody
    public List<Poi> export() {
        List<Poi> list = poiServiceImpl.select();
        return list;
    }
}
