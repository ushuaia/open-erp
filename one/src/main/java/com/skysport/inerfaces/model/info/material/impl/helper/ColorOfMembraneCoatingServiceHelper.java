package com.skysport.inerfaces.model.info.material.impl.helper;

import com.skysport.core.bean.SpringContextHolder;
import com.skysport.core.bean.system.SelectItem2;
import com.skysport.core.cache.SystemBaseInfoCachedMap;
import com.skysport.inerfaces.constant.WebConstants;
import com.skysport.inerfaces.model.info.material.impl.ColorOfMembraneCoatingServiceImpl;

import java.util.List;

/**
 * 类说明:
 * Created by zhangjh on 2015/7/7.
 */
public enum ColorOfMembraneCoatingServiceHelper {
    SINGLETONE;

    public void refreshSelect() {
        ColorOfMembraneCoatingServiceImpl colorOfMembraneCoatingService = SpringContextHolder.getBean("colorOfMembraneCoatingService");
        List<SelectItem2> comocItems = colorOfMembraneCoatingService.querySelectList(null);
        SystemBaseInfoCachedMap.SINGLETONE.pushBom(WebConstants.COMOCITEMS, comocItems);
    }
}
