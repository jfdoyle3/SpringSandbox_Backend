package com.sandbox.backendsandbox.api;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;

public class NewsAPI {

    private final String apiKey="2d95a43de732410b8467a2fa495f6e9c";
    private final String apiUrl="https://newsapi.org/v2";
    private String endPoint="/top-headlines";
    private String countryCode="us";


    public  String getStaticNews() {
        HttpResponse<String> jsonStringResponse = Unirest.get("https://newsapi.org/v2/top-headlines")
                .header("X-Api-Key", "2d95a43de732410b8467a2fa495f6e9c").queryString("country", "us").asString();

       String json = jsonStringResponse.getBody();
        return json;
    }
    public String getNewsByEndPoint(){
        HttpResponse<String> jsonStringResponse = Unirest.get(apiUrl+endPoint)
                .header("X-Api-Key", apiKey)
                .queryString("country", countryCode).asString();

        String json = jsonStringResponse.getBody();
        return json;
    }
//    public static String getNewsSource(String source) {
//        HttpResponse<String> jsonStringResponse = Unirest.get("https://newsapi.org/v2/source")
//                .header("X-Api-Key", "2d95a43de732410b8467a2fa495f6e9c")
//                .queryString("source", source)
//                .asString();
//
//        String json = jsonStringResponse.getBody();
//        return json;
//    }

}
