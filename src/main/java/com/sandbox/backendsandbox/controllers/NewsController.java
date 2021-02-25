package com.sandbox.backendsandbox.controllers;


import com.sandbox.backendsandbox.api.NewsAPI;
import com.sandbox.backendsandbox.services.NewsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @Autowired
    private NewsServices newsServices;

    @GetMapping("/staticNews")
    public String getStaticNews(){
        return newsServices.getStaticNews();
    }

    @GetMapping("/newsEndPoint")
    public String getNewsByEndPoint(){
        return newsServices.getNewsByEndPoint();
    }
//    @GetMapping("/news/{endPoint}{country}")
//    public String getNewsByCountry(@PathVariable String endPoint, @RequestParam(value="country") String country){
//        return newsServices.getNewsByCountry(endPoint, country);
//    }

//    @GetMapping("/news")
//        public String getNews(){
//            String newsJson= NewsAPI.getNews();
//            return newsJson;
//        }
//        @GetMapping("/news/{country}")
//    public String getNews(@PathVariable String country){
//        String newsJson= NewsAPI.getNews(country);
//        return newsJson;
//    }
//    @GetMapping("/news")
//    public String getNews(@RequestParam(value="country") String country){
//     //   String newsJson= NewsAPI.getNews(country);
//    /    return newsJson;
//    }
//    @GetMapping("/source")
//    public String getSource(@RequestParam(value="source") String source ){
//     //   String newsJson= NewsAPI.getNewsSource(source);
//        return newsJson;
//    }




}
