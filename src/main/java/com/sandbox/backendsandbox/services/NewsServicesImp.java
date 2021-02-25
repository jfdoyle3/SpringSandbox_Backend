package com.sandbox.backendsandbox.services;

import com.sandbox.backendsandbox.dao.NewsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NewsServicesImp implements NewsServices{

    @Autowired
    private NewsDAO newsDAO;

    @Transactional
    @Override
    public String getNewsByEndPoint(){
        return newsDAO.getNewsByEndPoint();
    }
    @Transactional
    @Override
    public String getStaticNews(){
        return newsDAO.getStaticNews();
    }


}
