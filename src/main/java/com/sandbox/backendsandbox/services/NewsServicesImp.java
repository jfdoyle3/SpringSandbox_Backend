package com.sandbox.backendsandbox.services;

import com.sandbox.backendsandbox.dao.NewsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NewsServicesImp implements NewsServices {

    @Autowired
    private NewsDAO newsDAO;

    @Transactional
    @Override
    public String getNewsBySource(String endPoint, String category, String country) {
        return newsDAO.getNewsBySource(endPoint, category,country);
    }

    @Transactional
    @Override
    public String getNewsByEndPoint(String endPoint, String query) {
        return newsDAO.getNewsByEndPoint(endPoint, query);
    }

    @Transactional
    @Override
    public String getStaticNews() {
        return newsDAO.getStaticNews();
    }


}
