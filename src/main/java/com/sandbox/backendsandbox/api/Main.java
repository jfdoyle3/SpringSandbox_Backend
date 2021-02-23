package com.sandbox.backendsandbox.api;

public class Main {
    public static void main(String[] args) {

        String newsJson=NewsAPI.getNews();
        System.out.println(newsJson);
    }
}
