package com.sandbox.backendsandbox.dao;

import com.sandbox.backendsandbox.api.NewsAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class NewsDAOimp implements NewsDAO {

    @Autowired
    private EntityManager entityManager;

    public String getNewsBySource(String endPoint, String category,  String country){
    NewsAPI news = new NewsAPI();
    String newsJson = news.getNewsBySource(endPoint, category,  country);
        return newsJson;
}
    @Override
    public String getNewsByEndPoint(String endPoint, String query) {
        NewsAPI news = new NewsAPI();
        String newsJson = news.getNewsByEndPoint(endPoint, query);
        return newsJson;
    }

    @Override
    public String getStaticNews() {
        NewsAPI news = new NewsAPI();
        String newsJson = news.getStaticNews();
        return newsJson;
    }
}
