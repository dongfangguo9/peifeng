package com.gxpeifeng.peifeng.dao;

import com.gxpeifeng.peifeng.Po.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface MessageDao {
    @Select("select name from t_message where phone=#{phone}")
    String findByPhone(String phone);
    @Insert("insert into t_message values(#{phone},#{name},#{context})")
    void save(Message message);
}
