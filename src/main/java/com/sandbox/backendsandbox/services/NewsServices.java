package com.sandbox.backendsandbox.services;

public interface NewsServices {

    String getStaticNews();

   String getNewsByEndPoint(String endPoint, String query);

    public String getNewsBySource(String endPoint, String category, String country);
}
