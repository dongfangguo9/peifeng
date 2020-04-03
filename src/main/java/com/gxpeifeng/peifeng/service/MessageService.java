package com.gxpeifeng.peifeng.service;

import com.gxpeifeng.peifeng.Po.Message;
import com.gxpeifeng.peifeng.dao.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    MessageDao messageDao;
    public void save(Message message) {
        messageDao.save(message);
    }

    public String findByPhone(String phone) {
        return messageDao.findByPhone(phone);
    }
}
