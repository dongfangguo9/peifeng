package com.gxpeifeng.peifeng.Po;

import com.gxpeifeng.peifeng.utils.DateUtils;
import lombok.Data;

import java.util.Date;

@Data
public class DynamicDetail {
    Integer id;
    Date date;
    String content;
    String img;
    Integer popularity;
    String dateStr;

    public String getDateStr() {
         return DateUtils.date2String(this.date,"yyyy-MM-dd");
    }

}
