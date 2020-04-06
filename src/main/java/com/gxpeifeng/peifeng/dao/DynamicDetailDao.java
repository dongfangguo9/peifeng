package com.gxpeifeng.peifeng.dao;

import com.gxpeifeng.peifeng.Po.DynamicDetail;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface DynamicDetailDao {
    @Select("select * from t_dynamic_details where id=#{id}")
    DynamicDetail findByid(Integer id);
    @Update("update t_dynamic_details set popularity=#{i} where id=#{id}")
    void saveByid(Integer id, int i);
}
