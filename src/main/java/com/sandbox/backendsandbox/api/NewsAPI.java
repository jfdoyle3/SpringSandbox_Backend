package com.sandbox.backendsandbox.api;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;

public class NewsAPI {

//    public static String getNews() {
//        HttpResponse<String> jsonStringResponse = Unirest.get("https://newsapi.org/v2/top-headlines")
//                .header("X-Api-Key", "2d95a43de732410b8467a2fa495f6e9c").queryString("country", "us").asString();
//
//       String json = jsonStringResponse.getBody();
//       System.out.println(json);
//    //   JSONArray newsJson = new JSONArray(json);
//    //   return newsJson;
//        return json;
//    }
    public static String getNews(String countryCode) {
        HttpResponse<String> jsonStringResponse = Unirest.get("https://newsapi.org/v2/top-headlines")
                .header("X-Api-Key", "2d95a43de732410b8467a2fa495f6e9c").queryString("country", countryCode).asString();

        String json = jsonStringResponse.getBody();
        System.out.println(json);
        //   JSONArray newsJson = new JSONArray(json);
        //   return newsJson;
        return json;
    }

}
