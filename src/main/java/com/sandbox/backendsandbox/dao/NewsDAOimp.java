package com.sandbox.backendsandbox.dao;

import com.sandbox.backendsandbox.api.NewsAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class NewsDAOimp implements NewsDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public String getNewsByEndPoint() {
        NewsAPI news = new NewsAPI();
        String newsJson = news.getNewsByEndPoint();
        return newsJson;
    }

    @Override
    public String getStaticNews() {
        NewsAPI news = new NewsAPI();
        String newsJson = news.getStaticNews();
        return newsJson;
    }
}
