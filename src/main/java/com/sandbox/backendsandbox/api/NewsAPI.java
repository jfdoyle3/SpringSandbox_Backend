package com.sandbox.backendsandbox.api;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;

public class NewsAPI {

    private final String apiKey="2d95a43de732410b8467a2fa495f6e9c";
    private final String apiUrl="https://newsapi.org/v2/";
 //   private String endPoint="         top-headlines";
  //  private String countryCode="us";


    public  String getStaticNews() {
        HttpResponse<String> jsonStringResponse = Unirest.get("https://newsapi.org/v2/top-headlines")
                .header("X-Api-Key", "2d95a43de732410b8467a2fa495f6e9c").queryString("country", "us").asString();

       String json = jsonStringResponse.getBody();
        return json;
    }
    public String getNewsByEndPoint(String endPoint, String query){
        HttpResponse<String> jsonStringResponse = Unirest.get(apiUrl+endPoint)
                .header("X-Api-Key", apiKey)
                .queryString("q", query).asString();

        String json = jsonStringResponse.getBody();
        return json;
    }

    public String getNewsBySource(String endPoint, String category, String country){
        HttpResponse<String> jsonStringResponse = Unirest.get(apiUrl+endPoint)
                .header("X-Api-Key", apiKey)
                .queryString("category", category)
                .queryString("country", country)
                .asString();

        String json = jsonStringResponse.getBody();
        return json;
    }

}
