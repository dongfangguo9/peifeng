package com.gxpeifeng.peifeng.controller;

import com.gxpeifeng.peifeng.Po.DynamicDetail;
import com.gxpeifeng.peifeng.Po.DynamicList;
import com.gxpeifeng.peifeng.service.DynamicDetailService;
import com.gxpeifeng.peifeng.service.DynamicSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/dynamic")
public class DynamicController {

    @Autowired
    private DynamicDetailService dynamicDetailService;
    @RequestMapping("/dynamicDetail")
    public String Details(@RequestParam(value = "id", required=true)Integer id,@RequestParam("tittle")String tittle, Model model) {
       DynamicDetail dynamicDetail =dynamicDetailService.findById(id);
        Integer popularity = dynamicDetail.getPopularity();
        model.addAttribute("dynamicDetail",dynamicDetail);
        model.addAttribute("tittle",tittle);
        return "DynamicDetail";
    }
}
