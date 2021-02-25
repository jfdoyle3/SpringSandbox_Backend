package com.sandbox.backendsandbox.dao;

public interface NewsDAO {

    String getStaticNews();

    String getNewsByEndPoint(String endPoint, String query);

    public String getNewsBySource(String endPoint, String category,  String country);
}
