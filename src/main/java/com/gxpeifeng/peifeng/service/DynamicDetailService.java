package com.gxpeifeng.peifeng.service;

import com.gxpeifeng.peifeng.Po.DynamicDetail;
import com.gxpeifeng.peifeng.dao.DynamicDao;
import com.gxpeifeng.peifeng.dao.DynamicDetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DynamicDetailService {
    @Autowired
    private DynamicDetailDao dynamicDetailDao;
    public DynamicDetail findById(Integer id) {
        DynamicDetail dynamicDetail=dynamicDetailDao.findByid(id);
        dynamicDetailDao.saveByid(id,dynamicDetail.getPopularity()+1);
        return dynamicDetail;
    }
}
