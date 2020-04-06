package com.gxpeifeng.peifeng;

import com.github.pagehelper.PageInfo;
import com.gxpeifeng.peifeng.Po.DynamicList;
import com.gxpeifeng.peifeng.service.DynamicSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class InitController {
    @Autowired
    DynamicSevice dynamicSevice;

    @RequestMapping({"/", "", "/home", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }

    @RequestMapping("/show")
    public String show() {
        return "CaseShow";
    }

    @RequestMapping("/honor")
    public String honor() {
        return "Honor";
    }

    @RequestMapping("/dynamic")
    public String dynamic(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "size", required = true, defaultValue = "10") Integer size, Model model) {
        List<DynamicList> list = dynamicSevice.findAll(page,size);
        PageInfo pageInfo = new PageInfo(list);
        model.addAttribute("list",pageInfo);
        return "Dynamic";
    }

    @RequestMapping("/relation")
    public String relation() {
        return "Relation";
    }

    @RequestMapping("/suggest")
    public String suggest() {
        return "suggest";
    }
}

