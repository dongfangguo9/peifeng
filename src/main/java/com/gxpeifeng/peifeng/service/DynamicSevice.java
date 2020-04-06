package com.gxpeifeng.peifeng.service;

import com.github.pagehelper.PageHelper;
import com.gxpeifeng.peifeng.Po.DynamicDetail;
import com.gxpeifeng.peifeng.Po.DynamicList;
import com.gxpeifeng.peifeng.dao.DynamicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicSevice {
    @Autowired
    DynamicDao dynamicDao;

    public List<DynamicList> findAll(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        return dynamicDao.findAll();
    }

}
