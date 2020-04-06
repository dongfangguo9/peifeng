package com.gxpeifeng.peifeng.dao;

import com.gxpeifeng.peifeng.Po.DynamicDetail;
import com.gxpeifeng.peifeng.Po.DynamicList;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DynamicDao {
    @Select("select * from t_dynamic")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "date",column = "dates"),
            @Result(property = "tittle",column = "tittle"),
            @Result(property = "content",column = "content")
           /* @Result(property = "dynamicDetail",column = "id",javaType = DynamicDetail.class,one=@One(select = "com.gxpeifeng.peifeng.dao.DynamicDetailDao.findByid"))*/
    })
    List<DynamicList> findAll();
}
