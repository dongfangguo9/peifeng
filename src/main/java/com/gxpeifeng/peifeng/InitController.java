package com.gxpeifeng.peifeng;

import com.gxpeifeng.peifeng.Po.DynamicList;
import com.gxpeifeng.peifeng.service.DynamicSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String dynamic(Model model) {
        List<DynamicList> list = dynamicSevice.findAll();
        model.addAttribute("list",list);
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

