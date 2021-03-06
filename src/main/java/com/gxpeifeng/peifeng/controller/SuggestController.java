package com.gxpeifeng.peifeng.controller;

import com.alibaba.fastjson.JSONObject;
import com.gxpeifeng.peifeng.Po.Message;
import com.gxpeifeng.peifeng.service.MessageService;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/suggest")
public class SuggestController {
    @Autowired
    MessageService messageService;

    @PostMapping
    public String test(Message message) {
        String name = messageService.findByPhone(message.getPhone());
        String info;
        if (StringUtils.isEmpty(name)) {
            messageService.save(message);
            info = "提交成功";
        } else {
            info = "提交失败，您已经提交过了";
        }
        return info;
    }
}

