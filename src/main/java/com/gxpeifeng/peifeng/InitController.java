package com.gxpeifeng.peifeng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitController {
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
    public String dynamic() {
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

