package com.gxpeifeng.peifeng.Po;

import com.alibaba.druid.support.monitor.annotation.MTable;
import com.gxpeifeng.peifeng.utils.DateUtils;
import lombok.Data;

import java.util.Date;
@Data
public class DynamicList {
    private Integer id;
    private Date date;
    private String tittle;
    private String content;
    private String dateStr1;
    private String dateStr2;

    public String getDateStr1() {
        dateStr1 = DateUtils.date2String(this.date, "yyyy-MM");
        return dateStr1;
    }
    public String getDateStr2() {
        dateStr2=DateUtils.date2String(this.date,"dd");
        return dateStr2;
    }
}
